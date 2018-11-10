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
public abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "El Area de la figura " + nombre + " es: " + area();
    }
}
