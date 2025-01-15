package Basico.Desafio01;

public class Ninjas {
    public static void main(String[] args) {
        String nommeNinja1 = "Arthur Vasconcelos";
        int idadeNinja1 = 25;
        String missao1 = "Limpar as folhas da vila";
        char dificuldadeMissao1 = 'D';
        String statusMissao1 = "incompleta";

        String nommeNinja2 = "Bruno Vasconcelos";
        int idadeNinja2 = 38;
        String missao2 = "Atacar a vila inimiga";
        char dificuldadeMissao2 = 'A';
        String statusMissao2 = "incompleta";

        String nommeNinja3 = "Victor Vasconcelos";
        int idadeNinja3 = 34;
        String missao3 = "Socorrer um gato na árvore";
        char dificuldadeMissao3 = 'C';
        String statusMissao3 = "incompleta";



        if(idadeNinja1 > 23){
            statusMissao1 = "Completa";
        }
        if(idadeNinja2 > 35){
            statusMissao2 = "Completa";
        }

        if(idadeNinja3 > 30) {
            statusMissao3 = "Completa";
        }

        System.out.println("Nome do ninja: " + nommeNinja1 + " / Missão: " + missao1 + " / Dificuldade: " + dificuldadeMissao1 + " / Status: " + statusMissao1);
        System.out.println("Nome do ninja: " + nommeNinja2 + " / Missão: " + missao2 + " / Dificuldade: " + dificuldadeMissao2 + " / Status: " + statusMissao2);
        System.out.println("Nome do ninja: " + nommeNinja3 + " / Missão: " + missao3 + " / Dificuldade: " + dificuldadeMissao3 + " / Status: " + statusMissao3);



    }
}
