package exercicios.java3.ex15;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(); //instanciei um objeto da Classe Animal
        if (animal instanceof Cachorro){  //"O objeto animal é um Cachorro?"
            Cachorro cachorro = (Cachorro) animal; //casting
            System.out.println("Sim"); // retornaria isso se " Animal animal = new Cachorro(); "
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

    }
}
