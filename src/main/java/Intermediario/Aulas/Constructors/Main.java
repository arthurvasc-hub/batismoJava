package Intermediario.Aulas.Constructors;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 43, true, NivelNinja.KAGE, 900);
        naruto.mostrarInfo();
        naruto.ganharSabedoria();


        Uzumaki boruto = new Uzumaki("Boruto Uzumaki", "Aldeia da Folha", 40, true, NivelNinja.KAGE, 400);
        boruto.mostrarInfo();
        boruto.ganharSabedoria();

    }
}
