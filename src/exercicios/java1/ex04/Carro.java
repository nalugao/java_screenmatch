package exercicios.java1.ex04;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
    }

    int idadeCarro(int ano){
        return 2026 - ano;
    }
}
