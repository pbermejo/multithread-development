package com.acarballeira.productorconsumidor;

public class ProductorConsumidorApp {

    private static final long RETARDO_PRODUCTOR = 300L;
    private static final long RETARDO_CONSUMIDOR = 600L;

    public static void main(String[] args) {
        Cola cola = new Cola();

        Productor p = new Productor("P1", cola, RETARDO_PRODUCTOR, 10);
        Consumidor c = new Consumidor("C1", cola, RETARDO_CONSUMIDOR);

        p.start();
        c.start();
    }
}
