package exercicios.java3.ex16;

import java.util.ArrayList;

public class Produto {
    private  String name;
    private double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("maçã", 5.4);
        Produto p2 = new Produto("banana", 8.0);

        ArrayList<Produto> listaCompras = new ArrayList<>();
        listaCompras.add(p1);
        listaCompras.add(p2);

        double somaPreco = 0;
        for (Produto produto : listaCompras){
            somaPreco += produto.getPrice();
        }

        double precoMedio = somaPreco / listaCompras.size();
        System.out.println("Preço médio dos produtos: R$ " + precoMedio);

    }
}
