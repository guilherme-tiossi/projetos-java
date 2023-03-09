import java.util.Scanner;

public class ContadorCaracteres{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Digite um texto: ");
   char[] texto = sc.nextLine().toCharArray();
   int letr = 0;
   int num = 0;
   int otr = 0;
   for(int i = 0; i < texto.length;){
    if(texto[i] >= 'a' && texto[i] <= 'z' || texto[i] >= 'A' && texto[i] <= 'Z'){
      letr++;
    }
    else if(Character.getNumericValue(texto[i]) >= 0 && Character.getNumericValue(texto[i]) <= 9){
      num++;
    }
    else{
      otr++;
    }
    i++;
   }
   System.out.println("A quantidade de letras é " + letr + "\nA quantidade de números é " + num + "\nOutros caracteres tem quantidade de " + otr);
   sc.close();
 } 
}