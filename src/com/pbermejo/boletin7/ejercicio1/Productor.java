package com.pbermejo.boletin7.ejercicio1;

import com.pbermejo.boletin7.ProductorBase;

public class Productor extends ProductorBase {
    private Compartido cola;

    public Productor(String name, Compartido cola, long retardo, int nmax) {
        super(name, retardo, nmax);
        this.cola = cola;
    }

    public void ponerEnCompartido(int n){
        cola.poner(n);
    }

    public void mostrarCompartido(){
        System.out.println("\t > Cola (" + this.getName() + "): " + cola.getCola());
    }
}
