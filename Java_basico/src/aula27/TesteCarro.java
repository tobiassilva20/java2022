package aula27;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Ducato";
        carro.numPassageiros = 10;
        carro.capCombustivel = 100;
        carro.consumoCombustivel = 1.5;

        System.out.println("Calculo de combustível: " + carro.calcularCombustivel(10));
    }
}
