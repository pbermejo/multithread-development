package com.pbermejo.boletin6;

public class Ejercicio4Sincronizado extends Thread{

    private Ejercicio4ListadoCompartido listado;

    public Ejercicio4Sincronizado(Ejercicio4ListadoCompartido listado) {
        this.listado = listado;
    }

    @Override
    public void run() {
        listado.mostrar();
    }
}
