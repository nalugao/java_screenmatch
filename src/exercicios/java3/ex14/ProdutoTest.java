package exercicios.java3.ex14;

import java.util.ArrayList;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Maçã", 2.45, 3);
        Produto produto2 = new Produto("Banana", 6.0, 2);
        Produto produto3 = new Produto("Uva", 4.5, 1);

        ArrayList<Produto> compraLista = new ArrayList<>();

        compraLista.add(produto1);
        compraLista.add(produto2);
        compraLista.add(produto3);

        System.out.println(compraLista.size());
        System.out.println(compraLista.get(0).getNome());
        System.out.println(compraLista.get(1).getNome());
        System.out.println(compraLista.get(2).getNome());

        for (Produto produto : compraLista) {
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Laranja", 1.69, 8, "12/03/2026");
        System.out.println(produtoPerecivel);
    }
}
