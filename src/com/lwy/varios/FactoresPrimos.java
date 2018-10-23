package com.lwy.varios;

import java.util.Scanner;

/**
 * Buscamos los factores primos de un número entero positivo
 *
 * @author LWY
 */
public class FactoresPrimos {

    public static void main(String[] args) {

        FactoresPrimos fp = new FactoresPrimos();
        fp.evaluar();
    }

    private boolean isPrimo(int setNumber) {

        int cont = 0;
        for (int k = 0; k < setNumber; k++) {
            if (setNumber % (k + 1) == 0) {
                cont++;
            }
        }

        return cont < 3;
    }

    private void evaluar() {

        //Recibimos el número a evaluar
        Scanner entradaEscaner = new Scanner(System.in);
        int numero = entradaEscaner.nextInt();

        int aux = numero;
        boolean band = false;
        int primo = 2;
        boolean pPrimo;
        boolean sPrimo;
        String resultado = "";

        while (band == false) {

            pPrimo = isPrimo(primo);

            if (pPrimo == true) {

                //evalua si la division es exacta al dividir por el primer
                //numero primo del listado
                if (aux % primo == 0) {

                    //guarda el resultado y el numero que lo dividio exactamente
                    aux = aux / primo;
                    resultado = resultado + " " + primo;

                    //evaluamos si el nuevo resultado es un número primo
                    sPrimo = isPrimo(aux);

                    if (sPrimo == true) {
                        resultado = resultado + " " + aux;
                        band = true;
                    }

                } else {
                    primo++;
                }

            } else {
                primo++;
            }
        }
        System.out.println(resultado);
    }
}
