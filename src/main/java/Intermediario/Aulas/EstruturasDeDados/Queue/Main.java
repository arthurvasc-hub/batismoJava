package Intermediario.Aulas.EstruturasDeDados.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*
        * Queue/Listas:
        * FIFO (First In, First Out)
        * Seguem uma ordenação, só posso tirar o primeiro elemento inserido por operação.
        * HEAD(primeiro da fila) / TAIL(ultimo da fila)
        * HEAD se altera a dar um poll(), removendo o primeiro da fila, passando o HEAD para o proximo elemento;
        * TAIL se altera apenas ao adicionar um novo elemento na fila, passando o TAIL para o ultimo adicionado;
        * não consigo remover o ultimo elemento (TAIL), apenas esvaziando a fila toda;
        * Metodos mais usados -> add(), poll(), peek(), isEmpty();
        * */

        Queue<String> ninjaQueue = new LinkedList<>(); //queue é uma extensão de LinkedList<>();

        //Adicionar um novo elemento na fila
        ninjaQueue.add("Ninja");
        ninjaQueue.add("Ninja2");
        ninjaQueue.add("Ninja3");
        System.out.println("Fila : " + ninjaQueue);


        //Remover o primeiro elemento da fila
        ninjaQueue.poll();
        System.out.println("Fila : " + ninjaQueue);

        //Ver o proximo elemento que vai ser retirado (HEAD)
        System.out.println("Primeiro da fila (HEAD): " + ninjaQueue.peek());

        //Esvaziando a fila
        ninjaQueue.poll();
        System.out.println("Fila : " + ninjaQueue);
        ninjaQueue.poll();
        System.out.println("Fila : " + ninjaQueue);

        //Verificar se a fila está vazia
        if(ninjaQueue.isEmpty()){
            System.out.println("A lista está vazia.");
        }


    }
}
