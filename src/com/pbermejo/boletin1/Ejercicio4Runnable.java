package com.pbermejo.boletin1;

public class Ejercicio4Runnable implements Runnable {
    private int inicio;
    private int fin;
    private String nombre;

    public Ejercicio4Runnable(int inicio, int fin, String nombre) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Empieza el hilo " + this.nombre);
        for (int i = inicio; i < fin; i++) {
            System.out.println(this.nombre + ": " + i);
        }
        System.out.println("Fin del hilo " + this.nombre);
    }

    public static void main(String[] args) {
        System.out.println("Vamos a iniciar los dos threads");
        Thread hilo1 = new Thread(new Ejercicio4Runnable(1, 10, "hilo 1"));
        Thread hilo2 = new Thread(new Ejercicio4Runnable(20, 30, "hilo 2"));
        System.out.println("Hilos inicializados");
        hilo1.start();
        hilo2.start();
        System.out.println("Fin de main");
    }
}
