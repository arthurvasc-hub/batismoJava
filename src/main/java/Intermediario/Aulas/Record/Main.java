package Intermediario.Aulas.Record;

public class Main {
    public static void main(String[] args) {

        //Instanciando o objeto sem record
        Ninja ninja = new Ninja("Naruto Uzumaki", 18, 1.75);
        System.out.println(ninja);

        //Instanciando atraves do record
        NinjaRecord ninjaRecord = new NinjaRecord("Sasuke Uchiha", 19, 1.80);
        ninjaRecord.obterDetalhes();
    }
}
