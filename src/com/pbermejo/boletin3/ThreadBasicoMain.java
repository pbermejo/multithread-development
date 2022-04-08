package com.pbermejo.boletin3;

public class ThreadBasicoMain {
    public static void main(String[] args) {
        Thread threadBasico1 = new Thread(new ThreadBasico("Estamos perdidos"));
        Thread threadBasico2 = new Thread(new ThreadBasico("Desta vai"));
        threadBasico1.start();
        threadBasico2.start();
        // OJO bucle infinito!
    }
}
