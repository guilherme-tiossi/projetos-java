import java.util.Scanner;
public class ReversorString{
  public static void main(String[] args){
    System.out.println("Reversor de texto!\n Digite um texto e ele será revertido:");
    Scanner sc = new Scanner(System.in);
    char[] texto = sc.nextLine().toCharArray();
    for(int i = texto.length - 1; i >= 0; i--){
      System.out.print(texto[i]);
    }
    sc.close();   
  }
}