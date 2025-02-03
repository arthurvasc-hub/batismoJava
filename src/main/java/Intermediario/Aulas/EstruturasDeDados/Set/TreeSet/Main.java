package Intermediario.Aulas.EstruturasDeDados.Set.TreeSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Tree: Bom quando nao queremos elementos repetidos na lista
         * remove elementos repetiso e Ordenado de forma natural (A-Z, 1-9) ou com um Comparator personalizado..
         * */

        List<String> ninjaList = new LinkedList<>();
        ninjaList.add("Naruto");
        ninjaList.add("Sasuke");
        ninjaList.add("Sakura");
        ninjaList.add("Kakashi");
        ninjaList.add("Naruto");
        ninjaList.add("Sasuke");

        //Na lista podemos ter elementos repetidos ->
        System.out.println("Lista: " + ninjaList);

        //TreeSet remove os elementos repetidos e Ordena na ordem (A-Z, 1-9)
        Set<String> ninjaSet = new TreeSet<>();
        //Podemos transformar uma lista em TreeSet
        ninjaSet.addAll(ninjaList);
        System.out.println("Set: " + ninjaSet);

        //Para remover, como o Set não possui index, devemos remover passando o elemento/objeto
        ninjaSet.remove("Naruto");
        System.out.println("Set após remoção: " + ninjaSet);


    }
}
