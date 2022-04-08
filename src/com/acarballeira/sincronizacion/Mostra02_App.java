package com.acarballeira.sincronizacion;

public class Mostra02_App {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(40);
        Mostra02_SacarDinero fioA = new Mostra02_SacarDinero("Rosa", c);
        Mostra02_SacarDinero fioB = new Mostra02_SacarDinero("Pepe", c);
        fioB.start();
        fioA.start();
    }
}
