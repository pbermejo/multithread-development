package com.pbermejo.boletin6;

public class Ejercicio3App {
    public static void main(String[] args) {
        Ejercicio3Compartido compartido = new Ejercicio3Compartido();

        Ejercicio3Sincronizado dibujo1 = new Ejercicio3Sincronizado("Caperucita", compartido);
        Ejercicio3Sincronizado dibujo2 = new Ejercicio3Sincronizado("Blancanieves", compartido);
        Ejercicio3Sincronizado dibujo3 = new Ejercicio3Sincronizado("Pinocho", compartido);
        Ejercicio3Sincronizado dibujo4 = new Ejercicio3Sincronizado("Pulgarcito", compartido);

        dibujo1.start();
        dibujo2.start();
        dibujo3.start();
        dibujo4.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hemos terminado!");
    }
}
