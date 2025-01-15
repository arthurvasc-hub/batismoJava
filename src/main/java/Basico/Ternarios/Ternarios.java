package Basico.Ternarios;

public class Ternarios{
    public static void main(String[] args) {
        /*
        * Ternarios: São maneiras de reduzir o código
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
        * */

        short numeroDeMissoes = 11;

        String nivelNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";

        System.out.println(nivelNinja);
    }
}
