package com.acarballeira.probas;

import javax.swing.*;

public class ParadaIncompleta implements Runnable{

    private boolean stopHilo = false;

    @Override
    public void run() {
        while(!stopHilo){
            System.out.println("En el hilo...");
        }
    }

    public void pararHilo() {
        this.stopHilo = true;
    }

    public static void main(String[] args) throws InterruptedException {
        ParadaIncompleta objeto = new ParadaIncompleta();
        Thread hilo = new Thread(objeto);
        hilo.start();
        //Thread.sleep(1);
        for (int i = 0; i < 9999999; i++);
        objeto.pararHilo();
        for (int i = 0; i < 9999999; i++);
        System.out.println(hilo.getState());
    }
}
