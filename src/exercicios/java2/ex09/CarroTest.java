package exercicios.java2.ex09;

public class CarroTest {
    public static void main(String[] args) {
        CarroModelo meuCarro = new CarroModelo();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}

