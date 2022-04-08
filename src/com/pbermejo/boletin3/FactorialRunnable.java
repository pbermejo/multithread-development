package com.pbermejo.boletin3;

public class FactorialRunnable implements Runnable {
    private int num;
    private int factorial = 1;

    public FactorialRunnable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Comienza FactorialThread");
        for (int i = 1; i <= this.num; i++) {
            this.factorial *= i;
        }
        muestraFactorial();
        System.out.println("FIN FactorialThread");
    }

    public void muestraFactorial(){
        System.out.println(String.format("El factorial de %s es: %s", this.num, this.factorial));
    }
}
