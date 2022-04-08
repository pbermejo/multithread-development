package com.pbermejo.boletin6;

public class Ejercicio5BienvenidaCompartido {

    private static boolean claseEmpezada = false;

    public synchronized void saludarProfesor(String mensaje){
        notify();
        try {
            while(!claseEmpezada){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(mensaje);
        notify();
    }

    public synchronized void llegadaProfesor(String mensaje){
        System.out.println(mensaje);
        notifyAll();
        claseEmpezada = true;
    }
}
