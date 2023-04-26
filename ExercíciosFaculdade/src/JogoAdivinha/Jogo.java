package JogoAdivinha;

import java.util.Random;

public class Jogo {

    Random rand = new Random();
    int num = rand.nextInt(11);

    public void comecarJogo(Jogador um, Jogador dois, Jogador tres) {
        System.out.println("O número gerado foi " + num);
        int valorUm = um.getValor();
        int valorDois = dois.getValor();
        int valorTres = tres.getValor();

        if (num == valorUm || num == valorDois || num == valorTres) {

            if (num == valorUm) {
                System.out.println("O jogador " + um.getNome() + " é o vencedor!");
            }
            else if (num == valorDois) {
                System.out.println("O jogador " + dois.getNome() + " é o vencedor!");
            }
            else{
                System.out.println("O jogador " + tres.getNome() + " é o vencedor!");
            }
        }
        else{
            System.out.println("Não houveram vencedores...");
        }
    }
}
