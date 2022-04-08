package com.pbermejo.boletin5;

public class AppCarreraHilos {

    public static Corredor corredor1;
    public static Corredor corredor2;

    public static void subpreguntaA(){

        corredor1.start();
        corredor2.start();

        while(corredor1.getContador() < corredor2.getContador()){}
    }

    public static void subpreguntaB(){

        corredor2.start();
        corredor1.start();

        while(corredor1.getContador() < corredor2.getContador()){}
    }

    public static void subpreguntaC(){

        corredor1.setPriority(Thread.MAX_PRIORITY);
        corredor2.setPriority(Thread.MIN_PRIORITY);

        corredor2.start();
        corredor1.start();

        while(corredor1.getContador() < corredor2.getContador()){}
    }

    public static void subpreguntaD(){

        corredor1.setPriority(Thread.MAX_PRIORITY);
        corredor2.setPriority(Thread.MIN_PRIORITY);

        corredor1.start();
        corredor2.start();

        while(corredor1.getContador() < corredor2.getContador()){}
    }

    public static void subpreguntaE(){

        corredor1.setPriority(Thread.MAX_PRIORITY);
        corredor2.setPriority(Thread.MIN_PRIORITY);

        corredor1.start();
        corredor2.start();

        while(corredor1.getContador() > corredor2.getContador()){}
    }

    public static void main(String[] args) {
        corredor1 = new Corredor("Corredor 1", 0);
        corredor2 = new Corredor("Corredor 2", 100);

        //subpreguntaA();
        //subpreguntaB();
        //subpreguntaC();
        //subpreguntaD();
        subpreguntaE();

        corredor1.stopHilo();
        corredor2.stopHilo();
    }
}
