package com.pbermejo.boletin3;

public class Ejercicio1Runnable {
    public static void main(String[] args) {
        Thread fibonacci = new Thread(new FibonacciRunnable(7));
        Thread factorial = new Thread(new FactorialRunnable(16));
        fibonacci.start();
        factorial.start();
        try{
            fibonacci.join();
            factorial.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("FIN de main");
    }
}
