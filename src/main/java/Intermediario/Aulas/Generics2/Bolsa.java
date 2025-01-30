package Intermediario.Aulas.Generics2;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private List<T> equipamentos;

    public void adicionarEquipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    public void mostrarEquipamentos() {
        for (T equipamento : equipamentos) {
            System.out.println(equipamento);
        }
    }


    public Bolsa() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    @Override
    public String toString() {
        return "Equipamentos na bolsa: " + equipamentos.toString();
    }
}
