package com.pbermejo.boletin7.ejercicio5;

public class Almacen {
    private int unidades;

    public Almacen(int unidades) {
        this.unidades = unidades;
    }

    public int getUnidades() {
        return unidades;
    }

    public boolean cogerProducto(){
        if (0 == unidades){
            return false;
        }
        unidades--;
        return true;
    }
}
