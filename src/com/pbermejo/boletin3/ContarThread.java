package com.pbermejo.boletin3;

public class ContarThread extends Thread{
    private int maxContar;

    public ContarThread(int maxContar, String nombreHilo) {
        super(nombreHilo);
        this.maxContar = maxContar;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.maxContar; i++) {
            System.out.println(String.format("%s: repetición %s", this.getName(), i));
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
