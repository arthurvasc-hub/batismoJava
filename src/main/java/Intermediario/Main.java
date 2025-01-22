package Intermediario;

public class Main {
    public static void main(String[] args) {
        /*
        * Tudo em JAVA é um objeto.
        * Classes são moldes para criar novos objetos.
        * */


        //Criar um novo ninja - Naruto Uzumaki É UM OBJETO!
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;

        //Criar um novo ninja - Sasuke Uchiha É UM OBJETO!
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;

        sasuke.AtivarSharingan();
        String saudacao = sasuke.saudacoesNinja();
        System.out.println("O ninja: " + sasuke.nome + " disse: " + saudacao);
        int quantoFalta = sasuke.QuantoTempoFaltaParaHokage(50);
        System.out.println("O ninja " + sasuke.nome + " tem " + sasuke.idade + " anos, e precisa de mais " + quantoFalta + " anos para se tornar um Hokage da aldeia da Folha." );

        //Criar um novo ninja - Sakura Haruno É UM OBJETO
        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da Folha";
        sakura.idade = 18;


        System.out.println("Nome do ninja mais odiado na aldeia: " + sasuke.nome);

    }
}
