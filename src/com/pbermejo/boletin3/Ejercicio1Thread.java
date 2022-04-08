package com.pbermejo.boletin3;

public class Ejercicio1Thread {
    public static void main(String[] args) {
        FibonacciThread fibonacci = new FibonacciThread(7);
        FactorialThread factorial = new FactorialThread(16);
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
