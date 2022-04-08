package com.pbermejo.boletin7.ejercicio5;

public class Puerta {
    private boolean estaOcupada = false;

    public synchronized void liberarPuerta(){
        this.estaOcupada = false;
        notifyAll();
    }

    public synchronized boolean intentarEntrar(){
        if(this.estaOcupada){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("libre");
        estaOcupada = true;
        notifyAll();
        return !estaOcupada;
    }
}
