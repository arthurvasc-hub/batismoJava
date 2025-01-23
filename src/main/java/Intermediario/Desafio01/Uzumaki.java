package Intermediario.Desafio01;

public class Uzumaki extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

    public void mostrarInformacoesUzumaki(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade especial: " + habilidadeEspecial);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);

    }
}
