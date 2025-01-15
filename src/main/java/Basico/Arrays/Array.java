package Basico.Arrays;

import Basico.Desafio01.Ninjas;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo de referência
        // arrays inicializam como null
        String[] ninjas  = new String[6];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";
        ninjas[4] = "Kimimaro";

        /*
            System.out.println("Primeiro ninja registrado no torenio foi: " + ninjas[0]);
            System.out.println("Nome dos ninjas registrados : ");
            for(String x:ninjas)
                System.out.println(x);
            */

        System.out.println(ninjas[5]);

        // int inicializam como 0
        int[] idade = new int[2];
            idade[0] = 10;
            System.out.println(idade[1]);

        // boolean inicializam como false
        boolean[] verdadeiroOuFalso = new boolean[1];
            System.out.println(verdadeiroOuFalso[0]);

        // double inicializam como 0.0
        double[] flutuante = new double[2];
        flutuante[0] = 10;
            System.out.println(flutuante[1]);
    }
}
