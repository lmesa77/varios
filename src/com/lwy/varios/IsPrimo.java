package com.lwy.varios;

import java.util.Scanner;

/**
 *
 * @author LWY
 */
public class IsPrimo {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int numero = dato.nextInt();

        int cont = 0;
        for (int i = 0; i < numero; i++) {
            if (numero % (i + 1) == 0) {
                cont++;
            }
        }

        if (cont > 2) {
            System.out.println(numero + " NO es número primo");
        } else {
            System.out.println(numero + " SI es número primo");
        }
    }
}
