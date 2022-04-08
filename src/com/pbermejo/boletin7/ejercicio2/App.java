package com.pbermejo.boletin7.ejercicio2;

import com.pbermejo.boletin7.ejercicio1.Compartido;
import com.pbermejo.boletin7.ejercicio1.Consumidor;
import com.pbermejo.boletin7.ejercicio1.Productor;

public class App {
    private static final int RETARDO_PRODUCTOR = 300;
    private static final int RETARDO_CONSUMIDOR = 600;

    public static void main(String[] args) {
        Compartido cola = new Compartido();
        Productor p = new Productor("P1", cola, RETARDO_PRODUCTOR, 100);
        Consumidor c1 = new Consumidor("C1", cola, RETARDO_CONSUMIDOR);
        Consumidor c2 = new Consumidor("C2", cola, RETARDO_CONSUMIDOR);

        p.start();
        c1.start();
        c2.start();
    }
}
