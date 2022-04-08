package com.acarballeira.sincronizacion;

public class Mostra02_SacarDinero extends Thread {
	
	private Cuenta c;
	
	public Mostra02_SacarDinero(String nome, Cuenta c) {
		super(nome);
		this.c = c;
	}
	
	public void run() {
		for(int i = 1; i <= 4; i++) {
			c.retirarDinero(30, getName());
		}
	}
}
