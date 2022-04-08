package com.pbermejo.boletin7.ejercicio4;

public class Productor extends Thread{
    private Compartido cola;
    private long retardo;

    public Productor(String name, Compartido cola, long retardo) {
        super(name);
        this.retardo = retardo;
        this.cola = cola;
    }

    public void ponerEnCompartido(String s){
        cola.poner(s);
    }

    public void mostrarCompartido(){
        System.out.println("\t > Cola (" + this.getName() + "): " + cola.getCola());
    }

    @Override
    public void run() {
        for(;;){
            try{
                Thread.sleep(retardo);
            } catch (InterruptedException e){
                System.out.println("Excepción en productor");
            }
            ponerEnCompartido(this.getName());
            System.out.println("Productor " + this.getName() + " escribe " + this.getName());
            mostrarCompartido();
        }
    }
}
