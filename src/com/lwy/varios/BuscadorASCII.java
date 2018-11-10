/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lwy.varios;

import java.util.Scanner;

/**
 *
 * @author LWY
 */
public class BuscadorASCII {

    public static void main(String[] args) {
        //capturamos el caracter por teclado
        Scanner scn = new Scanner(System.in);
        String entrada = scn.next();
        char caracter = entrada.charAt(0);

        //mostramos por consola la conbinación correspondiente
        System.out.println("la comvinacion corresponidente es: ALT + " + (caracter + 0));
    }

}
