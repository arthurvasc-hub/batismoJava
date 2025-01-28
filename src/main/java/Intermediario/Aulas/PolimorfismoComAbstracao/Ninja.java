package Intermediario.Aulas.PolimorfismoComAbstracao;

public abstract class Ninja implements EstrategiaDeCombate{
    String nome;
    String aldeia;
    int idade;

    @Override
    public void estrategiaDeCombate() {
        System.out.println("Meu nome é: " + nome + "e essa é minha estratégia de combate");
    }

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void habilidadeEspecial(){
        System.out.println("Essa é minha habilitado especial ninja");
    }
}
