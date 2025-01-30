package Intermediario.Aulas.Lists;

import Basico.Arrays.Array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array é limitado, não pode se extender.
        String[] ninjaArray = new String[4];
        ninjaArray[0] = "Ninja1";
        ninjaArray[1] = "Ninja2";
        ninjaArray[2] = "Ninja3";
        ninjaArray[3] = "Ninja4";

        // Listas são flexiveis, podem se extender de acordo com a adição de novos elementos.
        List<String> ninjaList = new ArrayList<String>();

        //Metodo "add" para adicionar um ninja na lista
        ninjaList.add("Ninja1");
        ninjaList.add("Ninja2");
        ninjaList.add("Ninja3");
        ninjaList.add("Ninja4");
        ninjaList.add("Ninja5");
        System.out.println("Lista de ninjas: " + ninjaList.toString());
        System.out.println("-----------------------------------------");

        //Metodo "remove" para remover um ninja da lista
        ninjaList.remove("Ninja5");
        System.out.println("Lista de ninjas após remoção: " + ninjaList.toString());
        System.out.println("-----------------------------------------");

        //Metodo para substituir elementos em uma posição na lista.
        //primeiro parametro: index onde deseja adicionar o novo elemento;
        //segundo parametro: Qual elemento deseja adicionar;
        ninjaList.set(2, "NinjaX");
        System.out.println("Lista de ninjas após substuição de um elemento: " + ninjaList.toString());
        System.out.println("-----------------------------------------");

        //Metodo para ver o tamanho da lista desejada.
        System.out.println("Tamanho da lista de ninjas: " + ninjaList.size());
        System.out.println("-----------------------------------------");



    }
}
