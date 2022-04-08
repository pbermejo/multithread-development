package com.acarballeira.probas;

public class Lanzador {
    public static void main(String[] args) {
        Thread.currentThread().setName("hilo main");

        Proba01 hilo1 = new Proba01("hilo 1", 50);
        Proba01 hilo2 = new Proba01("hilo 2", 5);
        Proba01 hilo3 = new Proba01("hilo 3", 78);
        System.out.println("Lanzamos los hilos");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin de " + Thread.currentThread().getName());
    }
}
