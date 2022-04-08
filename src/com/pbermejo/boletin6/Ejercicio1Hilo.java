package com.pbermejo.boletin6;

public class Ejercicio1Hilo implements Runnable{
    private static final int ITERACIONES = 5000;
    private Ejercicio1Contador contador;

    public Ejercicio1Hilo(Ejercicio1Contador contador) {
        this.contador = contador;
    }

    /**
     * No sincronizado
     */

    /**
     * Sincronizado
     */
    @Override
    public void run() {
        synchronized (contador){
            for (int i = 0; i < ITERACIONES; i++) {
                contador.incrementar();
            }
        }
    }
}
