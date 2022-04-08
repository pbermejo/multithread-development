package com.acarballeira.productorconsumidor;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    private Queue<Integer> cola;
    private final static int MAX_ELEMENTS = 5;

    public Cola() {
        this.cola = new LinkedList<>();
    }

    public Queue<Integer> getCola() {
        return cola;
    }

    public synchronized void poner(int n){
        while(cola.size() >= MAX_ELEMENTS){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cola.offer(n);
        notifyAll();
    }

    public synchronized int quitar(){
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
