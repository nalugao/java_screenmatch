package exercicios.ex01.ex03;
//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibirFichaTecnica(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de Lançamento: "+anoLancamento);
        System.out.println("Soma das avaliações: "+avaliacao);
        System.out.println("Numero de avaliações: "+numAvaliacao);
    }

    void avaliaMusica(double nota){
        avaliacao += nota;
        numAvaliacao++;
    }

    double mediaAvalia(){
        return avaliacao / numAvaliacao;
    }
}
