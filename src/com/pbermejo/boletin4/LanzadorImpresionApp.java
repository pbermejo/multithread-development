package com.pbermejo.boletin4;

public class LanzadorImpresionApp {
    /**
     * Dada la clase TareaImprimir, modificar su comportamiento declarando dos propiedades
     * estáticas de nombre inicio y fin dándoles valores en el constructor. El método run tiene que
     * escribir los números comprendidos entre inicio y fin. A continuación se muestra una salida
     * de la ejecución del programa LanzadorImpresionApp.
     * @param args
     */
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new TareaImprimir("Tarea 1", 4, 9));
        Thread hilo2 = new Thread(new TareaImprimir("Tarea 2", 3, 11));
        Thread hilo3 = new Thread(new TareaImprimir("Tarea 3", 2, 14));

        System.out.println("Subprocesos creados, iniciando hilos");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        System.out.println("Tareas iniciadas, main terminado");
    }
}
