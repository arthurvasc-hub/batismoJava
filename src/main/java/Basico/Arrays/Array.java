package Basico.Arrays;

import Basico.Desafio01.Ninjas;

public class Array {
    public static void main(String[] args) {

        String[] ninjas  = new String[5];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";
        ninjas[4] = "Kimimaro";

        System.out.println("Primeiro ninja registrado no torenio foi: " + ninjas[0]);
        System.out.println("Nome dos ninjas registrados : ");
        for(String x:ninjas)
            System.out.println(x);
    }
}
