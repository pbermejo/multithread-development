package com.acarballeira.sincronizacion;

public class Mostra01_A extends Thread{

	private Contador contador;
	
	public Mostra01_A(String nome, Contador contador) {
		super(nome);
		this.contador = contador;
	}
	
	public void run() {
		synchronized (contador) {
			for (int i = 0; i < 300; i++){
				contador.incrementa();
				try {
					Thread.currentThread().sleep(1);
				} catch (InterruptedException e) {				
				}
				
			}
			System.out.println(getName() + " contador vale " + contador.valor());
		}
	}
}
