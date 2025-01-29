package Intermediario.Aulas.Enums;

public class Main {
    public static void main(String[] args) {
        Missoes missao1 = new Missoes("Resgatar gato na arvore", RankDeMissoes.D);
        missao1.exibirDetalhes();
        System.out.println("---------------");

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.A);
        missao2.exibirDetalhes();
        System.out.println("---------------");
    }
}
