package Intermediario.Aulas.InterfaceXAbstract;

public class Uzumaki implements NinjaInterface {
    @Override
    public void tacarShuriken() {
        System.out.println("Meu nome é: " + nome + " e vou tacar uma shuriken");
    }

    public Uzumaki() {
    }
}
