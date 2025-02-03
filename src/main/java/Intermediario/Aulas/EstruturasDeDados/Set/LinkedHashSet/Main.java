package Intermediario.Aulas.EstruturasDeDados.Set.LinkedHashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * LinkedHashSet: Bom quando nao queremos elementos repetidos na lista
         * remove elementos repetidos e é ordenado na forma de alocação
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

        //LinkedHashSet remove os elementos repetidos e ordena na forma de alocação
        Set<String> ninjaSet = new LinkedHashSet<>();
        //Podemos transformar uma lista em LinkedHashSet
        ninjaSet.addAll(ninjaList);
        System.out.println("Set: " + ninjaSet);

        //Para remover, como o Set não possui index, devemos remover passando o elemento/objeto
        ninjaSet.remove("Naruto");
        System.out.println("Set após remoção: " + ninjaSet);


    }
}
