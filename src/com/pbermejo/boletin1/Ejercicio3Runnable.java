package com.pbermejo.boletin1;

public class Ejercicio3Runnable implements Runnable{
    private static int contador = 0;
    private String nombre;

    public Ejercicio3Runnable(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(++contador + ": " + nombre + "\t");
        }
    }

    public static void main(String[] args) {
        Thread hiloA = new Thread(new Ejercicio3Runnable("SI"));
        Thread hiloB = new Thread(new Ejercicio3Runnable("NO"));
        hiloA.start();
        hiloB.start();
    }
}
