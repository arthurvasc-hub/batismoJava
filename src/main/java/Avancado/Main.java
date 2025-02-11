package Avancado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjas = new ArrayList<>();

        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 16));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 16));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 16));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Shikamaru Nara", "Konoha", 16));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 16));
        ninjas.add(new Ninja("Gaara", "Sunagakure", 16));
        ninjas.add(new Ninja("Temari", "Sunagakure", 18));
        ninjas.add(new Ninja("Kankuro", "Sunagakure", 17));
        ninjas.add(new Ninja("Killer Bee", "Kumogakure", 30));
        ninjas.add(new Ninja("Itachi Uchiha", "Konoha", 21));

        //filtragem por streams
        ninjas.stream()
                .filter(ninja -> ninja.getNome().equals("Naruto Uzumaki"))
                .forEach(System.out::println);


        //Ordenação por nomes
        ninjas.stream()
                .sorted((n1,n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);


        //Mapear por atributo da classe - mostrar todos os valores do atributo na lista.
        ninjas.stream()
                .map(Ninja::getVila)
                .distinct()
                .forEach(System.out::println);


        //Max - mostrar o maior valor
       Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

       System.out.println("O ninja mais velho da competição é: " + ninjaMaisVelho);


    }
}
