package aula24;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Ducato";
        carro1.numPassageiros = 10;
        carro1.capCombustivel = 100;
        carro1.consumoCombustivel = 15;

        Carro carro2 = new Carro();
        carro2.marca = "Volkswagen";
        carro2.modelo = "Fusca";
        carro2.numPassageiros = 4;
        carro2.capCombustivel = 30;
        carro2.consumoCombustivel = 9;

        System.out.println(carro1.marca + " " +carro1.modelo);
        System.out.println(carro2.marca + " " +carro2.modelo);
    }
}
