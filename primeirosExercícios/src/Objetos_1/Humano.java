package Objetos_1;


public class Humano{
    String nome;
    int idade;
    String profissao;
    String nacionalidade;
    Humano(String nome, int idade, String profissao, String nacionalidade){ //construtor
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.nacionalidade = nacionalidade;
    }

    void aniversario(){
        this.idade++;
        System.out.println("Parabéns, " + this.nome + "! Agora você tem " + this.idade + " anos");
    }

    void profissaoNova(String p){
        this.profissao = p;
        System.out.println(this.nome + " mudou de profissão e agora ocupa o cargo de " + this.profissao); 
    }
}