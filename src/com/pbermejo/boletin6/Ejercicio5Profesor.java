package com.pbermejo.boletin6;

public class Ejercicio5Profesor extends Thread{
    private Ejercicio5BienvenidaCompartido bienvenida;

    public Ejercicio5Profesor(String name, Ejercicio5BienvenidaCompartido bienvenida) {
        super(name);
        this.bienvenida = bienvenida;
    }

    @Override
    public void run() {
        System.out.println("Llegó el profesor " + this.getName());
        bienvenida.llegadaProfesor("Buenos días alumnos. Mi nombre es " + this.getName());
    }
}
