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
public class Circulo extends FiguraGeometrica {

    double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(radio, 2));
    }

}
