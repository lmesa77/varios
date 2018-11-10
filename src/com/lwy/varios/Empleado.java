package com.lwy.varios;

/**
 *
 * @author LWY
 */
public class Empleado extends Criterio<Empleado> implements Comparable<Empleado> {

    private final String nombre;
    private final int edad;
    private final double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Empleado o) {
        return (int) (this.salario - o.salario);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Edad: " + edad + " Salario: " + salario;
    }

    @Override
    public int Comparar(Empleado t1, Empleado t2) {
        return this.nombre.compareTo(t2.getNombre());
    }



}
