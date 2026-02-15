public class Filme {
    String nome;
    int anoDeLancamento;
    boolean isIncluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //para criar metodo, colocar void
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }


    double mediaAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
