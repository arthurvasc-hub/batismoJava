package Intermediario.Aulas;

public class Main {
    public static void main(String[] args) {
        /*
        * Tudo em JAVA é um objeto.
        * Classes são moldes para criar novos objetos.
        * */


        //Criar um novo ninja - Naruto Uzumaki É UM OBJETO!
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;
        naruto.AtivarModoSabio();

        //Criar um novo ninja - Sasuke Uchiha É UM OBJETO!
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.AtivarSharingan();

        //Criar um novo ninja - Sakura Haruno É UM OBJETO!
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da Folha";
        sakura.idade = 18;
        sakura.AtivarCura();

        //Criar um novo ninja - Hinata Hyuuga É UM OBJETO!
        Hyuuga hinata = new Hyuuga();
        hinata.nome = "Hinata Hyuuga";
        hinata.aldeia = "Aldeia da Folha";
        hinata.idade = 17;
        hinata.AtivarByakugan();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Uzumaki";
        boruto.aldeia = "Aldeia da Folha";
        boruto.idade = 10;
        boruto.ativarOKarma();
        boruto.ativarJougan();
    }
}
