package Intermediario.Desafio04;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        LinkedList<Ninja> listDeNinjas = new LinkedList<>();
        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));
        Boolean menu = true;
        Scanner input =  new Scanner(System.in);

        System.out.println("Sistema de gerenciamento de ninjas");
        while(menu){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Listar Ninjas");
            System.out.println("2. Remover Primeiro Ninja");
            System.out.println("3. Adicionar um Ninja no Inicio");
            System.out.println("4. Acessar um Ninja específico");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();
            input.nextLine();

            switch(opcao){
                case 1:
                    exibirListaCompletaDeNinjas(listDeNinjas);
                    break;
                case 2:
                    removerPrimeiroNinja(listDeNinjas);
                    break;
                case 3:
                    Ninja novoNinja = new Ninja();
                    System.out.println("Digite o nome do ninja: ");
                    String nome = input.nextLine();
                    novoNinja.setNome(nome);
                    System.out.println("Digite a idade do ninja: ");
                    int idade = input.nextInt();
                    input.nextLine();
                    novoNinja.setIdade(idade);

                    System.out.println("Digite a vila do ninja: ");
                    String vila = input.nextLine();
                    novoNinja.setVila(vila);
                    adicionarNinjaNaPrimeiraPosicao(listDeNinjas, novoNinja);
                    break;
                case 4:
                    System.out.println("Digite o nome do ninja que você esta procurando: ");
                    nome = input.nextLine();
                    acessarNinjaEspecifico(listDeNinjas,nome);
                    break;
                case 5:
                    menu = false;
                    break;
            }
        }
        input.close();
    }

    private static LinkedList<Ninja> removerPrimeiroNinja(LinkedList<Ninja> ninjas) {
        ninjas.removeFirst();
        System.out.println("Ninja removido com sucesso!");
        System.out.println("Acesse a nova lista para ver o resultado.");
        return ninjas;
    }


    private static LinkedList<Ninja> adicionarNinjaNaPrimeiraPosicao(LinkedList<Ninja> ninjas, Ninja ninja) {
        ninjas.addFirst(ninja);
        System.out.println("Ninja adicionado com sucesso!");
        return ninjas;
    }


    private static void exibirListaCompletaDeNinjas(LinkedList<Ninja> ninjas) {
        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }
    }

    private static void acessarNinjaEspecifico(LinkedList<Ninja> ninjas, String ninjaEspecifico) {
        boolean encontrado = false;
        for(Ninja ninja : ninjas) {
            if(ninja.getNome().equalsIgnoreCase(ninjaEspecifico)) {
                System.out.println(ninja);
                encontrado = true;
                break;
            }
        }
        if(!encontrado) {
            System.out.println("Ninja nao encontrado: " + ninjaEspecifico);
        }
    }
}
