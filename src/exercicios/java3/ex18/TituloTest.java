package exercicios.java3.ex18;

import java.util.ArrayList;
import java.util.Collections;

public class TituloTest implements Comparable<TituloTest>{
    public String nome;

    public TituloTest(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public int compareTo(TituloTest outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    public static void main(String[] args) {
        ArrayList<TituloTest> arrTitulos = new ArrayList<>();

        arrTitulos.add(new TituloTest("Jojo"));
        arrTitulos.add(new TituloTest("Death Note"));
        arrTitulos.add(new TituloTest("Hunter vs Hunter"));

        System.out.println(arrTitulos);

        Collections.sort(arrTitulos);
        for (TituloTest titulo : arrTitulos) {
            System.out.println(titulo);
        }
    }
}
