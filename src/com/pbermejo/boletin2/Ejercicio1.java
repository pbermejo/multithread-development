package com.pbermejo.boletin2;

public class Ejercicio1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Estado en ejecución: " + Thread.currentThread().getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread hilo = new Thread(new Ejercicio1());
        System.out.println("Estado antes de ejecutarse: " + hilo.getState());
        hilo.start();

        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Estado después de ejecutarse " + hilo.getState());
    }
}
