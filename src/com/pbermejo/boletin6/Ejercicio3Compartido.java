package com.pbermejo.boletin6;

public class Ejercicio3Compartido {
    public synchronized void mostrar(String mensaje){
        System.out.println("En marcha! " + mensaje);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("LLegué! " + mensaje);
    }
}
