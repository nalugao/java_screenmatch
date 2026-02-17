package exercicios.java3.ex18;

import java.util.ArrayList;
import java.util.Collections;

public class Titulo implements Comparable<Titulo>{
    public String nome;

    public Titulo(String nome) {
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
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    public static void main(String[] args) {
        ArrayList<Titulo> arrTitulos = new ArrayList<>();

        arrTitulos.add(new Titulo("Jojo"));
        arrTitulos.add(new Titulo("Death Note"));
        arrTitulos.add(new Titulo("Hunter vs Hunter"));

        System.out.println(arrTitulos);

        Collections.sort(arrTitulos);
        for (Titulo titulo : arrTitulos) {
            System.out.println(titulo);
        }
    }
}
