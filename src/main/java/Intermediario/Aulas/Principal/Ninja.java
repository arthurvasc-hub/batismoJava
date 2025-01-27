package Intermediario.Aulas.Principal;

public class Ninja {
    public String nome;
    public String aldeia;
    public int idade;



    // Métodos String, devem retornar uma STRING.
    public String saudacoesNinja(){
        return "Olá, eu sou um ninja";
    }

    // Métodos INT, devem retornar um int.
    public int QuantoTempoFaltaParaHokage(int idadeMinimaParaSeTornarHokage){
        return idadeMinimaParaSeTornarHokage - idade;
    }
}
