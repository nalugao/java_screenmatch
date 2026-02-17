package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.TituloSuperClass;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme = new Filme("The Matrix", 1999);
        filme.avalia(8);
        Filme filme2 = new Filme("Avatar", 1999);
        filme2.avalia(9);
        var filme3 = new Filme("Dogville", 2003);
        filme3.avalia(8);
        Serie serie = new Serie("Hunter vs Hunter", 2000);

        ArrayList<TituloSuperClass> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie);

        for (TituloSuperClass item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filmes && filmes.getClassificacao() > 2) {
                System.out.println(" - Classificação: " + filmes.getClassificacao());
            } else if (item instanceof Serie series){
                System.out.println(" - Nota em revisão");
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Natalia Lugão");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Marco Graziano");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(TituloSuperClass::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + lista);
    }
}


