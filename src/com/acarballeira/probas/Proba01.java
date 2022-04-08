package com.acarballeira.probas;

public class Proba01 extends Thread{

    private int numIter;

    public Proba01(String nombre, int numIter) {
        super(nombre);
        this.numIter = numIter;
    }

    public void run(){
        System.out.println("Empieza " + this.getName());
        for (int i = 0; i < this.numIter; i++) {
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("En " + this.getName() + ": " + i);
        }
        System.out.println("Finaliza " + this.getName());
    }
}
