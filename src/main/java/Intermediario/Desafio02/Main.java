package Intermediario.Desafio02;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninjaBasico = new NinjaBasico("Rock Lee", TipoHabilidade.TAIJUSTU, 17);
        ninjaBasico.executarHabilidades();
        ninjaBasico.mostrarInformações();

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Itachi Uchiha", TipoHabilidade.GENJUSTU,"Sharingan", 18);
        ninjaAvancado.executarHabilidades();
        ninjaAvancado.mostrarInformações();


    }
}
