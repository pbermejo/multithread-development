package com.pbermejo.boletin7.ejercicio5;

public class Cliente implements Runnable{
    private String nombre;
    private Puerta puerta;
    private Almacen almacen;
    private int maxIntentos;

    public Cliente(String nombre, Puerta puerta, Almacen almacen, int maxIntentos) {
        this.nombre = nombre;
        this.puerta = puerta;
        this.almacen = almacen;
        this.maxIntentos = maxIntentos;
    }

    @Override
    public void run() {
        for (int i = 0; i < maxIntentos; i++) {
            try{
                Thread.sleep(300);
            } catch (InterruptedException e){
                System.out.println("Excepción en cliente");
            }

            if(puerta.intentarEntrar()){
                System.out.println(nombre + " entró");
            }else{
                System.out.println(nombre + " espera en intento " + i);
                continue;
            }

            if(almacen.cogerProducto()){
                System.out.println(nombre + "coge producto, quedan " + almacen.getUnidades());
            }
            puerta.liberarPuerta();
            System.out.println(nombre + " se va");
            break;
        }
    }
}
