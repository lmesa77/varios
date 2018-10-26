/**
 * Un palíndromo (del griego palin dromein, volver a ir atrás), también llamado
 * palindromo, palíndroma o palindroma, es una palabra, número o frase que se lee
 * igual adelante que atrás. Si se trata de un numeral, usualmente en notación
 * indoarábiga, se llama capicúa. Habitualmente, las frases palindrómicas se resienten
 * en su significado cuanto más largas son (Wikipedia)
 */
package com.lwy.varios;

import java.util.Scanner;

/**
 *
 * @author LWY
 */
public class Palindromo {

    public static void main(String[] args) {
        //recibimos la frase por consola
        Scanner scn = new Scanner(System.in);
        String entrada = scn.nextLine();

        //le quitamos espacios, signos de puntuación y dejamos en minusculas
        String frase = entrada.toLowerCase();
        frase = frase.replace(" ", "");
        frase = frase.replace(".", "");
        frase = frase.replace(",", "");

        //pasamos aun vector
        char[] vector = frase.toCharArray();

        //compramos los extramos acercandonos al centro de la frase para comparar
        //que existan las mismas letras
        int max = frase.length() - 1;
        boolean isEquals = true;

        //con un ciclo comparamos cada una de las parejas
        for (int i = 0; i < max; i++) {
            if (vector[i] != vector[max - i]) {
                isEquals = false;
                break;
            }
        }

        //mostramos el resultado
        if (isEquals == true) {
            System.out.println("La frase: " + entrada + " SI es un palindromo");
        } else {
            System.out.println("La frase: " + entrada + " NO es un palindromo");
        }
    }
}
