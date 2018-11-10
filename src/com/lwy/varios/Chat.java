/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lwy.varios;

import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicLookAndFeel;
import javax.swing.plaf.multi.MultiLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author LWY
 */
public class Chat extends JFrame {

    private JTextField tfNick;
    private JTextField tfMensajes;
    private JButton bLogin;
    private JButton bLogout;
    private JButton bEnviar;
    private JList lsLog;
    private Border border;

    public Chat() throws HeadlessException {
        super("Chat");

        Container content = getContentPane();

        content.setLayout(new BorderLayout());

        border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        JPanel pNorth = crearPNorte();
        content.add(pNorth, BorderLayout.NORTH);

        JPanel pCenter = crearPCentro();
        content.add(pCenter, BorderLayout.CENTER);

        JPanel pSouth = crearPSur();
        content.add(pSouth, BorderLayout.SOUTH);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private JPanel crearPNorte() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        TitledBorder titleBorder
                = BorderFactory.createTitledBorder(border, "NICK");

        p.setBorder(titleBorder);

        tfNick = new JTextField(10);
        p.add(tfNick);

        bLogin = new JButton("Login");
        p.add(bLogin);

        bLogout = new JButton("Salir");
        p.add(bLogout);
        
        return p;
    }

    private JPanel crearPCentro() {
        JPanel p = new JPanel(new BorderLayout());

        TitledBorder titleBoder
                = BorderFactory.createTitledBorder(border, "Conversacion");

        p.setBorder(titleBoder);
        lsLog = new JList();
        JScrollPane scroll = new JScrollPane(lsLog);
        p.add(scroll, BorderLayout.CENTER);
        return p;
    }

    private JPanel crearPSur() {

        JPanel p = new JPanel(new BorderLayout());
        TitledBorder titleBoder
                = BorderFactory.createTitledBorder(border, "Mensaje");
        p.setBorder(titleBoder);
        tfMensajes = new JTextField();
        p.add(tfMensajes, BorderLayout.CENTER);
        bEnviar = new JButton("Enviar");
        p.add(bEnviar, BorderLayout.EAST);
        return p;
    }

    public static void main(String args[]) throws Exception {
        
//        UIManager.setLookAndFeel(new WindowsLookAndFeel());
//        UIManager.setLookAndFeel(new SynthLookAndFeel());
//        UIManager.setLookAndFeel(new MultiLookAndFeel());
//        UIManager.setLookAndFeel(new MotifLookAndFeel());
//        UIManager.setLookAndFeel(new NimbusLookAndFeel());
//        UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());

        Chat c = new Chat();
    }
}
