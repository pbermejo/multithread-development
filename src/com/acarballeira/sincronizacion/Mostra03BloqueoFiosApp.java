package com.acarballeira.sincronizacion;

public class Mostra03BloqueoFiosApp {
	public static void main(String[] args) {
		Mostra03ObxectoCompartido obxecto = new Mostra03ObxectoCompartido();
		Mostra03FioCadea a = new Mostra03FioCadea(obxecto, "A");
		Mostra03FioCadea b = new Mostra03FioCadea(obxecto, "B");
		a.start();
		b.start();
	}
}
