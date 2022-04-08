package com.pbermejo.boletin3;

public class FibonacciThread extends Thread{
    private int num;
    private int fibonacci = 1;

    public FibonacciThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Comienza FibonacciThread");
        for (int i = 0; i < this.num; i++) {
            this.fibonacci += i;
        }
        muestraFibonacci();
        System.out.println("FIN FibonacciThread");
    }

    public void muestraFibonacci(){
        System.out.println(String.format("El fibonacci de %s es: %s", this.num, this.fibonacci));
    }
}
