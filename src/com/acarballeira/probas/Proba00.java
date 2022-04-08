package com.acarballeira.probas;

public class Proba00 extends Thread {
    private int numIter;

    public Proba00(String nombre, int numIter) {
        super(nombre);
        this.numIter = numIter;
    }

    public void run(){
        System.out.println("Empieza " + this.getName());
        for (int i = 0; i < this.numIter; i++) {
            System.out.println("En " + this.getName() + ": " + i);
        }
        System.out.println("Finaliza " + this.getName());
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("hilo main");

        Proba00 hilo1 = new Proba00("hilo 1", 50);
        Proba00 hilo2 = new Proba00("hilo 2", 5);
        Proba00 hilo3 = new Proba00("hilo 3", 78);
        System.out.println("Lanzamos los hilos");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        System.out.println("Fin de " + Thread.currentThread().getName());
    }
}
