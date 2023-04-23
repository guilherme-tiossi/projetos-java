package com.calculadora;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculadoraPanel extends JPanel implements ActionListener {

    CalculadoraPanel(){ //construtor panel
        this.setPreferredSize(new Dimension(350, 500));
        this.setFocusable(true);
        this.setLayout(null);

        JPanel teclado = new JPanel();
        teclado.setLayout(null);
        
        JButton um = new JButton("1", null);
        um.setPreferredSize(new Dimension(80, 60));
        JButton dois = new JButton("2", null);
        dois.setPreferredSize(new Dimension(80, 60));
        JButton tres = new JButton("3", null);
        tres.setPreferredSize(new Dimension(80, 60));
        JButton mais = new JButton("+", null);
        mais.setPreferredSize(new Dimension(80, 60));
        JPanel linhaUm = new JPanel();
        linhaUm.setBackground(Color.green);
        linhaUm.setBounds(0, 5, 350, 70);
        linhaUm.add(um);
        linhaUm.add(dois);
        linhaUm.add(tres);
        linhaUm.add(mais);
        
        JButton quatro = new JButton("4", null);
        quatro.setPreferredSize(new Dimension(80, 60));
        JButton cinco = new JButton("5", null);
        cinco.setPreferredSize(new Dimension(80, 60));
        JButton seis = new JButton("6", null);
        seis.setPreferredSize(new Dimension(80, 60));
        JButton menos = new JButton("-", null);
        menos.setPreferredSize(new Dimension(80, 60));
        JPanel linhaDois = new JPanel();
        linhaDois.setBackground(Color.green);
        linhaDois.setBounds(0, 80, 350, 70);
        linhaDois.add(quatro);
        linhaDois.add(cinco);
        linhaDois.add(seis);
        linhaDois.add(menos);

        JButton sete = new JButton("7", null);
        sete.setPreferredSize(new Dimension(80, 60));
        JButton oito = new JButton("8", null);
        oito.setPreferredSize(new Dimension(80, 60));
        JButton nove = new JButton("9", null);
        nove.setPreferredSize(new Dimension(80, 60));
        JButton mult = new JButton("*", null);  
        mult.setPreferredSize(new Dimension(80, 60));
        JPanel linhaTres = new JPanel();
        linhaTres.setBackground(Color.green);
        linhaTres.setBounds(0, 155, 350, 70);
        linhaTres.add(sete);
        linhaTres.add(oito);
        linhaTres.add(nove);
        linhaTres.add(mult);

        JButton zero = new JButton("0", null);
        zero.setPreferredSize(new Dimension(80, 60));
        JButton div = new JButton("/", null);
        div.setPreferredSize(new Dimension(80, 60));
        JButton igual = new JButton("=", null);
        igual.setPreferredSize(new Dimension(165, 60));
        JPanel linhaQuatro = new JPanel();
        linhaQuatro.setBackground(Color.green);
        linhaQuatro.setBounds(0, 230, 350, 70);
        linhaQuatro.add(zero);
        linhaQuatro.add(div);
        linhaQuatro.add(igual);

        teclado.setBackground(Color.red);
        teclado.setBounds(0, 150, 350, 350);
        teclado.add(linhaUm);
        teclado.add(linhaDois);
        teclado.add(linhaTres);
        teclado.add(linhaQuatro);
        this.add(teclado);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
