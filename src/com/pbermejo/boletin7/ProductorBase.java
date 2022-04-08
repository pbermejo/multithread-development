package com.pbermejo.boletin7;

import java.util.Random;

public class ProductorBase extends Thread implements ProductorInterface{
    private int nmax;
    private long retardo;

    public ProductorBase(String name, long retardo, int nmax) {
        super(name);
        this.nmax = nmax;
        this.retardo = retardo;
    }

    public void ponerEnCompartido(int n){

    }

    public void mostrarCompartido(){

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
            ponerEnCompartido(n);
            System.out.println("Productor " + this.getName() + " escribe " + n);
            mostrarCompartido();
        }
    }
}
