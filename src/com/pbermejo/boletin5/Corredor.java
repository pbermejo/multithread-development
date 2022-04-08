package com.pbermejo.boletin5;

public class Corredor extends Thread{

    private int contador;
    private boolean stopHilo = false;

    public Corredor(String nome, int contador) {
        super(nome);
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void stopHilo(){
        this.stopHilo = true;
    }

    @Override
    public void run() {
        while(!this.stopHilo){
            this.contador++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + ": " + getContador());
        }
        System.out.println(getName() + " contó " + getContador());
    }
}
