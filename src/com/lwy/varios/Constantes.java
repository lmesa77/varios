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
public class Constantes {

    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 7;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int v = scn.nextInt();

        String dia;

        switch (v) {
            case LUNES:
                dia = "Lunes";
                break;

            case MARTES:
                dia = "Martes";
                break;

            case MIERCOLES:
                dia = "Miercoles";
                break;

            case JUEVES:
                dia = "Jueves";
                break;

            case VIERNES:
                dia = "Viernes";
                break;

            case SABADO:
                dia = "Sábado";
                break;

            case DOMINGO:
                dia = "Domingo";
                break;

            default:
                dia = "Día incorrecto...";
        }

        System.out.println(dia);
    }
}
