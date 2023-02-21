import java.util.*;

public class ArrayList2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> aulasSemanais = new ArrayList<ArrayList<String>>(); 
        ArrayList<String> dias = new ArrayList<String>(Arrays.asList("Segunda", "Terça", "Quarta", "Quinta", "Sexta"));

        for(int i = 0; i < 5; i++){ //laço for para cada dia da semana
            ArrayList<String> aulasDia = new ArrayList<String>(); //array usado para armazenar temporariamente as aulas do dia antes de ser passado para o array aulasSemanais
            for(int j = 0; j < 6; j++){
                int k = j + 1; //contador usado para conseguir o valor que precede o indicador ordinal(ª) (3ª matéria de X dia)
                System.out.println("Digite a " + k + "ª matéria de " + dias.get(i));
                String materia = sc.nextLine();
                aulasDia.add(materia);
                k = 0; //reinicializando o contador k para o próximo dia
            }
            aulasSemanais.add(aulasDia);
        }

        for(int i = 0; i < 5; i++){
            System.out.print(dias.get(i) + " | ");
        }
        System.out.println("\b");
        for(int j = 0; j < 6; j++){
            System.out.print(aulasSemanais.get(0).get(j) + " | "); //pega o primeiro valor do dia J
            System.out.print(aulasSemanais.get(1).get(j) + " | ");
            System.out.print(aulasSemanais.get(2).get(j) + " | ");
            System.out.print(aulasSemanais.get(3).get(j) + " | ");
            System.out.print(aulasSemanais.get(4).get(j) + " | ");
            System.out.println("\b");
        }
        sc.close();
    }
}