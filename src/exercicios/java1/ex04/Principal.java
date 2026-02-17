package exercicios.java1.ex04;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.modelo = "Fiat";
        carro1.ano = 2013;
        carro1.cor = "Vermelho";

        carro1.exibirFichaTecnica();

        System.out.println("A idade do carro é: "+carro1.idadeCarro(carro1.ano)+" anos.");
    }
}
