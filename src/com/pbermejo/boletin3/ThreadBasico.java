package com.pbermejo.boletin3;

import java.util.Random;

public class ThreadBasico implements Runnable{

    private String frase;
    private Random aleatorio;

    public ThreadBasico(String frase) {
        this.frase = frase;
        this.aleatorio = new Random();
    }

    @Override
    public void run() {
        while (true){
            System.out.println(this.frase);
            try {
                Thread.sleep((long)Math.abs(this.aleatorio.nextInt())%1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
