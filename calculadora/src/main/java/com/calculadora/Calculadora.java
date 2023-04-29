package com.calculadora;

public class Calculadora {

    private String[] conta;
    private int resultado;

    public void processarString(String contaBruta) {
        conta = contaBruta.split("x");

        int i = 0;
        for (String a : conta) {
            switch (a) {
                case "+":
                    resultado = Integer.parseInt(conta[i - 1]) + Integer.parseInt(conta[i + 1]);
                    // System.out.println(Integer.parseInt(conta[i - 1]) + "+" +
                    // Integer.parseInt(conta[i + 1]));
                    break;

                case "-":
                    resultado = Integer.parseInt(conta[i - 1]) - Integer.parseInt(conta[i + 1]);
                    System.out.println(Integer.parseInt(conta[i - 1]) + "-" + Integer.parseInt(conta[i + 1]));
                    break;

                case "*":
                    resultado = Integer.parseInt(conta[i - 1]) * Integer.parseInt(conta[i + 1]);
                    System.out.println(Integer.parseInt(conta[i - 1]) + "*" + Integer.parseInt(conta[i + 1]));
                    break;

                case "/":
                    resultado = Integer.parseInt(conta[i - 1]) / Integer.parseInt(conta[i + 1]);
                    System.out.println(Integer.parseInt(conta[i - 1]) + "/" + Integer.parseInt(conta[i + 1]));
                    break;

                default:
                    ajustarArray(conta, i);
                    break;

            }
            i++;
        }
        System.out.println(resultado);
        contaBruta = "";
    }

    public void ajustarArray(String[] conta, int i) {
        if (i > 1) {
            switch (conta[i - 1]) {
                case "+":
                    conta[i] = "" + (Integer.parseInt(conta[i]) + Integer.parseInt(conta[i - 2]));
                break;
                case "-":
                    conta[i] = "" + (Integer.parseInt(conta[i-2]) - Integer.parseInt(conta[i]));
                break;
                case "*":
                    conta[i] = "" + (Integer.parseInt(conta[i]) * Integer.parseInt(conta[i - 2]));
                break;
                case "/":
                    conta[i] = "" + (Integer.parseInt(conta[i]) / Integer.parseInt(conta[i - 2]));
                break;
            }
        }
    }
}
