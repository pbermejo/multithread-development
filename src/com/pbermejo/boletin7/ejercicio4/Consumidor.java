package com.pbermejo.boletin7.ejercicio4;

public class Consumidor extends Thread{
    Compartido cola;
    private long retardo;

    public Consumidor(String name, Compartido cola, long retardo) {
        super(name);
        this.retardo = retardo;
        this.cola = cola;
    }

    public String quitarDeCompartido(){
        return cola.quitar();
    }

    public void mostrarCompartido(){
        System.out.println("\t > Cola (" + this.getName() + "): " + cola.getCola());
    }

    @Override
    public void run() {

        String s;

        for(;;){
            try{
                Thread.sleep(retardo);
            } catch (InterruptedException e){
                System.out.println("Excepción en consumidor");
            }
            s = quitarDeCompartido();
            System.out.println("Consumidor " + this.getName() + " lee " + s);
            //mostrarCompartido();
        }
    }
}
