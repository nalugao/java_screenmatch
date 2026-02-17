package exercicios.java2.ex10;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarPAraReal(double valorDolar) {
        double cotacaoDolar = 5.15;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$ " + valorReal);
    }
}
