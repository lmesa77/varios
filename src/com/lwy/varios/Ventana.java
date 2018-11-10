/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lwy.varios;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author LWY
 */
public class Ventana extends Frame {

    private Button b1, b2, b3;

    public Ventana() {

        super("Esta es una ventana");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        b1 = new Button("Boton 1");
        add(b1);
        b2 = new Button("Boton 2");
        add(b2);
        b3 = new Button("Boton 3");
        add(b3);

        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }

}
