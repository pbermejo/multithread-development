package com.pbermejo.boletin6;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2App {


    public static void main(String[] args) {
        Ejercicio2Saldo ejercicio2Saldo = new Ejercicio2Saldo(100);
        int MAX_MOVIMIENTO = 100;
        String[] personas = {"Luisa", "Pepe", "María", "Carlos", "Juan", "Ángela", "Luisa", "Pepe", "María", "Carlos", "Juan", "Ángela"};
        ArrayList<Ejercicio2MovimientosSaldo> movimientos = new ArrayList<>();
        Random r = new Random();

        /**
         * Se crea un hilo por cada movimiento que hacen las personas del array. La cantidad a incrementar es aleatoria
         */
        for (String persona : personas) {
            Ejercicio2MovimientosSaldo movimiento = new Ejercicio2MovimientosSaldo(persona, ejercicio2Saldo, r.nextInt(MAX_MOVIMIENTO));
            movimientos.add(movimiento);
            movimiento.start();
        }

        for (Ejercicio2MovimientosSaldo movimiento : movimientos){
            try {
                movimiento.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Saldo final: " + ejercicio2Saldo.getSaldo());
    }
}
