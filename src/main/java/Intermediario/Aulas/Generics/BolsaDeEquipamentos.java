package Intermediario.Aulas.Generics;

import java.util.ArrayList;
import java.util.List;
/*
* Para criar uma classe generica
* passamos o operador diamante <>, com o T dentro (<T>)
* para identificar que aceitamos qualquer Tipo de dado fornecido.
* Ou seja, um dado generico.
*
* Facilitando a escabilidade, manutenção e possuimos um código reutilizavel e generico.
* */
public class BolsaDeEquipamentos<T> {

    // Da mesma forma que criamos a classe generica
    // Utilizamos o operador diamente com o T (mesmo passado na classe).
    private List<T> equipamentos;

    //Metodo para adicionar equipamentos ninja dentro da bolsa.
    public void adicionarEquipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    //Metodo para substituir itens na bolsa:
    public void substituirEquipamento(int index, T equipamento) {
        equipamentos.set(index, equipamento);
    }

    /*
    * Por que criar um construtor sem parametros e instanciando uma nova ArrayList quando chamado?
    *
    * Resposta:
    *  1. Se você não inicializar a lista no construtor,
    *  o atributo equipamentos começa como null.
    *  Isso causaria erro (NullPointerException) ao tentar adicionar ou modificar elementos.
    *
    * 2. Facilita a criação do objeto sem precisar passar uma lista
    * Se o construtor exigisse uma lista como parâmetro,
    * toda vez que quiséssemos criar uma bolsa nova,
    * teríamos que criar e passar uma lista manualmente.
    * Isso tornaria o código mais chato de usar.
    */
    public BolsaDeEquipamentos() {
        this.equipamentos = new ArrayList<>() {
        };
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }


    // Cria uma lista nova
    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }


    @Override
    public String toString(){
        return equipamentos.toString();
    }
}
