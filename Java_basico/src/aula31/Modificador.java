package aula31;

// Nesta aula foi ensinado o conceito de modificadores de acesso (private e public)
public class Modificador {
    public static void main(String[] args) {
        Carro carro = new Carro();

        // Devido ao uso do modificador public o único método disponivel é o calcularCombustivel();
        carro.calcularCombustivel(10);
    }
}
