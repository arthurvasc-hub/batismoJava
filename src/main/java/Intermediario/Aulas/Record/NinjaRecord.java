package Intermediario.Aulas.Record;

public record NinjaRecord(String nome, int idade, double altura) {
    //Não preciso criar Getters, toString(), hashCode(), Construtores, pois ja está embutido no record.
    //Posso criar métodos como uma classe normal
    //Reduzindo linhas de código.

    public void obterDetalhes(){
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura);
    }
}
