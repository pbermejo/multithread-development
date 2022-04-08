package com.pbermejo.boletin7.ejercicio6;

public class App {
    private static final int NUM_JUGADORES = 5;

    public static void main(String[] args) {
        Arbitro arbitro = new Arbitro(NUM_JUGADORES);
        for (int i = 0; i < NUM_JUGADORES; i++) {
            Jugador jugador = new Jugador(i, arbitro);
            jugador.start();
        }
    }
}
