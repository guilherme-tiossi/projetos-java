package com.calculadora;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculadora {

    private ArrayList<String> conta = new ArrayList<String>();
    private int resultado;

    public void iniciaCalculo(String contaBruta) {
        conta = new ArrayList<String>(Arrays.asList(contaBruta.split("x")));
        calculaMultDiv();
        calculaSomSub();
        System.out.println("resultado final = " + resultado);
        contaBruta = "";
    }

    public void calculaMultDiv(){

        int i = 0;
        ArrayList<Integer> listaMultiplicacao = new ArrayList<Integer>();
        ArrayList<Integer> listaDivisao = new ArrayList<Integer>();
        for (String c : conta) {
            switch(c){
                case "*":
                    listaMultiplicacao.add(i);
                    break;
                case "/":
                    listaDivisao.add(i);
            }
            i++;
        }

        int j = 0;
        for (Integer m : listaMultiplicacao){
            resultado = Integer.parseInt(conta.get(m-1-j)) * Integer.parseInt(conta.get(m+1-j));
            conta.set(m-1-j, "" + resultado);
            conta.remove(m-j);
            conta.remove(m-j);
            j = j + 2;
        }

        for (Integer d : listaDivisao){
            resultado = Integer.parseInt(conta.get(d-1-j)) / Integer.parseInt(conta.get(d+1-j));
            conta.set(d-1-j, "" + resultado);
            conta.remove(d-j);
            conta.remove(d-j);
            j = j + 2;
         }
    }

    public void calculaSomSub(){
        int i = 0;
        for (String c : conta) {
            switch (c) {
                case "+":
                    resultado = Integer.parseInt(conta.get(i - 1)) + Integer.parseInt(conta.get(i + 1));
                    break;

                case "-":
                    resultado = Integer.parseInt(conta.get(i - 1)) - Integer.parseInt(conta.get(i + 1));
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
