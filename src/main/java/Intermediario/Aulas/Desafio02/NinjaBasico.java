package Intermediario.Aulas.Desafio02;

public class NinjaBasico implements Ninja {
    String nome;
    TipoHabilidade habilidade;
    int idade;


    public NinjaBasico(String nome, TipoHabilidade habilidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    public NinjaBasico() {
    }


    public void mostrarInformações() {
        System.out.println("Nome: " + nome + "\nHabilidade: " + habilidade + "\nIdade: " + idade);
    }


    public void executarHabilidades() {
        System.out.println("Meu nome é: " + nome + " e minha habilidade é " + habilidade);
    }
}
