package com.pbermejo.boletin7.ejercicio3;

import com.pbermejo.boletin7.ConsumidorBase;

public class Consumidor extends ConsumidorBase {
    private Compartido pila;

    public Consumidor(String name, Compartido pila, long retardo) {
        super(name, retardo);
        this.pila = pila;
    }

    public int quitarDeCompartido(){
        return pila.quitar();
    }

    public void mostrarCompartido(){
        System.out.println("\t > Cola (" + this.getName() + "): " + pila.getPila());
    }
}
