package exercicios.java3.ex21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex21 {
    public static void main(String[] args) {
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: ");
        for (String item : listaPolimorfica) {
            System.out.println(item);
        }

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: ");
        for (String nome : listaPolimorfica) {
            System.out.println(nome);
        }

    }
}
