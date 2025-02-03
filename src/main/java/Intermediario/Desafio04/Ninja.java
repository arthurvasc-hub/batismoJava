package Intermediario.Desafio04;

import java.util.LinkedList;

public class Ninja {
    private String nome;
    private int idade;
    private String vila;


        public Ninja(String nome, int idade, String vila)  {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public Ninja() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVila() {
        return vila;
    }


    public void setVila(String vila) {
        this.vila = vila;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja: " + nome + ", idade: " + idade + " anos" + ", Vila: " + vila;
    }
}
