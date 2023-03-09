import java.util.Scanner;

public class App {
    //EXERCÍCIO UM : CRIADOR DE "TABELA" COM UM CARACTERE
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Número de colunas:");
        int colunas = sc.nextInt();
        System.out.println("Caractere: ");
        String caractere = sc.next();
        
        for (int i=0; i<linhas; i++){
            System.out.println();
            for (int j=0; j<colunas; j++){
                System.out.print(caractere);
            }
        }
        sc.close();
    }
}
