package exercicios.java2.ex07;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double desconto) {
        double descPorcentagem = desconto / 100;
        double descValor = this.getPreco() * descPorcentagem;
        this.setPreco(this.getPreco() - descValor);

        System.out.println("Novo valor: R$ " + this.getPreco());
    }
}
