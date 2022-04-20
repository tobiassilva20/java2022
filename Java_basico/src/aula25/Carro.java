package aula25;

// Nesta aula foram explorados o que são métodos básicos.
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia deste carro é :" + capCombustivel * consumoCombustivel + "km");
    }
}
