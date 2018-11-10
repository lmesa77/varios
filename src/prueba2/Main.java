/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

/**
 *
 * @author LWY
 */
public class Main {

    public static void main(String[] args) {
        Empleado ef = new EmpleadoFijo(1250000, 35000, 25000, 98632793, "Lwy Mesa Arcila", "Desocupado");
        System.out.println(ef.toString());
    }

}
