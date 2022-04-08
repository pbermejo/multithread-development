package com.acarballeira.sincronizacion;

public class Mostra03FioCadea extends Thread{
	
	private Mostra03ObxectoCompartido obxecto;
	private String cadea;
	
	public Mostra03FioCadea(Mostra03ObxectoCompartido obxecto, String cadea) {
		this.obxecto = obxecto;
		this.cadea = cadea;
	}
	
//	public void run() {
//		synchronized(obxecto) {
//			for(int i = 0; i <= 10; i++) {
//				obxecto.pintaCadea(cadea + " ");
//				obxecto.notify();
//				try {
//					obxecto.wait();
//				} catch (InterruptedException e) {
//				}
//				obxecto.notify();
//			}
//		}
//	}

	public void run() {
		for(int i = 0; i <= 10; i++) {
			obxecto.pintaCadea(cadea + " ");
		}
	}
}
