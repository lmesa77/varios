package com.lwy.varios;

/**
 *
 * @author LWY
 */
public class Fracciones {

    private int num;
    private int den;
    private double dec;
    public static int numX=0;

    public Fracciones(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fracciones(double dec) {
        this.dec = dec;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public double getDec() {
        return dec;
    }

    public void sum(Fracciones f2) {
        int newDen = this.den * f2.getDen();
        int newNum = (this.num * f2.getDen()) + (this.den * f2.getNum());

        int comun = mcd(newNum, newDen);

        mostrar(newNum, newDen, comun);

    }

    public void res(Fracciones f2) {
        int newDen = this.den * f2.getDen();
        int newNum = (this.num * f2.getDen()) - (this.den * f2.getNum());

        int comun = mcd(newNum, newDen);

        mostrar(newNum, newDen, comun);
    }

    public void mul(Fracciones f2) {
        int newNum = this.num * f2.num;
        int newDen = this.den * f2.den;

        int comun = mcd(newNum, newDen);

        mostrar(newNum, newDen, comun);
    }

    public void div(Fracciones f2) {
        int newNum = this.num * f2.den;
        int newDen = this.den * f2.num;

        int comun = mcd(newNum, newDen);

        mostrar(newNum, newDen, comun);
    }

    public void pasarDecFracc() {
        //saber cuantas cifras hay despues del punto        
        String sDec = Double.toString(this.dec);
        String vDec[] = sDec.split("\\.");

        int cant = vDec[1].length();

        String mil = "1";
        for (int i = 0; i < cant; i++) {
            mil = mil + 0;
        }

        double newMil = Double.parseDouble(mil);

        double dNum = this.dec * newMil;
        double dDen = newMil;

        int comun = mcd((int) dNum, (int) dDen);

        mostrar((int) dNum, (int) dDen, comun);

    }

    private void mostrar(int newNum, int newDen, int comun) {

        if (newNum / comun == 0) {
            System.out.println(0); //si el numerador es igual a 0, el resultado es 0
        } else if (newDen == newNum) {
            System.out.println(1); //si el numerador y el denominador son iguales, el resultado es 1
        } else {
            System.out.println((newNum / comun) + "/" + (newDen / comun));
        }
    }

    private int mcd(int m, int n) {
        int mOld, nOld;

        while (m % n != 0) {
            mOld = m;
            nOld = n;

            m = nOld;
            n = mOld % nOld;
        }

        return n;
    }

    public static int hola(int num1, int num2) {
        return num1 + num2;
    }
}
