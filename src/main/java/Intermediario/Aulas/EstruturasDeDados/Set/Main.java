package Intermediario.Aulas.EstruturasDeDados.Set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        * HashSet: Bom quando nao queremos elementos repetidos na lista
        * remove elementos repetiso e não tem ordenação, sem ordenação (ordem imprevisível).
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

        //Set remove os elementos repetidos
        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.add("Naruto");
        ninjaSet.add("Sasuke");
        ninjaSet.add("Kakashi");
        ninjaSet.add("Naruto");
        ninjaSet.add("Sasuke");
        System.out.println("Set: " + ninjaSet);

        //Podemos transformar uma lista em HashSet
        ninjaSet.addAll(ninjaList);
        System.out.println("Set da ninjaList: " + ninjaSet);


        //Para remover, como o Set não possui index, devemos remover passando o elemento/objeto
        ninjaSet.remove("Naruto");
        System.out.println("Set após remoção: " + ninjaSet);



    }
}
