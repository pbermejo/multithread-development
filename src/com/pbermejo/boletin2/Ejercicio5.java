package com.pbermejo.boletin2;

public class Ejercicio5 implements Runnable {
    private static final int NUM_ITERACIONES = 20;

    @Override
    public void run() {
        for (int i = 0; i < NUM_ITERACIONES; i++) {
            System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Ejercicio5());
        Thread hilo2 = new Thread(new Ejercicio5());
        hilo1.setName("hilo 1");
        hilo2.setName("hilo 2");
        System.out.println("Todavía no se han iniciado los hilos");

        hilo1.start();
        try{
            hilo1.join();
            System.out.println("\n" + hilo1.getName() + " finalizó");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo2.start();
        try{
            hilo2.join();
            System.out.println("\n" + hilo2.getName() + " finalizó");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fin de main");
    }
}
