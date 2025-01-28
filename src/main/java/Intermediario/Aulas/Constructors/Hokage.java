package Intermediario.Aulas.Constructors;

public abstract class Hokage {
    //TODO: Adicionar 2 novos metodos: NivelNinja, numeroDeMissoesConcluidas;
    String nome;
    String aldeia;
    int idade;
    boolean vivoOuMorto;
    NivelNinja nivelNinja;
    int numeroDeMissoesConcluidas;

    public abstract void ganharSabedoria();

    public void mostrarInfo(){
        System.out.println("Nome: " + nome + "\n" +"Idade: " + idade + "\n" + "Aldeia: " + aldeia + "\n" + "Vivo? " + vivoOuMorto + "\n" + " Nivel: " + nivelNinja + "\n" + " Missões concluídas: " + numeroDeMissoesConcluidas);
    }
    //AllArgs constructor.
    public Hokage(String nome, String aldeia, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }
    //TODO: Sobrecarga dos construtores
    public Hokage(String nome, String aldeia, int idade, boolean vivoOuMorto, NivelNinja nivelNinja, int numeroDeMissoesConcluidas) {
        this(nome, aldeia, idade, vivoOuMorto);
        this.nivelNinja = nivelNinja;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    //NoArgs constructor.
    public Hokage() {
    }

}
