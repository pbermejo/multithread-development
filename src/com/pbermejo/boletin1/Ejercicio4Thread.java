package com.pbermejo.boletin1;

public class Ejercicio4Thread extends Thread{
    private int inicio;
    private int fin;

    public Ejercicio4Thread(int inicio, int fin, String nombre) {
        super(nombre);
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        System.out.println("Empieza el hilo " + this.getName());
        for (int i = inicio; i < fin; i++) {
            System.out.println(this.getName() + ": " + i);
        }
        System.out.println("Fin del hilo " + this.getName());
    }

    public static void main(String[] args) {
        System.out.println("Vamos a iniciar los dos threads");
        Ejercicio4Thread hilo1 = new Ejercicio4Thread(1, 10, "hilo 1");
        Ejercicio4Thread hilo2 = new Ejercicio4Thread(20, 30, "hilo 2");
        System.out.println("Hilos inicializados");
        hilo1.start();
        hilo2.start();
        System.out.println("Fin de main");
    }
}
