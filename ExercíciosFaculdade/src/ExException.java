import java.util.Scanner;
public class ExException{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    System.out.println("Digite um número");
    try{
      numero = sc.nextInt();
    System.out.println(numero + " é um número válido!");
    }catch(java.util.InputMismatchException e){
      System.out.println("Tipo de dado inválido.");
    }
    sc.close();
  }
}