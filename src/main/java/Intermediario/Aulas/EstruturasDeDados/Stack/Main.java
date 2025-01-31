package Intermediario.Aulas.EstruturasDeDados.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Array: Estática e precisamos citar o tamanho na referencia de memoria;
        String[] ninjaArray = new String[5];


        //Lista: Dinamicas, aumentam e diminui de acordo com a demanda. Com os principais métodos add(), remove(), size(),
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Ninja");
        ninjaList.add("Ninja2");
        ninjaList.remove("Ninja2");
        ninjaList.size(); //System.out.println

        //Stack: LIFO (Last In, First Out.
        // O ultimo elemento a entrar, é o primeiro a sair.
        Stack<String> ninjaStack = new Stack<>();
        //Adiciona um novo elemento ao TOPO da Stack
        ninjaStack.push("Ninja");
        ninjaStack.push("Ninja2");
        ninjaStack.push("Ninja3");
        ninjaStack.push("Ninja4");
        System.out.println("Stack de ninjas: " + ninjaStack);
        //Remove o elemento no TOPO da Stack
        ninjaStack.pop();
        System.out.println("Stack de ninjas após remoção: " + ninjaStack);
        //Passa o elemento no TOPO da Stack
        System.out.println("Elemento no TOPO da Stack: " + ninjaStack.peek());
        //Passa a quantidade de elementos na Stack
        System.out.println("Quantidade de elementos na Stack: " + ninjaStack.size());

    }
}
