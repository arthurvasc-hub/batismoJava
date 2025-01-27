package Intermediario.Aulas.Polimorfismo;

public class Uzumaki extends Ninja {

    // Anotação para sobreescrever os métodos "gerais", dando prioridade para o que esta nessa classe.
    @Override
    public void HabilidadeEspecial() {
        System.out.println("Eu sou " + nome + " e essa é minha habilidade especial UZUMAKI, habilidade com o ar");
    }
}
