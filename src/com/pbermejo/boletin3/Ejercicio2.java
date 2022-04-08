package com.pbermejo.boletin3;

import java.util.ArrayList;

public class Ejercicio2 {
    private static final int INICIO = 5;
    private static final int FIN = 14;

    private static ArrayList<Thread> hilos = new ArrayList<>();

    private static void crearHilos(){
        for (int i = INICIO; i <= FIN; i++) {
            hilos.add(new Thread(new FactorialRunnableModificado(i)));
        }
    }

    private static void lanzarHilos(){
        for (Thread hilo : hilos){
            hilo.start();
        }
    }

    private static void pararHilos(){
        for (Thread hilo : hilos){
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        crearHilos();
        lanzarHilos();
        pararHilos();
        System.out.println("FIN main");
    }
}
