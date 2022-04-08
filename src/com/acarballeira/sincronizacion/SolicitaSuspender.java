package com.acarballeira.sincronizacion;

public class SolicitaSuspender {
    private boolean suspender;

    public synchronized void set(boolean valor){
        suspender = valor;
        notifyAll();
    }

    public synchronized void esperandoParaReanudar() throws InterruptedException{
        while(suspender){
            wait(); // Zona de exclusión mutua. Solo puede ser llamada dentro de un método sincronizado.
        }
    }
}
