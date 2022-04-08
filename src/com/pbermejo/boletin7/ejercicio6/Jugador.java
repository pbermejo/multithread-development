package com.pbermejo.boletin7.ejercicio6;

import java.util.Random;

public class Jugador extends Thread{

    private Arbitro arbitro;
    private int id;
    private Random aleat = new Random();

    public Jugador(int id, Arbitro arbitro) {
        this.id = id;
        this.arbitro = arbitro;
    }

    @Override
    public void run() {
        while(!arbitro.acabaJuego()){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(id == arbitro.devolverTurno()){
                arbitro.compruebaJugada(id, aleat.nextInt(10) + 1);
            }
        }
    }
}
