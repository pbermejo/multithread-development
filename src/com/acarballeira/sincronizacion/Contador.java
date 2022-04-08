package com.acarballeira.sincronizacion;

public class Contador {
	
	private int numero;
	
	public Contador(int c) {
		this.numero = c;
	}
	
	public void incrementa() {
		this.numero++;
	}
	
	public void decrementa() {
		this.numero--;
	}
	
	public int valor() {
		return this.numero;
	}
}
