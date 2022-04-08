package com.pbermejo.boletin6;

public class Ejercicio4App {
    public static void main(String[] args) {
        Ejercicio4ListadoCompartido listado = new Ejercicio4ListadoCompartido();

        Ejercicio4Sincronizado primero = new Ejercicio4Sincronizado(listado);
        Ejercicio4Sincronizado segundo = new Ejercicio4Sincronizado(listado);

        primero.start();
        segundo.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nYa terminé");
    }
}
