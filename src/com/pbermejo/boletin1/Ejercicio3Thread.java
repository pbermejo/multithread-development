package com.pbermejo.boletin1;

public class Ejercicio3Thread extends Thread{
    private static int contador = 0;


    public Ejercicio3Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(++contador + " " + this.getName());
        }
    }

    public static void main(String[] args) {
        Ejercicio3Thread hiloA = new Ejercicio3Thread("SI");
        Ejercicio3Thread hiloB = new Ejercicio3Thread("NO");
        hiloA.start();
        hiloB.start();
    }
}
