package com.acarballeira.sincronizacion;

public class Mostra02App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(40);
		Mostra02_SacarDinero h1 = new Mostra02_SacarDinero("Julio", c);
		Mostra02_SacarDinero h2 = new Mostra02_SacarDinero("Susana", c);
		h1.start();
		h2.start();
	}

}
