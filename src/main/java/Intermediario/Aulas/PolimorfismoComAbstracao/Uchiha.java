package Intermediario.Aulas.PolimorfismoComAbstracao;

public class Uchiha extends Ninja {

    @Override
    public void habilidadeEspecial(){
        System.out.println("Essa é minha habilidade especial Uchiha!");
    }

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
