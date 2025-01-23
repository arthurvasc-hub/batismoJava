package Intermediario.Desafio01;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

    public void mostrarInformacoesUchiha(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade especial: " + habilidadeEspecial);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);

    }
}
