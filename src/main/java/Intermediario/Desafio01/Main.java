package Intermediario.Desafio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.missao = "Socorrer Sakura Haruno";
        naruto.nivelDificuldade = "D";
        naruto.statusMissao = "Em andamento";
        naruto.habilidadeEspecial = "Modo Sabio";



        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Matar Itachi Uchiha";
        sasuke.nivelDificuldade = "S";
        sasuke.statusMissao = "Em andamento";
        sasuke.habilidadeEspecial = "Sharingan";


        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(naruto);
        ninjas.add(sasuke);

        while(menu) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Exibir informações de todos os ninjas");
            System.out.println("3. Alterar habilidade especial");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = input.nextInt();
            input.nextLine();
                switch (escolha) {
                    case 1:
                            System.out.println("Você escolheu cadastrar um novo ninja!");
                            System.out.println("Primeiro você deve escolhar a familia do seu ninja.");
                            System.out.println(" Digite a numeração da familia que você deseja: \n 1- Uchiha \n 2- Uzumaki\n 3- Ninja bastardo");
                            int escolhaFamilia = input.nextInt();
                            input.nextLine();
                        switch(escolhaFamilia){
                            case 1:
                                Uchiha ninjaUchiha = new Uchiha();
                                System.out.println("Digite o nome do seu ninja: ");
                                    ninjaUchiha.nome = input.nextLine();
                                System.out.println("Digite a idade do seu ninja: ");
                                    ninjaUchiha.idade = input.nextInt();
                                    input.nextLine();
                                System.out.println("Por ser da da familia UCHIHA, você possui a habilidade: " + sasuke.habilidadeEspecial + " deseja alterar?\n  sim/nao: ");
                                    String escolhaHabilidade = input.nextLine();
                                        if(escolhaHabilidade.equals("sim")){
                                            System.out.println("Digite a nova habilidade para sua família: ");
                                            ninjaUchiha.habilidadeEspecial = input.nextLine();
                                            System.out.println("A habilidade da familia Uchiha agora é: \n" + ninjaUchiha.habilidadeEspecial + "\n\n");
                                        } else if (escolhaHabilidade.equalsIgnoreCase("nao")) {
                                            System.out.println("A sua família continua com a habilidade do Sharigan.");
                                        } else {
                                            System.out.println("Escolha inválida");
                                            System.out.println("Tente novamente.");
                                            menu = false;
                                            break;
                                        };
                                System.out.println("Atribua uma missão para seu ninja:  ");
                                    ninjaUchiha.missao = input.nextLine();
                                System.out.println("Qual nivel de dificuldade que você considera essa missão? (F, E, D, C, B, A, S) ");
                                    ninjaUchiha.nivelDificuldade = input.nextLine().toUpperCase();;
                                System.out.println("Qual o status da missão? (Em andamento ou Concluída) ");
                                    ninjaUchiha.statusMissao = input.nextLine();
                                System.out.println("Ninja cadastrado com sucesso. ");
                                ninjas.add(ninjaUchiha);
                                ninjaUchiha.mostrarInformacoesUchiha();
                                break;
                            case 2:
                                Uzumaki ninjaUzumaki = new Uzumaki();
                                System.out.println("Digite o nome do seu ninja: ");
                                    ninjaUzumaki.nome = input.nextLine();
                                System.out.println("Digite a idade do seu ninja: ");
                                    ninjaUzumaki.idade = input.nextInt();
                                    input.nextLine();
                                System.out.println("Por ser da da familia UZUMAKI, você possui a habilidade: " + naruto.habilidadeEspecial + " deseja alterar?\n  sim/nao: ");
                                    String escolhaHabilidade2 = input.nextLine();
                                    input.nextLine();
                                        if(escolhaHabilidade2.equalsIgnoreCase("sim")){
                                           System.out.println("Digite a nova habilidade para sua família: ");
                                           naruto.habilidadeEspecial = input.nextLine();
                                           System.out.println("A habilidade da familia Uchiha agora é: \n" + ninjaUzumaki.habilidadeEspecial + "\n\n");
                                        } if (escolhaHabilidade2.equals("nao")) {
                                            System.out.println("A sua família continua com a habilidade do modo sábio.");
                                        } else {
                                            System.out.println("Escolha inválida");
                                            System.out.println("Tente novamente.");
                                            menu = false;
                                            break;
                                        };
                                System.out.println("Atribua uma missão para ele:  ");
                                    ninjaUzumaki.missao = input.nextLine();
                                System.out.println("Qual nivel de dificuldade que você considera essa missão? (F, E, D, C, B, A, S) ");
                                    ninjaUzumaki.nivelDificuldade = input.nextLine().toUpperCase();;
                                System.out.println("Qual o status da missão? (Em andamento ou Concluída) ");
                                    ninjaUzumaki.statusMissao = input.nextLine();
                                System.out.println("Ninja cadastrado com sucesso. ");
                                ninjas.add(ninjaUzumaki);
                                ninjaUzumaki.mostrarInformacoesUzumaki();
                                break;

                            case 3:
                                Ninja ninjaComun = new Ninja();
                                System.out.println("Digite o nome do seu ninja: ");
                                ninjaComun.nome = input.nextLine();
                                System.out.println("Digite a idade do seu ninja: ");
                                ninjaComun.idade = input.nextInt();
                                input.nextLine();
                                System.out.println("Atribua uma missão para ele:  ");
                                ninjaComun.missao = input.nextLine();
                                System.out.println("Qual nivel de dificuldade que você considera essa missão? (F, E, D, C, B, A, S) ");
                                ninjaComun.nivelDificuldade = input.nextLine().toUpperCase();
                                System.out.println("Qual o status da missão? (Em andamento ou Concluída) ");
                                ninjaComun.statusMissao = input.nextLine();
                                System.out.println("Ninja cadastrado com sucesso. \n");
                                ninjaComun.mostrarInformacoes();
                                ninjas.add(ninjaComun);
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                            } break;
                    case 2:
                            System.out.println("Informações dos ninjas cadastrados: \n");
                            for(Ninja n : ninjas){
                                n.mostrarInformacoes();
                            }
                            break;
                    case 3:
                        System.out.println("Você só pode alterar as habilidades dos ninjas principais.");
                        System.out.println("Eles são: 1 - " + naruto.nome + " ou 2 - " +sasuke.nome + "\n digite o numero do ninja que você quer alterar." );
                        int alterarHabilidade = input.nextInt();
                        input.nextLine();
                        switch (alterarHabilidade) {
                            case 1:
                                System.out.println("Você escolheu alterar a habilidade do " + naruto.nome + ".");
                                System.out.println("Digite a nova habilidade desejada: ");
                                naruto.habilidadeEspecial = input.nextLine();
                                System.out.println("Habilidade alterada com sucesso!");
                                break;
                            case 2:
                                System.out.println("Você escolheu alterar a habilidade do " + sasuke.nome + ".");
                                System.out.println("Digite a nova habilidade desejada: ");
                                sasuke.habilidadeEspecial = input.nextLine();
                                System.out.println("Habilidade alterada com sucesso!");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        } break;
                    case 4:
                            System.out.println("Você escolheu sair, até mais!");
                            menu = false;
                            break;
                    default:
                        System.out.println("Opção invalida");
                        break;
            }
        }
        input.close();
    }
}
