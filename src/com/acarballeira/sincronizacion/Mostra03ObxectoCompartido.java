package com.acarballeira.sincronizacion;

public class Mostra03ObxectoCompartido {
	public synchronized void pintaCadea(String s) {
		System.out.print(s);
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
		notify();
	}
}
