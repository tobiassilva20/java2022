package aula29;

// Nesta aula foi ensinado o conceito de Método construtor
public class Construtor {
    public static void main(String[] args) {
        Carro carro = new Carro("Volks", "Gol G5");
        System.out.println(carro.marca + " " + carro.modelo);
    }
}
