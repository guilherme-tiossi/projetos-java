import java.util.Scanner;

public class TrocaNumeros{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    int numAuxiliar;    

    System.out.print("Digite o primeiro número: ");
    num1 = sc.nextInt();
    System.out.print("Digite o segundo número: ");
    num2 = sc.nextInt();
    numAuxiliar = num1;
    num1 = num2;
    num2 = numAuxiliar;
    System.out.printf("O número um é %d e o número dois é %d\n", num1, num2);
    sc.close();
}
}