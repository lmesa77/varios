package com.lwy.varios;

import java.util.Arrays;
import java.util.List;
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

//        //Recibimos el número a evaluar
//        Scanner entradaEscaner = new Scanner(System.in);
//        int numero = entradaEscaner.nextInt();
//
//        //declaramos una lista con todos los numeros primos inferiores a 100
//        List<Integer> numPrimos = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
//        String resultado = "";
//
//        int i = 0;
//        int aux = numero;
//        boolean band = false;
//        //empezamos a dividir el numero a evaluar por
//        //el listado ascendente de los numeros primos
//
//        while (band == false) {
//
//            //evalua si la division es exacta al dividir por el primer
//            //numero primo del listado
//            if (aux % numPrimos.get(i) == 0) {
//
//                //guarda el resultado y el numero que lo dividio exactamente
//                aux = aux / numPrimos.get(i);
//                resultado = resultado + " " + numPrimos.get(i).toString();
//
//                //vuelve a evaluar por el mismo numero de la lista
//                i = i - 1;
//
//                //evaluamos si el nuevo resultado es un número primo
//                for (Integer numPrimo : numPrimos) {
//
//                    if (aux > 97) {
//                        break;
//                    } else {
//                        if (aux == numPrimo || aux == 1) {
//                            resultado = resultado + " " + aux;
//                            band = true;
//                            break;
//                        }
//                    }
//                }
//            }
//            i++;
//
//        }
//        System.out.println(resultado); 
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
                        resultado = resultado + aux;
                        band = true;
                    } else {
                        primo++;
                    }

                }

            } else {
                primo++;
            }
        }
        System.out.println(resultado);
    }
}
