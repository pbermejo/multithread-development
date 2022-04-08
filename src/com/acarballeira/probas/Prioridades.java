package com.acarballeira.probas;

public class Prioridades extends Thread{

    private int contador = 0;
    private boolean stopHilo = false;

    public Prioridades(String nome) {
        super(nome);
    }

    public int getContador() {
        return contador;
    }

    public void pararHilo() {
        this.stopHilo = true;
    }

    public void run() {
        while(!this.stopHilo) {
            try {
                Thread.sleep(5);
            }catch(Exception e) {}
            this.contador++;
        }
        System.out.println("Fin de fío: " + this.getName());
    }

    public static void main(String[] args) throws InterruptedException {

        Prioridades h1 = new Prioridades("Hilo 1");
        Prioridades h2 = new Prioridades("Hilo 2");
        Prioridades h3 = new Prioridades("Hilo 3");

        h1.setPriority(Thread.NORM_PRIORITY);
        h2.setPriority(Thread.MAX_PRIORITY);
        h3.setPriority(Thread.MIN_PRIORITY);

        h1.start();
        h2.start();
        h3.start();

        try {
            Thread.sleep(10000);
        }catch(InterruptedException e) {}

        h1.pararHilo();
        h2.pararHilo();
        h3.pararHilo();

        h1.join();
        h2.join();
        h3.join();

        System.out.println("Prioridad máxima de " + h2.getName() + "-" + h2.getPriority() + ": " + h2.getContador());
        System.out.println("Prioridad Normal de " + h1.getName() + "-" + h1.getPriority() + ": " + h1.getContador());
        System.out.println("Prioridad mínima de " + h3.getName() + "-" + h3.getPriority() + ": " + h3.getContador());
    }
}
