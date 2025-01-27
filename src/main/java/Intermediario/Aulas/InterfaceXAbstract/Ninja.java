package Intermediario.Aulas.InterfaceXAbstract;

public abstract class Ninja {
    //Não pode ser instanciada.
    //Classes abstratas aceitam atributos com valores maleaveis.
    String nome;
    String aldeia;
    int idade;

    //Classes abstratas aceitam métodos abstrados ou normais.
    public abstract void tacarKunai();

    public void ninjaNome(){
        System.out.println("Meu nome é : " + nome);
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja() {
    }
}
