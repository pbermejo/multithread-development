package com.pbermejo.boletin7.ejercicio4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Compartido {
    private LinkedList<String> cola;
    private final static int MAX_ELEMENTS = 5;

    public Compartido() {
        this.cola = new LinkedList<>();
    }

    public Queue<String> getCola() {
        return cola;
    }

    public synchronized void poner(String s){
        while(cola.size() >= MAX_ELEMENTS){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cola.offer(s);
        notifyAll();
    }

    public synchronized String quitar(){
        while (cola.isEmpty()){
            try {
                wait();
            } catch (InterruptedException | IllegalMonitorStateException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        return cola.poll();
    }
}
