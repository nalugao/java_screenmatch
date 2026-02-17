package exercicios.java2.ex11;

public class CalculadoraSalaRetangular implements CalculoGeometrico {


    @Override
    public void calculoArea(int altura, int largura) {
        int area = altura * largura;
        System.out.println("A área do retângulo é " + area);
    }

    @Override
    public void calculoPerimetro(int altura, int largura) {
        int perimetro = 2 * (altura + largura);
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
}
