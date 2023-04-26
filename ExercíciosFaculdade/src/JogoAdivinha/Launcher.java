package JogoAdivinha;

public class Launcher {
    public static void main(String[] args){
        Jogador um = new Jogador();
        um.setNome("Ricardo");
        um.setValor(4);
        Jogador dois = new Jogador();
        dois.setNome("Josias");
        dois.setValor(2);
        Jogador tres = new Jogador();
        tres.setNome("Igor");
        tres.setValor(9);
        Jogo jogo = new Jogo();
        jogo.comecarJogo(um, dois, tres);
    }
}
