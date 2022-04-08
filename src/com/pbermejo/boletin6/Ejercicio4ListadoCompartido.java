package com.pbermejo.boletin6;

public class Ejercicio4ListadoCompartido {

    public synchronized void mostrar(){
        System.out.println("\nEsta es mi salida: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }
    }
}
