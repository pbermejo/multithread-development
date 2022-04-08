package com.pbermejo.boletin6;

import java.util.ArrayList;

public class Ejercicio1App {
    private static final int NUM_HILOS = 5;

    public static void main(String[] args) {
        Ejercicio1Contador contador = new Ejercicio1Contador();
        ArrayList<Thread> hilos = new ArrayList<>();

        for (int i = 0; i < NUM_HILOS; i++) {
            Thread hilo = new Thread(new Ejercicio1Hilo(contador));
            hilo.start();
            hilos.add(hilo);
        }

        for (Thread hilo: hilos){
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(contador.getContador());
    }
}
