package com.lwy.varios;

import java.util.ArrayList;
import java.util.List;

/**
 * Se evalua de un listado de numeros generados al azar cuales de sus miembros
 * son números primos y se muestran en una lista independiente.
 * 
 * @author LWY
 */

public class Primos {

    public static void main(String[] args) {
        //crear una lista
        List<Integer> numeros = new ArrayList<>();
        List<Integer> resultado = new ArrayList<>();

        //llenamos aleatoreamente la lista
        for (int i = 0; i < 100; i++) {
            numeros.add((int) (Math.random() * 100) + 1);
        }

        //declara un contador
        int res;

        //crea un bucle para recorrer todo la Lista
        for (int i = 0; i < numeros.size(); i++) {

            //inicializa el contador
            res = 0;

            //divide el número de la seleccion por todos los dividibles
            //para entontrar sus divisiones exactas
            for (int j = 0; j < numeros.get(i); j++) {

                //al haber division exacta el contador aumenta en 1
                if (numeros.get(i) % (j + 1) == 0) {
                    res = res + 1;
                }
            }

            //al finalizar la evaluacion de las divisiones posibles del número
            //mira si el contador es igual o menor a dos divisiones exactas
            //con lo cual sabemos si ael numero es primo o no
            if (res < 3) {
                resultado.add(numeros.get(i));
            }
        }

        //mostramos el resultado
        System.out.println("Lista a evaluar: " + numeros);
        System.out.println("Lista de números primos: " + resultado);
    }

}
