package com.pbermejo.boletin2;

public class Ejercicio4 implements Runnable{

    private static final int NUM_ITERACIONES = 20;

    @Override
    public void run() {
        for (int i = 0; i < NUM_ITERACIONES; i++) {
            System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        Thread hilo = new Thread(new Ejercicio4());
        hilo.setName("hilo 1");
        System.out.println("Todavía no se ha iniciado el hilo: " + hilo.getName());
        hilo.start();

        while(hilo.isAlive()){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n" + hilo.getName() + " finalizó");
        System.out.println("Fin de main");
    }
}
