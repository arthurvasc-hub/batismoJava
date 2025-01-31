package Intermediario.Aulas.Record;

import java.util.Objects;

public class Ninja {

    /*
    * Como os atributos são FINAL, posso criar um RECORD.
    * Reduzindo as linhas de código e tendo o mesmo objetivo dessa class Ninja.
    * */
    private final String nome;
    private final int idade;
    private final double altura;

    public Ninja(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return idade == ninja.idade && Double.compare(altura, ninja.altura) == 0 && Objects.equals(nome, ninja.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, altura);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
