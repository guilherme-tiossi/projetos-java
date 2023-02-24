import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Que operação você deseja realizar? (+), (-), (*) ou (/)");
    String operacao = sc.nextLine();
    
    if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")){
    System.out.print("Número um: ");
      int num1 = sc.nextInt();
      System.out.print("Número dois: ");
      int num2 = sc.nextInt();
      Calculadora c = new Calculadora();
        
      switch(operacao){
        case "+":
          c.soma(num1, num2);
        break;
        case "-":
          c.subtracao(num1, num2);
        break;
        case "*":
          c.multiplicacao(num1, num2);
        break;
        case "/":
          c.divisao(num1, num2);
        break;
        default:
        break;
      }
    }
    else{
      System.out.println("Operação inválida.");
    }
    sc.close(); 
    }
  }
