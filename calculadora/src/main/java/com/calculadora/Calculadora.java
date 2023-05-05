package com.calculadora;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculadora {

    private ArrayList<String> conta = new ArrayList<String>();
    private double resultado;

    public void iniciaCalculo(String contaBruta) {
        conta = new ArrayList<String>(Arrays.asList(contaBruta.split("x")));
        processaMultDiv();
        processaSomSub();
        System.out.println("resultado final = " + resultado);
        contaBruta = "";
    }

    public void calculaMultDiv(int indexListOriginal, int j, String o){
        switch(o){
            case "/":
                resultado = Double.parseDouble(conta.get(indexListOriginal-1-j)) / Double.parseDouble(conta.get(indexListOriginal+1-j));
                conta.set(indexListOriginal-1-j, "" + resultado);
                conta.remove(indexListOriginal-j);
                conta.remove(indexListOriginal-j);
            break;

            case "*":
                resultado = Double.parseDouble(conta.get(indexListOriginal-1-j)) * Double.parseDouble(conta.get(indexListOriginal+1-j));
                conta.set(indexListOriginal-1-j, "" + resultado);
                conta.remove(indexListOriginal-j);
                conta.remove(indexListOriginal-j);
            break;
        }

    }

    public void processaMultDiv(){
        int i = 0;
        String operacoes = "";
        for (String c : conta) {
            switch(c){
                case "*":
                    operacoes = operacoes + i + "x*x";
                break;
                case "/":
                    operacoes = operacoes + i + "x/x";
                break;
            }
            i++;
        }
        ArrayList<String> listaOp = new ArrayList<String>(Arrays.asList(operacoes.split("x")));

        int k = 0;
        int j = 0;
        for (String o : listaOp){
            if(o.contains("*")){
                int indexListOriginal = Integer.parseInt(listaOp.get(k-1));
                calculaMultDiv(indexListOriginal, j, o);
                j = j + 2;
            }if(o.contains("/")){
                int indexListOriginal = Integer.parseInt(listaOp.get(k-1));
                calculaMultDiv(indexListOriginal, j, o);
                j = j + 2;
            }
            k++;
        }
    }

    public void processaSomSub(){
        int i = 0;
        for (String c : conta) {
            switch (c) {
                case "+":
                    resultado = Double.parseDouble(conta.get(i - 1)) + Double.parseDouble(conta.get(i + 1));
                    break;

                case "-":
                    resultado = Double.parseDouble(conta.get(i - 1)) - Double.parseDouble(conta.get(i + 1));
                    break;

                default:
                    if (i > 1) {
                        conta.set(i, "" + resultado);
                    }
                    break;

            }
            i++;
        }
    }
}
