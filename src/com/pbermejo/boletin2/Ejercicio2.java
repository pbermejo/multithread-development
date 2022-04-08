package com.pbermejo.boletin2;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 implements Runnable{

    private static final int MAX = 10000;
    private static Random aleat = new Random();

    @Override
    public void run() {
        long tiempo = (long)aleat.nextDouble() * MAX;
        System.out.println(String.format("El %s va a dormir durante %s ms", Thread.currentThread().getName(), tiempo));
        try{
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ya despertó");
    }

    public static void main(String[] args) {
        System.out.println("Iniciando hilos");
        Thread hilo1 = new Thread(new Ejercicio2());
        Thread hilo2 = new Thread(new Ejercicio2());
        Thread hilo3 = new Thread(new Ejercicio2());
        hilo1.setName("hilo 1");
        hilo2.setName("hilo 2");
        hilo3.setName("hilo 3");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin de " + hilo1.getName());
        System.out.println("Fin de main");
    }
}
