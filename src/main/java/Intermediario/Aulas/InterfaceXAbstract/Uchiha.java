package Intermediario.Aulas.InterfaceXAbstract;

public class Uchiha extends Ninja{
    @Override
    public void tacarKunai() {
        System.out.println("Eu vou lançar uma kunai");
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha() {
    }
}
