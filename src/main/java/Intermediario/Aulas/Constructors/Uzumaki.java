package Intermediario.Aulas.Constructors;

public class Uzumaki extends Hokage {
    @Override
    public void ganharSabedoria() {
        System.out.println("Por ser um hokage o " + nome + " está ganhando Sabedoria");
    }

    public Uzumaki(String nome, String aldeia, int idade, boolean vivoOuMorto) {
        super(nome, aldeia, idade, vivoOuMorto);
    }

    public Uzumaki() {
    }
}
