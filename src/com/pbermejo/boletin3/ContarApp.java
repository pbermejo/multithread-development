package com.pbermejo.boletin3;

public class ContarApp {
    public static void main(String[] args) {
        ContarThread contarThread1 = new ContarThread(10, "Hilo 1");
        contarThread1.start();
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ContarThread contarThread2 = new ContarThread(10, "Hilo 2");
        contarThread2.start();

        while(contarThread1.isAlive() && contarThread2.isAlive()){
            try{
                System.out.println("Sigo contando");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }

        System.out.println("FIN de main");
    }
}
