package com.pbermejo.boletin7.ejercicio6;

import java.util.Random;

public class Arbitro {
    private int numIncognito;
    private int numJugadores;
    private int turno;
    private boolean finJuego = false;
    private Random aleat = new Random();

    public Arbitro(int numJugadores) {
        this.numJugadores = numJugadores;
        this.numIncognito = aleat.nextInt(10) + 1;
        this.turno = 0;
    }

    public int devolverTurno(){
        return turno;
    }

    public boolean acabaJuego(){
        return finJuego;
    }

    public synchronized void compruebaJugada(int idJugador, int jugada){
        System.out.println("Jugador " + idJugador + " juega " + jugada);
        if(numIncognito != jugada){
            turno++;
            if(turno == numJugadores){
                turno = 0;
            }
            notifyAll();
        } else{
            finJuego = true;
            System.out.println(numIncognito + ". Número acertado!");
            System.out.println("Ganó el jugador " + idJugador);
            System.out.println("FIN DE JUEGO");
            System.exit(0);
        }
    }
}
