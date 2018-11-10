/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lwy.varios;

/**
 *
 * @author LWY
 */
public class Rectangulo extends FiguraGeometrica {

    double altura;
    double base;

    public Rectangulo(double altura, double base, String nombre) {
        super(nombre);
        this.altura = altura;
        this.base = base;
    }


    @Override
    public double area() {
        return base * altura;
    }

}
