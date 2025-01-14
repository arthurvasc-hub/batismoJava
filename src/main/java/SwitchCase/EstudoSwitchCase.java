package SwitchCase;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        /*
        * SwitchCases: Que servem para gerar casos especificos
        * Objetivo: Pedir pro usuario escolher entre os ninjas
        * switchCase
        * */

        // Pedir dados apra o user
        Scanner scanner = new Scanner(System.in);

        // Opções de escolha para o user
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki ");
        System.out.println("2 - Sasuke Uchiha ");
        System.out.println("3 - Sakura Haruno ");

        // Pedir para o usuario escolher uma das opções

        int escolha = scanner.nextInt();

        System.out.println("Você escolheu o personagem de numero " + escolha);


        // Reação ao escolher um personagem

        switch (escolha){
            case 1:
                System.out.println("Você escolheu o personagem: Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o personagem: Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu o personagem: Sakura Haruno");
                break;
                default:
                System.out.println("Essa opção que você escolheu não existe, tente novamente.");
                break;
        }


        // Fechando o scanner
        scanner.close();
    }
}

