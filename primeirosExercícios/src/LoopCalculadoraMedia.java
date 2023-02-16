import java.util.Scanner;
import java.util.ArrayList;

public class LoopCalculadoraMedia{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  ArrayList<Integer> valores = new ArrayList<Integer>();
  boolean executar = true;
  int resultado = 0;
   
  System.out.println("Digite números para realizar a média\n0 para sair");
   
  while(executar){
    int num = sc.nextInt();
    if(num > 0){
      valores.add(num);
    }
    else{
       executar = false;
    }
  }
  
  for(int i = 0; i < valores.size();){
    resultado += valores.get(i);
    i++;
  }
  
  System.out.println("A média dos números digitados é " + resultado/valores.size());
  sc.close();
  }
}