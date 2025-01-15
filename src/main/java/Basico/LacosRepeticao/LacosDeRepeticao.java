package Basico.LacosRepeticao;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição: Vão repetir infinitamente ou ate atingir o parametro desejado
        * WHILE & FOR
        * */

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 50;

        while(numeroDeClones < numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O naruto criou um clone das sombras " + numeroDeClones);
        }

        for (int i = 1; i <= numeroMaximoDeClones; i++) {
            System.out.println("O naruto criou um clone das sombras " + i);

        }
    }
}
