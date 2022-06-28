package modelo;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.text.InternationalFormatter;

public class Menu extends JFrame {
    public Menu(){
        this.setSize(600,500);
        setTitle("modelo.Menu Ventas");
        setLocationRelativeTo(null);
        setMaximumSize(new Dimension(200,200));
        iniciarMenu();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iniciarMenu(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

        JLabel menu = new JLabel();
        menu.setText("Menú de Ventas");
        //menu.setText();
        menu.setBounds(10,10,40,20);
        menu.setForeground(Color.BLACK);
    }
}