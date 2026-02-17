package exercicios.java1.ex02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculadora numero = new Calculadora();

        System.out.println("Digite um numero: ");
        Scanner leitura = new Scanner(System.in);
        int numeroDigitado = leitura.nextInt();

        System.out.println("O dobro de "+ numeroDigitado + " é " + numero.dobro(numeroDigitado));
    }
}
