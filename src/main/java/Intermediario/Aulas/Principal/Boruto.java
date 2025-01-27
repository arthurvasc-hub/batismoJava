package Intermediario.Aulas.Principal;

public class Boruto extends Uzumaki implements UzumakiHyuga {

    @Override
    public void ativarOKarma() {
        System.out.println("Meu nome é " + nome + " e meu karma foi ativado! Eu sou um Uzumaki Hyuga");
    }

    @Override
    public void ativarJougan() {
        System.out.println("Meu nome é " + nome + " e meu jougan foi ativado! Eu sou um Uzumaki Hyuga");
    }
}
