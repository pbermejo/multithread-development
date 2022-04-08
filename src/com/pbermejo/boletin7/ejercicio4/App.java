package com.pbermejo.boletin7.ejercicio4;

public class App {
    private static final int RETARDO_PRODUCTOR = 300;
    private static final int RETARDO_CONSUMIDOR = 600;

    public static void main(String[] args) {
        Compartido cola = new Compartido();
        Productor ping = new Productor("PING", cola, RETARDO_PRODUCTOR);
        Productor pong = new Productor("PONG", cola, RETARDO_PRODUCTOR);
        Consumidor c = new Consumidor("C1", cola, RETARDO_CONSUMIDOR);

        ping.start();
        pong.start();
        c.start();
    }
}
