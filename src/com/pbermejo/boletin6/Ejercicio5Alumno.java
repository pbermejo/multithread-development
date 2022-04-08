package com.pbermejo.boletin6;

public class Ejercicio5Alumno extends Thread{
    private Ejercicio5BienvenidaCompartido bienvenida;

    public Ejercicio5Alumno(String name, Ejercicio5BienvenidaCompartido bienvenida) {
        super(name);
        this.bienvenida = bienvenida;
    }

    @Override
    public void run() {
        System.out.println("Llegó el alumno " + this.getName());
        bienvenida.saludarProfesor("(" + this.getName() + ") - Buenos días profesor");
    }
}
