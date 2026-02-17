package exercicios.java2.ex06;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa p1 = new IdadePessoa();

        p1.setNome("Natalia");
        p1.setIdade(26);
        p1.verificarIdade();

        IdadePessoa p2 = new IdadePessoa();

        p2.setNome("Julia");
        p2.setIdade(12);
        p2.verificarIdade();
    }
}
