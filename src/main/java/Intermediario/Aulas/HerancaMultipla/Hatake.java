package Intermediario.Aulas.HerancaMultipla;

import Intermediario.Aulas.HerancaMultipla.Interfaces.AnbuInterface;
import Intermediario.Aulas.HerancaMultipla.Interfaces.HokageInterface;
import Intermediario.Aulas.HerancaMultipla.Interfaces.SharinganInterface;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface {


    @Override
    public void boasVindasAnbu() {
        System.out.println("Olá " + nome + " seja bem vindo a força de elite Anbu");
    }

    @Override
    public void boasVindasHokage() {
        System.out.println("Olá " + nome + " você se tornou um hokage");

    }

    @Override
    public void ativarSharingan() {
        System.out.println("Eu sou: " + nome + " e ativo meu sharingan");

    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake() {
    }
}
