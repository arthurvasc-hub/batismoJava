package Intermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;



    // Métodos String, devem retornar uma STRING.
    public String saudacoesNinja(){
        return "Olá, eu sou um ninja";
    }

    // Métodos INT, devem retornar um int.
    public int QuantoTempoFaltaParaHokage(int idadeMinimaParaSeTornarHokage){
        return idadeMinimaParaSeTornarHokage - idade;
    }
}
