package com.acarballeira.productorconsumidor;

public class Consumidor extends Thread {
    private Cola cola;
    private long retardo;

    public Consumidor(String name, Cola cola, long retardo) {
        super(name);
        this.cola = cola;
        this.retardo = retardo;
    }

    @Override
    public void run() {

        int n;

        for(;;){
            try{
                Thread.sleep(retardo);
            } catch (InterruptedException e){
                System.out.println("Excepción en consumidor");
            }

            n = cola.quitar();

            System.out.println("Consumidor " + this.getName() + " consume " + n);
            System.out.println("Cola: " + cola.getCola());
        }
    }
}
