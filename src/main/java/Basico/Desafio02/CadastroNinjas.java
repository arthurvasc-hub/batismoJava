package Basico.Desafio02;

import java.util.Scanner;

public class CadastroNinjas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] ninjas = new String[10];
        int indexAtual = 0;

        boolean menu = true;

        while(menu) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = input.nextInt();
            input.nextLine();
        switch (escolha) {
                case 1:
                    if(indexAtual <= ninjas.length) {
                        System.out.print("Digite o nome do seu Ninja: ");
                        ninjas[indexAtual] = input.nextLine();
                        System.out.println("Ninja" + " - " + ninjas[indexAtual]+ " - "  + " cadastrado com sucesso!");
                        indexAtual++;
                    };
                    if (indexAtual == ninjas.length) {
                        System.out.println("Numero maximo de ninjas cadastrados atingido, fica pra proxima!");
                        menu = false;
                    }

                    break;
                case 2:
                        System.out.println("Aqui está a lista de ninjas registrados até o momento: ");
                        if(ninjas[0] != null) {
                        for(int i = 0; i <= ninjas.length -1; i++) {
                            System.out.println(ninjas[i]);
                        }}
                        else {
                            System.out.println("Não possui ninjas cadatrados no momento.");
                        }
                        break;
                case 3:
                        System.out.println("Tchau, volte sempre ;)");
                        menu = false;
                        break;
                default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;
            }
        }




    input.close();
    }
}
