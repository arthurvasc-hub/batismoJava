package Intermediario.Aulas.Generics2;

public class Shuriken {
    private String nome;
    private int tamanho;

    public Shuriken(int tamanho, String nome) {
        this.tamanho = tamanho;
        this.nome = nome;
    }

    public Shuriken(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Shuriken: " + nome + " - Tamanho: " + tamanho;
    }
}
