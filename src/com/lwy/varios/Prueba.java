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
public class Prueba {

    public static void main(String[] args) {

        FiguraGeometrica triangulo = new Triangulo(3, 6, "Triangulo");
        FiguraGeometrica rectangulo = new Rectangulo(10, 5, "Rectangulo");
        FiguraGeometrica circulo = new Circulo(4, "Circulo");

        System.out.println(triangulo.toString());
        System.out.println(rectangulo.toString());
        System.out.println(circulo.toString());

    }

}
