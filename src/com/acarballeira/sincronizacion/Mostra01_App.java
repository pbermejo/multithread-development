package com.acarballeira.sincronizacion;

public class Mostra01_App extends Thread{

	public static void main(String[] args) {
		Contador cont = new Contador(100);
		Mostra01_A fioA = new Mostra01_A("Fío 1", cont);
		Mostra01_B fioB = new Mostra01_B("Fío 2", cont);		
		fioB.start();
		fioA.start();
	}
}
