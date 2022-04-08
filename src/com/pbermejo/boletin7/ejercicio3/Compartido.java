package com.pbermejo.boletin7.ejercicio3;

import java.util.Stack;

public class Compartido {
    private Stack<Integer> pila;
    private final static int MAX_ELEMENTS = 5;

    public Compartido() {
        this.pila = new Stack<>();
    }

    public Stack<Integer> getPila() {
        return pila;
    }

    public synchronized void poner(int n){
        while(pila.size() >= MAX_ELEMENTS){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pila.push(n);
        notifyAll();
    }

    public synchronized int quitar(){
        while (pila.isEmpty()){
            try {
                wait();
            } catch (InterruptedException | IllegalMonitorStateException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        return pila.pop();
    }
}
