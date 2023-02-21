import java.util.*;

public class ArrayList2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> semana = new ArrayList<ArrayList<String>>(); 
        ArrayList<String> dias = new ArrayList<String>(Arrays.asList("Segunda", "Terça", "Quarta", "Quinta", "Sexta"));
        for(int i = 0; i < 5; i++){
            ArrayList<String> dia = new ArrayList<String>(); 
            for(int j = 0; j < 6; j++){
                String materia = sc.next();
                dia.add(materia);
            }
            semana.add(dia);
        }

        for(int i = 0; i < 5; i++){
            System.out.print(dias.get(i) + " | ");
        }
        System.out.println("\b");
        for(int j = 0; j < 6; j++){
            System.out.print(semana.get(0).get(j) + " | ");
            System.out.print(semana.get(1).get(j) + " | ");
            System.out.print(semana.get(2).get(j) + " | ");
            System.out.print(semana.get(3).get(j) + " | ");
            System.out.print(semana.get(4).get(j) + " | ");
            System.out.println("\b");
        }
        sc.close();
    }
}