package exercicios.java2.ex08;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}
