package com.pbermejo.boletin6;

public class Ejercicio2MovimientosSaldo extends Thread{
    private Ejercicio2Saldo ejercicio2Saldo;
    private int cantidad;

    public Ejercicio2MovimientosSaldo(String name, Ejercicio2Saldo ejercicio2Saldo, int cantidad) {
        super(name);
        this.ejercicio2Saldo = ejercicio2Saldo;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        ejercicio2Saldo.incrementaSaldo(cantidad);
    }
}
