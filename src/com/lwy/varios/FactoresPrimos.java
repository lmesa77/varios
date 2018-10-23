package com.lwy.varios;

import java.util.Scanner;

/**
 * Buscamos los factores primos de un número entero positivo
 *
 * @author LWY
 */
public class FactoresPrimos {

    //metodo Main
    public static void main(String[] args) {

        FactoresPrimos fp = new FactoresPrimos();
        fp.evaluar();
    }

    //metodo para evaluar que un numero entero positivo es primo
    private boolean isPrimo(int setNumber) {

        //declaramos una variable contador e inicializamos
        int cont = 0;

        //dividimos el número por todos los numeros listados
        //desde el mismo numero hasta 2
        for (int k = 0; k < setNumber; k++) {

            //por cada que se de una division exacta, se suma una unidad al contador
            if (setNumber % (k + 1) == 0) {
                cont++;
            }
        }

        //se retorna el resultado. Si es mayor a dos divisiones exactas, indica
        //que el número no es primo y retorna false. Caso contrario retorna true
        //inidicando que es número primo ya que solo se puede dividir por el mismo
        //y por 1 (dos resultados enteros)
        return cont < 3;
    }

    //metodo que evalua los factores primos de un numero entero positivo
    private void evaluar() {

        //Recibimos el número a evaluar desde la terminal
        Scanner entradaEscaner = new Scanner(System.in);
        int numero = entradaEscaner.nextInt();

        //declaramos las variables a utilizar
        //pasa el numero que se ingreso por consola para ser evaluado
        int aux = numero;

        //mantiene el ciclo de evaluacion hasta que pasa a true lo que indica 
        //que ya se encontraron todos los factores primos
        boolean band = false;

        //da inicio a la lista de numeros primos
        int primo = 2;

        //El divisor es primo?
        boolean pPrimo;

        //el resultado es primo?
        boolean sPrimo;

        //cadena donde se concatenan los primos evaluados positivos
        String resultado = "";

        //se inicia un ciclo que finaliza al ser encontrados todos los factores primos
        while (band == false) {

            //Se evalua si el divisor es primo
            pPrimo = isPrimo(primo);

            //si lo es...
            if (pPrimo == true) {

                //evalua si la division es exacta al dividir por el primer
                //numero primo del listado
                if (aux % primo == 0) {

                    //guarda el resultado y el numero que lo dividio exactamente
                    aux = aux / primo;
                    resultado = resultado + " " + primo;

                    //evaluamos si el nuevo resultado es un número primo
                    sPrimo = isPrimo(aux);

                    //si el resultado es verdadero, termina el proceso
                    if (sPrimo == true) {
                        resultado = resultado + " " + aux;
                        band = true;
                    }

                    //incrementa el valor del divisor en 1
                } else {
                    primo++;
                }

                //incrementa el valor del divisor en 1    
            } else {
                primo++;
            }
        }

        //muestra el mensaje final con el resultado
        System.out.println("Los factores primos de " + numero + " son:" + resultado);
    }
}
