package com.calculadora;
import javax.swing.JFrame;

public class CalculadoraFrame extends JFrame
{
    CalculadoraFrame() //construtor calculadora
    {
        this.add(new CalculadoraPanel());
        this.setTitle("Calculadora.");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(300, 500);
    }
}