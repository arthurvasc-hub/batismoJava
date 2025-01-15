package Basico.Scanner;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * Scanner = É um jeito de trazer o usuario para dentro da aplicação.
         * Objetivo: O usuario vai criar um ninja e vamos validar os dados
         * */



        // Recebendo nome do Ninja
        System.out.println("Digite o nome do ninja: ");
        Scanner caixaDeTexto = new Scanner(System.in);


       String nomeNinja =  caixaDeTexto.nextLine();
       System.out.println("O nome do ninja é : " + nomeNinja);


       // Receber idade do Ninja
        System.out.println("Digite a idade do seu ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é : " + idadeNinja + " anos");

        // Tratamento
        if(idadeNinja >= 18){
            System.out.println("O ninja " + nomeNinja + " ja é maior de idade e pode fazer missões fora da vila");
        } else {
            System.out.println("O ninja " + nomeNinja + " ainda é menor de idade e não pode fazer missões fora da vila");
        }

        // Fechar sempre o Scanner
         caixaDeTexto.close();
    }

}
