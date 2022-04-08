package com.pbermejo.boletin1;

public class Ejercicio1Thread extends Thread{

    private static final int NUM_ITERACIONES = 30;

    @Override
    public void run() {
        for (int i = 0; i < NUM_ITERACIONES; i++) {
            System.out.print("NO ");
        }
    }

    public static void main(String[] args) {

        Ejercicio1Thread hilo = new Ejercicio1Thread();
        hilo.start();

        for (int i = 0; i < NUM_ITERACIONES; i++) {
            System.out.print("YES ");
        }
    }
}
