package com.pbermejo.boletin1;

public class Ejercicio2Runnable implements Runnable{
    private static final int NUM_ITERACIONES = 300;
    private static String mensaje;
    private int numIteraciones;

    public Ejercicio2Runnable(String nombre, String mensaje, int numIteraciones) {
        Thread.currentThread().setName(nombre);
        this.mensaje = mensaje;
        this.numIteraciones = numIteraciones;
    }

    @Override
    public void run() {
        System.out.println("\nEjecución en " +  Thread.currentThread().getName());
        for (int i = 0; i < this.numIteraciones; i++) {
            System.out.print("NO ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Ejecución en main");
        Thread hiloA = new Thread(new Ejercicio2Runnable("Hilo A", "NO", NUM_ITERACIONES));
        Thread hiloB = new Thread(new Ejercicio2Runnable("Hilo B", "YES", NUM_ITERACIONES));
        hiloA.start();
        hiloB.start();

        for (int i = 0; i < NUM_ITERACIONES; i++) {
            System.out.print("YES ");
        }
    }
}
