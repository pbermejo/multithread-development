package com.acarballeira.probas;

public class Proba02 implements Runnable{

    private static final int NUM_THREADS = 3;
    private String nombre;

    public Proba02(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(nombre);
        System.out.printf("En %s\n", Thread.currentThread().getName());
        System.out.printf("\tPrioridad: %s\n", Thread.currentThread().getPriority());
        System.out.printf("\tID: %s\n", Thread.currentThread().getId());
        System.out.printf("\tHilos activos: %s\n", Thread.currentThread().activeCount());
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("Principal");
        System.out.println(Thread.currentThread().toString());
        /*
        Proba02 obj1 = new Proba02();
        Thread hilo1 = new Thread(obj1);
        hilo1.start();
        */
        // new Thread(new Proba02).start();

        Proba02 objeto = null;
        Thread hilo = null;
        for (int i = 0; i < NUM_THREADS; i++) {
            objeto = new Proba02("Hilo " + i);
            hilo = new Thread(objeto);
            hilo.start();
            System.out.println("Información de " + hilo.getName() + ": " + hilo.toString());
        }
    }
}
