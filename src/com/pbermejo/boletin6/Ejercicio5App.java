package com.pbermejo.boletin6;

import java.util.ArrayList;

public class Ejercicio5App {
    public static void main(String[] args) {
        Ejercicio5BienvenidaCompartido bienvenida = new Ejercicio5BienvenidaCompartido();

        String[] alumnos = {"Silvia", "Xurxo", "Sonia", "Claudia", "Ánxela", "Marela"};
        String profesor = "Don Pantuflo";
        ArrayList<Thread> personas = new ArrayList<>();

        for (String alumno : alumnos){
            personas.add(new Ejercicio5Alumno(alumno, bienvenida));
        }
        personas.add(new Ejercicio5Profesor(profesor, bienvenida));

        for(Thread persona : personas){
            persona.start();
        }
    }
}
