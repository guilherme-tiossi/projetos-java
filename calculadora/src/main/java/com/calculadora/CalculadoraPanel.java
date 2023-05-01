package com.calculadora;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraPanel extends JPanel implements ActionListener {

    private String conta = "";
    private Calculadora calculadora = new Calculadora();

    CalculadoraPanel() { // construtor panel
        this.setFocusable(true);
        this.setLayout(new GridBagLayout());
        organizaLayout();
    }

    public void organizaLayout() {
        GridBagConstraints gbc = new GridBagConstraints();

        JButton mais = new JButton("+", null);
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(mais, gbc);
        
        JButton menos = new JButton("-", null);
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridwidth = 1;
        gbc2.gridheight = 1;
        gbc2.weightx = 1.0;
        gbc2.weighty = 1.0;
        gbc2.fill = GridBagConstraints.BOTH;
        add(menos, gbc2);

        JButton mult = new JButton("*", null);
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridwidth = 1;
        gbc3.gridheight = 1;
        gbc3.weightx = 1.0;
        gbc3.weighty = 1.0;
        gbc3.fill = GridBagConstraints.BOTH;
        add(mult, gbc3);

        JButton div = new JButton("/", null);
        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.gridwidth = GridBagConstraints.REMAINDER;
        gbc4.gridheight = 1;
        gbc4.weightx = 1.0;
        gbc4.weighty = 1.0;
        gbc4.fill = GridBagConstraints.BOTH;
        add(div, gbc4);

        JButton um = new JButton("1", null);
        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc5.gridwidth = 1;
        gbc5.gridheight = 1;
        gbc5.weightx = 1.0;
        gbc5.weighty = 1.0;
        gbc5.fill = GridBagConstraints.BOTH;
        add(um, gbc5);


        JButton dois = new JButton("2", null);
        GridBagConstraints gbc6 = new GridBagConstraints();
        gbc6.gridwidth = 1;
        gbc6.gridheight = 1;
        gbc6.weightx = 1.0;
        gbc6.weighty = 1.0;
        gbc6.fill = GridBagConstraints.BOTH;
        add(dois, gbc6);

        
        JButton tres = new JButton("3", null);
        GridBagConstraints gbc7 = new GridBagConstraints();
        gbc7.gridwidth = 1;
        gbc7.gridheight = 1;
        gbc7.weightx = 1.0;
        gbc7.weighty = 1.0;
        gbc7.fill = GridBagConstraints.BOTH;
        add(tres, gbc7);

        JButton ac = new JButton("AC", null);
        GridBagConstraints gbc8 = new GridBagConstraints();
        gbc8.gridwidth = GridBagConstraints.REMAINDER;
        gbc8.gridheight = 2;
        gbc8.weightx = 1.0;
        gbc8.weighty = 1.0;
        gbc8.fill = GridBagConstraints.BOTH;
        add(ac, gbc8);

        JButton quatro = new JButton("4", null);
        GridBagConstraints gbc9 = new GridBagConstraints();
        gbc9.gridwidth = 1;
        gbc9.gridheight = 1;
        gbc9.weightx = 1.0;
        gbc9.weighty = 1.0;
        gbc9.fill = GridBagConstraints.BOTH;
        add(quatro, gbc9);
        
        JButton cinco = new JButton("5", null);
        GridBagConstraints gbc10 = new GridBagConstraints();
        gbc10.gridwidth = 1;
        gbc10.gridheight = 1;
        gbc10.weightx = 1.0;
        gbc10.weighty = 1.0;
        gbc10.fill = GridBagConstraints.BOTH;
        add(cinco, gbc10);

        JButton seis = new JButton("6", null);
        GridBagConstraints gbc11 = new GridBagConstraints();
        gbc11.gridwidth = 1;
        gbc11.gridheight = 1;
        gbc11.weightx = 1.0;
        gbc11.weighty = 1.0;
        gbc11.fill = GridBagConstraints.BOTH;
        add(seis, gbc11);

        JButton backspace = new JButton("<-", null);
        GridBagConstraints gbc12 = new GridBagConstraints();
        gbc12.gridwidth = GridBagConstraints.REMAINDER;
        gbc12.gridheight = 1;
        gbc12.weightx = 1.0;
        gbc12.weighty = 1.0;
        gbc12.fill = GridBagConstraints.BOTH;
        add(backspace, gbc12);

        JButton sete = new JButton("7", null);
        GridBagConstraints gbc13 = new GridBagConstraints();
        gbc13.gridwidth = 1;
        gbc13.gridheight = 1;
        gbc13.weightx = 1.0;
        gbc13.weighty = 1.0;
        gbc13.fill = GridBagConstraints.BOTH;
        add(sete, gbc13);
        
        JButton oito = new JButton("8", null);
        GridBagConstraints gbc14 = new GridBagConstraints();
        gbc14.gridwidth = 1;
        gbc14.gridheight = 1;
        gbc14.weightx = 1.0;
        gbc14.weighty = 1.0;
        gbc14.fill = GridBagConstraints.BOTH;
        add(oito, gbc14);

        JButton nove = new JButton("9", null);
        GridBagConstraints gbc15 = new GridBagConstraints();
        gbc15.gridwidth = 1;
        gbc15.gridheight = 1;
        gbc15.weightx = 1.0;
        gbc15.weighty = 1.0;
        gbc15.fill = GridBagConstraints.BOTH;
        add(nove, gbc15);

        JButton ponto = new JButton(".", null);
        GridBagConstraints gbc16 = new GridBagConstraints();
        gbc16.gridwidth = GridBagConstraints.REMAINDER;
        gbc16.gridheight = 1;
        gbc16.weightx = 1.0;
        gbc16.weighty = 1.0;
        gbc16.fill = GridBagConstraints.BOTH;
        add(ponto, gbc16);
        
        JButton zero = new JButton("0", null);
        GridBagConstraints gbc18 = new GridBagConstraints();
        gbc18.gridwidth = 1;
        gbc18.gridheight = 1;
        gbc18.weightx = 1.0;
        gbc18.weighty = 1.0;
        gbc18.fill = GridBagConstraints.BOTH;
        add(zero, gbc14);

        JButton igual = new JButton("=", null);
        GridBagConstraints gbc19 = new GridBagConstraints();
        gbc19.gridwidth = 3;
        gbc19.gridheight = 1;
        gbc19.weightx = 3.0;
        gbc19.weighty = 1.0;
        gbc19.fill = GridBagConstraints.BOTH;
        add(igual, gbc19);

        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "1";
            }
        });

        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "2";
            }
        });

        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "3";
            }
        });

        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "4";
            }
        });

        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "5";
            }
        });

        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "6";
            }
        });

        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "7";
            }
        });

        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "8";
            }
        });

        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "9";
            }
        });

        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "0";
            }
        });

        ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + ".";
            }
        });

        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = "";
            }
        });

        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta.substring(0, conta.length() - 1);
            }
        });

        mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "x+x";
            }
        });

        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "x-x";
            }
        });

        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "x/x";
            }
        });

        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "x*x";
            }
        });

        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadora.iniciaCalculo(conta);
            }
        });
    }

    public void organizaLayout2() {
        // JPanel teste = new JPanel();
        this.add(new JButton(""));
        this.add(new JButton(""));
        this.add(new JButton(""));
        this.add(new JButton("conta"));
        this.add(new JButton(""));
        this.add(new JButton(""));
        this.add(new JButton("resul"));
        this.add(new JButton("tado"));
        this.add(new JButton("+"));
        this.add(new JButton("-"));
        this.add(new JButton("*"));
        this.add(new JButton("/"));
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("ac"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("backspace"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        this.add(new JButton(""));
        this.add(new JButton("."));
        this.add(new JButton("0"));
        JButton igual = new JButton("igual");

        igual.setSize(igual.getWidth(), igual.getHeight() * 2);
        this.add(new JButton("igual"));
        // this.add(teste);
    }

    public void organizaLayout0() {
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

        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "1";
            }
        });

        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "2";
            }
        });

        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "3";
            }
        });

        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "4";
            }
        });

        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "5";
            }
        });

        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "6";
            }
        });

        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "7";
            }
        });

        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "8";
            }
        });

        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "9";
            }
        });

        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "0";
            }
        });

        mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "x+x";
            }
        });

        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "x-x";
            }
        });

        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "x/x";
            }
        });

        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conta = conta + "x*x";
            }
        });

        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadora.iniciaCalculo(conta);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
