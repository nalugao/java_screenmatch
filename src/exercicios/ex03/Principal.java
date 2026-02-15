package exercicios.ex01.ex03;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "Me adora";
        musica1.artista = "Pitty";
        musica1.anoLancamento = 2011;

        musica1.avaliaMusica(8);
        musica1.avaliaMusica(9);
        musica1.avaliaMusica(10);
        musica1.exibirFichaTecnica();
        System.out.println("Média das avaliações: "+musica1.mediaAvalia());
    }
}
