package JogoAdivinha;

public class Jogador {
    String nomePlayer;
    int valor;

    public void setNome(String s){
        this.nomePlayer = s;
    }

    public String getNome(){
        return this.nomePlayer;
    }

    public void setValor(int i){
        this.valor = i;
    }

    public int getValor(){
        return this.valor;
    }
}
