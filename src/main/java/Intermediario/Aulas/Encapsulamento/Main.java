package Intermediario.Aulas.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 19, 1.72);
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println("Meu nome após alteração com o SET é: " + naruto.getNome());
    }
}
