package Basico.Arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        String[][] aldeiaENinjas = new String[3][3];

        //Matriz [x][y]. onde [x] é a primeira linha de referencia, [y] coluna de referencia
        aldeiaENinjas[0][0] = "Aldeia Arthur";
        aldeiaENinjas[0][1] = "Mamofas";
        aldeiaENinjas[0][2] = "Pitchula";

        aldeiaENinjas[1][0] = "Aldeia Maroca";
        aldeiaENinjas[1][1] = "Bola";
        aldeiaENinjas[1][2] = "Bolotita";

        aldeiaENinjas[2][0] = "Aldeia Chatão";
        aldeiaENinjas[2][1] = "Benji";
        aldeiaENinjas[2][2] = "QUIFÔ";



        for (int i = 0; i < aldeiaENinjas.length; i++) {
            System.out.println(aldeiaENinjas[i][0] + ": 1º ninja - " + aldeiaENinjas[i][1] + " - 2º ninja - " + aldeiaENinjas[i][2]);

        }
    }
}
