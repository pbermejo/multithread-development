package com.acarballeira.productorconsumidor;

import java.util.Random;

public class Productor extends Thread{
    private Cola cola;
    private int nmax;
    private long retardo;

    public Productor(String name, Cola cola, long retardo, int nmax) {
        super(name);
        this.cola = cola;
        this.nmax = nmax;
        this.retardo = retardo;
    }

    @Override
    public void run() {
        Random aleat = new Random();
        int n;

        for(;;){
            try{
                Thread.sleep(retardo);
            } catch (InterruptedException e){
                System.out.println("Excepción en productor");
            }
            n = aleat.nextInt(nmax + 1);

            cola.poner(n);

            System.out.println("Productor " + this.getName() + " produce " + n);
            System.out.println("Cola: " + cola.getCola());
        }
    }
}
