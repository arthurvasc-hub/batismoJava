package Intermediario.Aulas.EstruturasDeDados.Lists.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        * LinkedLists:
        * Listas boas para conseguir resolver o problema de modificação no meio da lista
        * pois não precisam reordenar todos os outros elementos e index
        * são referenciadas através de ponteiros
        * 1 elemento aponta para outro, e assim vai, ate o final da lista.
        * Facil alocação, dificil procura pois devemos percorrer toda a lista encadeada para achar o final dela
        * */


        LinkedList<String> listaEncadeada = new LinkedList<>();
        listaEncadeada.add("A");
        listaEncadeada.add("B");
        listaEncadeada.add("C");
        listaEncadeada.add("D");
        listaEncadeada.add("E");
        System.out.println(listaEncadeada);

        //Adiciona na primeira posição, sem remover ninguem
        listaEncadeada.addFirst("Z");
        System.out.println(listaEncadeada);

        //Remove o primeiro da lista
        listaEncadeada.removeFirst();
        System.out.println(listaEncadeada);

        //Remove o ultimo da lista
        listaEncadeada.removeLast();
        System.out.println(listaEncadeada);

        //Altera o primeiro elemento para o elemento desejado, removendo o antigo da lista
        listaEncadeada.set(0, "Z");
        System.out.println(listaEncadeada);


    }
}
