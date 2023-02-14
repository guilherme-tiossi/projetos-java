import java.util.Scanner;
public class Calculadora{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Que operação você deseja realizar? (+, -, / ou *)");
    String op = sc.next();
      
    System.out.println("Primeiro número: ");
    int num1 = sc.nextInt();
    int num2 = 0;
    int num3 = 0;

    switch(op){
      case "+":
        System.out.print(num1 + " + ");
        num2 = sc.nextInt();
        num3 = num1 + num2;
      break;
      case "-":
        System.out.print(num1 + " - ");
        num2 = sc.nextInt();
        num3 = num1 - num2;
      break;
      case "/":
        System.out.print(num1 + " / ");
        num2 = sc.nextInt();
        num3 = num1 / num2;
      break;
      case "*":
        System.out.print(num1 + " * ");
        num2 = sc.nextInt();
        num3 = num1 * num2;
      break;
    }
    System.out.println(num1 + op + num2 + "=" + num3);
    sc.close();
    }
}