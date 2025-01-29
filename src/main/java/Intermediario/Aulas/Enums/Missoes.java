package Intermediario.Aulas.Enums;

public class Missoes {
    String nome;
    RankDeMissoes rank;

    public void exibirDetalhes(){
        System.out.println("Nome da missão: " + nome + "\nRank: " + rank + " (Dificuldade: " + rank.getDificuldade() + ", Nível: " + rank.getNivel() + ")");
    }



    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }
}
