package com.pbermejo.boletin4;

import java.util.Random;

public class TareaImprimir implements Runnable{
    private final int tiempoInactividad;
    private final String nombreTarea;
    private final static Random generador = new Random();
    private static int inicio;
    private static int fin;

    public TareaImprimir(String nombreTarea, int i, int f) {
        this.nombreTarea = nombreTarea;
        this.tiempoInactividad = this.generador.nextInt(2000);
        inicio = i;
        fin = f;
    }

    @Override
    public void run() {
        try{
            System.out.printf("%s va a estar inactivo durante %d milisegundos. \n", nombreTarea, tiempoInactividad);
            for (int i = inicio; i < fin; i++) {
                System.out.printf("%s escribe: %d \n", nombreTarea, i);
                Thread.sleep(tiempoInactividad);
            }
        } catch (InterruptedException e){
            System.out.printf("%s %s \n", nombreTarea, " terminó de forma prematura");
        }
    }
}
