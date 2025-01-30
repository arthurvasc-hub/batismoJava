package Intermediario.Aulas.Generics;

public class Main {
    public static void main(String[] args) {


        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja bombaDeFumaca = new EquipamentosNinja("Bomba de Fumaça");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja bombaExplosiva = new EquipamentosNinja("Bomba Explosiva");

        BolsaDeEquipamentos<EquipamentosNinja> bolsa = new BolsaDeEquipamentos<>();
        bolsa.adicionarEquipamento(kunai);
        bolsa.adicionarEquipamento(bombaDeFumaca);
        bolsa.adicionarEquipamento(shuriken);
        System.out.println("Itens na bolsa: " + bolsa);
        System.out.println("----------------------------");

        bolsa.substituirEquipamento(1, bombaExplosiva);
        System.out.println("Itens na bolsa, após a troca do equipamento: " + bolsa);



    }
}
