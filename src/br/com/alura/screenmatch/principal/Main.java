package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Filme filme = new Filme("The Matrix", 1999);
        filme.setDuracaoEmMinutos(135);
        filme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());

        filme.exibeFichaTecnica();

        filme.avalia(9);
        filme.avalia(8);
        filme.avalia(9);
        System.out.println("Média de avaliações do filme: " + filme.pegaMedia());

        Serie serie = new Serie("Hunter vs Hunter", 2000);
        serie.setTemporadas(6);
        serie.setEpisodiosPorTemporada(32);
        serie.setMinutosPorEpisodio(24);
        serie.exibeFichaTecnica();
        System.out.println("Duração para maratonar " + serie.getNome() + ": " + serie.getDuracaoEmMinutos());


        Filme filme2 = new Filme("Avatar", 1999);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(filme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
        System.out.println("\nTempo total para maratonar: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filme3 = new Filme("Dogville", 2003);
        filme3.setDuracaoEmMinutos(200);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size()); // tamanho da lista
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome()); //indicando a posição do item com get

        System.out.println(listaDeFilmes); //ajustado no toString na Classe de Filme
    }

}

