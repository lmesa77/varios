package com.lwy.varios;

public class MainFracciones {

    public static void main(String[] args) {
        Fracciones f1 = new Fracciones(18, 4);
        Fracciones f2 = new Fracciones(2, 1);
        Fracciones f3 = new Fracciones(4.25);

        f1.div(f2);
        f2.res(f1);

        System.out.println(Fracciones.hola(15, 23));
        System.out.println(Fracciones.numX);

    }
}
