package com.pbermejo.boletin2;

public class Ejercicio3 implements Runnable {
    private static final int TIEMPO = 2;

    @Override
    public void run() {

        System.out.println(String.format("El %s se está ejecutando", Thread.currentThread().getName()));
        try{
            Thread.sleep(TIEMPO);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Iniciando hilos");
        Thread hilo1 = new Thread(new Ejercicio3());
        hilo1.setName("hilo 1");
        hilo1.start();
        System.out.println(String.format("Prioridad %s: %s", hilo1.getName(), hilo1.getPriority()));
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin de " + hilo1.getName());
        System.out.println("Fin de main");
    }
}
