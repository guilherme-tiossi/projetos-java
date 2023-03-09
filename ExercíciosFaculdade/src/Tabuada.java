import java.util.Scanner;
public class Tabuada{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Insira um número para realizarmos a tabuada: ");    
    int num = sc.nextInt();
    
    for(int i = 0; i<=10; i++){
        System.out.println(num + " * " + i + " = " + num*i);    
    }

    sc.close();
}
}