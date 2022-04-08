package com.acarballeira.sincronizacion;

public class Cuenta {
	private int saldo;
	
	public Cuenta(int saldo) {
		this.saldo = saldo;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public synchronized void retirarDinero(int cantidad, String persona) {
		if(getSaldo() >= cantidad) {
			System.out.println(persona + ": se va a retirar dinero. (Actualmente hay " + this.getSaldo() + ")");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
			}
			this.saldo -= cantidad;
			System.out.println("\t" + persona + " retira => " + cantidad + " ACTUAL (" + this.getSaldo() +") ");
		} else {
			System.out.println("No se puede retirar dinero, NO HAY SALDO (" + this.getSaldo() + ")");
		}
		
		if(getSaldo() < 0) {
			System.out.println("SALDO NEGATIVO => " + this.getSaldo());
		}
	}
}
