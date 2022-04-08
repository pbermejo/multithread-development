package com.acarballeira.probas;

import javax.security.auth.callback.TextInputCallback;

public class TicTac extends Thread{

    private String texto;

    public TicTac(String texto) {
        this.texto = texto;
    }

    public void run() {
        for(;;){
            System.out.print(this.texto + " ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TicTac tic = new TicTac("tic");
        TicTac tac = new TicTac("TAC");
        tic.start();
        tac.start();
    }
}
