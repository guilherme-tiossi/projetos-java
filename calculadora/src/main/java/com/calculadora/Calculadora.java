package com.calculadora;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculadora {

    private ArrayList<String> conta = new ArrayList<String>();
    private int resultado;

    public void iniciaCalculo(String contaBruta) {
        contaBruta = "4x+x3x*x7x-x2x+x89x/x3x*x46x-x3";
        conta = new ArrayList<String>(Arrays.asList(contaBruta.split("x")));
        System.out.println("conta pré MD: " + conta);
        processaMultDiv();
        System.out.println("conta pré SS: " + conta);
        processaSomSub();
        System.out.println("resultado final = " + resultado);
        contaBruta = "";
    }

    public void calculaMultDiv(int indexListOriginal, int j, String o){
        switch(o){
            case "/":
                resultado = Integer.parseInt(conta.get(indexListOriginal-1-j)) / Integer.parseInt(conta.get(indexListOriginal+1-j));
                conta.set(indexListOriginal-1-j, "" + resultado);
                conta.remove(indexListOriginal-j);
                conta.remove(indexListOriginal-j);
            break;

            case "*":
                resultado = Integer.parseInt(conta.get(indexListOriginal-1-j)) * Integer.parseInt(conta.get(indexListOriginal+1-j));
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
    
    // public void calculaMultDiv2(){
    //     int i = 0;
    //     int j = 0;
    //     for (String c : conta) {
    //         switch(c){
    //             case "*":
    //                 resultado = Integer.parseInt(conta.get(i-1-j)) * Integer.parseInt(conta.get(i+1-j));
    //                 conta.set(i-1-j, "" + resultado);
    //                 conta.remove(i-j);
    //                 conta.remove(i-j);
    //                 j = j + 2;
    //             break;
    //             case "/":
    //                 resultado = Integer.parseInt(conta.get(i-1-j)) / Integer.parseInt(conta.get(i+1-j));
    //                 conta.set(i-1-j, "" + resultado);
    //                 conta.remove(i-j);
    //                 conta.remove(i-j);
    //                 j = j + 2;
    //             break;
    //         }
    //         i++;
    //     }
    // }

    // public void calculaMultDiv1(){
    //     System.out.println(conta);
    //     int i = 0;
    //     ArrayList<Integer> listaMultiplicacao = new ArrayList<Integer>();
    //     ArrayList<Integer> listaDivisao = new ArrayList<Integer>();
    //     for (String c : conta) {
    //         switch(c){
    //             case "*":
    //                 listaMultiplicacao.add(i);
    //             break;
    //             case "/":
    //                 listaDivisao.add(i);
    //         }
            
    //         i++;
    //     }
    //     System.out.println(listaDivisao);
    //     System.out.println(listaMultiplicacao);
    //     int j = 0;
    //     for (Integer m : listaMultiplicacao){
    //         resultado = Integer.parseInt(conta.get(m-1-j)) * Integer.parseInt(conta.get(m+1-j));
    //         conta.set(m-1-j, "" + resultado);
    //         conta.remove(m-j);
    //         conta.remove(m-j);
    //         j = j + 2;
    //     }

    //     for (Integer d : listaDivisao){
    //         resultado = Integer.parseInt(conta.get(d-1-j)) / Integer.parseInt(conta.get(d+1-j));
    //         conta.set(d-1-j, "" + resultado);
    //         conta.remove(d-j);
    //         conta.remove(d-j);
    //         j = j + 2;
    //      }
    // }

    public void processaSomSub(){
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
