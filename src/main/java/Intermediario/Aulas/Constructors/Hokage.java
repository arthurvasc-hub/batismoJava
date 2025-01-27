package Intermediario.Aulas.Constructors;

public abstract class Hokage {
    String nome;
    String aldeia;
    int idade;
    boolean vivoOuMorto;


    public abstract void ganharSabedoria();

    public void mostrarInfo(){
        System.out.println("Nome: " + nome + "\n" +"Idade: " + idade + "\n" + "Aldeia: " + aldeia + "\n" + "Vivo? " + vivoOuMorto);
    }
    //AllArgs constructor.
    public Hokage(String nome, String aldeia, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }

    //NoArgs constructor.
    public Hokage() {
    }

}
