package exercicios.java2.ex07;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setNome("Maçã");
        p1.setPreco(20);

        p1.aplicarDesconto(5);
    }
}
