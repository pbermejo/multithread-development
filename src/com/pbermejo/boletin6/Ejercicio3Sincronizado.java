package com.pbermejo.boletin6;

public class Ejercicio3Sincronizado extends Thread{
    private Ejercicio3Compartido compartido;

    public Ejercicio3Sincronizado(String name, Ejercicio3Compartido compartido) {
        super(name);
        this.compartido = compartido;
    }

    @Override
    public void run() {
//        synchronized (compartido){
            compartido.mostrar(this.getName());
//        }
    }
}
