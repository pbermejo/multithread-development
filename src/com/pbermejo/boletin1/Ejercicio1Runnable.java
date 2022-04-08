package com.pbermejo.boletin1;

public class Ejercicio1Runnable implements Runnable{

    private static final int NUM_ITERACIONES = 30000;

    @Override
    public void run() {
        for (int i = 0; i < NUM_ITERACIONES; i++) {
            System.out.print("NO ");
        }
    }

    public static void main(String[] args) {

        Ejercicio1Runnable ejercicio1 = new Ejercicio1Runnable();
        Thread hilo = new Thread(ejercicio1);
        hilo.start();

        for (int i = 0; i < NUM_ITERACIONES; i++) {
            System.out.print("YES ");
        }
    }
}
