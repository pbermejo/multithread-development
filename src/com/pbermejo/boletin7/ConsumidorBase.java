package com.pbermejo.boletin7;

public class ConsumidorBase extends Thread implements ConsumidorInterface{
    private long retardo;

    public ConsumidorBase(String name, long retardo) {
        super(name);
        this.retardo = retardo;
    }

    public int quitarDeCompartido(){
        return -1;
    }

    public void mostrarCompartido(){}

    @Override
    public void run() {

        int n;

        for(;;){
            try{
                Thread.sleep(retardo);
            } catch (InterruptedException e){
                System.out.println("Excepción en consumidor");
            }
            n = quitarDeCompartido();
            System.out.println("Consumidor " + this.getName() + " lee " + n);
            mostrarCompartido();
        }
    }
}
