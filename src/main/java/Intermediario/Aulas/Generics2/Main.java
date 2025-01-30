package Intermediario.Aulas.Generics2;

public class Main {
    public static void main(String[] args) {



        Bolsa<Object> bolsa = new Bolsa<>();
        bolsa.adicionarEquipamento(new Kunai("Kunai de Fogo"));
        bolsa.adicionarEquipamento(new Shuriken(3, "Shuriken invisível"));
        bolsa.adicionarEquipamento(new Pergaminho("Invocação do sapo"));
        System.out.println("---------------------");
        System.out.println("Itens na bolsa: ");
        bolsa.mostrarEquipamentos();


    }
}
