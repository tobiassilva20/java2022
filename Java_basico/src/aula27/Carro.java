package aula27;

// Nesta aula foram mostrados exemplos de metodos que recebem parametros.
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public double calcularCombustivel(int km){
        return km/consumoCombustivel;
    }
}
