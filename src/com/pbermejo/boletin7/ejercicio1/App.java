package com.pbermejo.boletin7.ejercicio1;

public class App {
    private static final int RETARDO_PRODUCTOR = 300;
    private static final int RETARDO_CONSUMIDOR = 600;

    public static void main(String[] args) {
        Compartido cola = new Compartido();
        Productor p = new Productor("P1", cola, RETARDO_PRODUCTOR, 100);
        Consumidor c = new Consumidor("C1", cola, RETARDO_CONSUMIDOR);

        p.start();
        c.start();
    }
}
