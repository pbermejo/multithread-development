package com.pbermejo.boletin7.ejercicio1;

import com.pbermejo.boletin7.ConsumidorBase;

public class Consumidor extends ConsumidorBase {
    private Compartido cola;

    public Consumidor(String name, Compartido cola, long retardo) {
        super(name, retardo);
        this.cola = cola;
    }

    public int quitarDeCompartido(){
        return cola.quitar();
    }

    public void mostrarCompartido(){
        System.out.println("\t > Cola (" + this.getName() + "): " + cola.getCola());
    }
}
