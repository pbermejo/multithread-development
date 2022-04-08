package com.pbermejo.boletin6;

import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio2Saldo{
    private int saldo;
    private final long MAX_RETARDO = 1000L;

    public Ejercicio2Saldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextLong(MAX_RETARDO));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return saldo;
    }

    public void setSaldo(int saldo) {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextLong(MAX_RETARDO));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.saldo = saldo;
    }

    public synchronized void incrementaSaldo(int cantidad){
        String nombre = Thread.currentThread().getName();
        System.out.println(nombre + " va a añadir " + cantidad + ". (SALDO " + getSaldo() + ")");
        setSaldo(getSaldo() + cantidad);
        System.out.println(nombre + " añadió " + cantidad + ". (SALDO " + getSaldo() + ")");
    }
}
