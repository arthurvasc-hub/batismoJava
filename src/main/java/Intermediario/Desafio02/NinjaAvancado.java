package Intermediario.Desafio02;

public class NinjaAvancado implements Ninja {
    String nome;
    TipoHabilidade habilidade;
    String especialidade;
    int idade;


    public NinjaAvancado(String nome, TipoHabilidade habilidade, String especialidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.idade = idade;
    }

    public NinjaAvancado() {
    }

    @Override
    public void mostrarInformações() {
        System.out.println("Nome: " + nome + "\nHabilidade: " + habilidade + "\nIdade: " + idade + "\nEspecialidade: " + especialidade);
    }

    @Override
    public void executarHabilidades() {
        System.out.println("Meu nome é: " + nome + " e minha habilidade é " + habilidade);
    }

}
