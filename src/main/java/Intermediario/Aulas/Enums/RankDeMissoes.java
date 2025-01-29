package Intermediario.Aulas.Enums;

public enum RankDeMissoes {
    D("iniciante", 1),
    C("fácil", 2),
    B("moderada", 3),
    A("dificil", 4),
    S("altissima", 5);

    private String dificuldade;
    private int nivel;

    RankDeMissoes(String dificuldade, int nivel) {
        this.dificuldade = dificuldade;
        this.nivel = nivel;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public int getNivel() {
        return nivel;
    }
}





