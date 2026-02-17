package exercicios.java3.ex13;

import java.util.ArrayList;

public class PessoaTest {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Gloria", 12);
        Pessoa p2 = new Pessoa("Natalia", 25);
        Pessoa p3 = new Pessoa("Marco", 29);

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
