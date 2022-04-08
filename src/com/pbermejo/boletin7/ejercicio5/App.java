package com.pbermejo.boletin7.ejercicio5;

import java.util.ArrayList;

public class App {

    private static final int NUM_CLIENTES = 500;
    private static final int MAX_INTENTOS = 10;
    private static final int UNIDADES_ALMACEN = 50;

    public static void main(String[] args) {
        Puerta puerta = new Puerta();
        Almacen almacen = new Almacen(UNIDADES_ALMACEN);
        ArrayList<Thread>clientes = new ArrayList<>();

        for (int i = 0; i < NUM_CLIENTES; i++) {
            Thread cliente = new Thread(new Cliente("P"+i, puerta, almacen, MAX_INTENTOS));
            cliente.start();
            clientes.add(cliente);
        }

        for (Thread cliente : clientes){
            try {
                cliente.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(almacen.getUnidades());
    }
}
