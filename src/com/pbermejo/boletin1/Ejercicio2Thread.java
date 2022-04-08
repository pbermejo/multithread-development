package com.pbermejo.boletin1;

public class Ejercicio2Thread extends Thread{

    private static final int NUM_ITERACIONES = 300;
    private static String mensaje;
    private int numIteraciones;

    public Ejercicio2Thread(String nombre, String mensaje) {
        super(nombre);
        this.mensaje = mensaje;
        this.numIteraciones = NUM_ITERACIONES;
    }

    @Override
    public void run() {
        System.out.println("\nEjecución en " + this.getName());
        for (int i = 0; i < this.numIteraciones; i++) {
            System.out.print(mensaje);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Ejecución en main");
        Ejercicio2Thread hiloA = new Ejercicio2Thread("Hilo A", "NO");
        Ejercicio2Thread hiloB = new Ejercicio2Thread("Hilo B", "YES");
        hiloA.start();
        hiloB.start();

        for (int i = 0; i < NUM_ITERACIONES; i++) {
            System.out.print("MAIN ");
        }
    }
}
