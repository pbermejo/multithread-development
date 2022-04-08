package com.pbermejo.boletin3;

public class FactorialRunnableModificado implements Runnable {
    private int num;
    private int factorial = 1;

    public FactorialRunnableModificado(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("INICIO proceso … cálculo del factorial de: " + this.num);
        for (int i = 1; i <= this.num; i++) {
            this.factorial *= i;
        }
        System.out.println(String.format("FIN proceso ….. el factorial de: %s es %s", this.num, this.factorial));
    }
}
