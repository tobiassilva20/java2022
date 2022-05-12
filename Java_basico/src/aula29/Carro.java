package aula29;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    public double consumoCombustivel;

    // Método connstrutor que recebe os paramentros no momento de criação do objeto.
    Carro(String marca_, String modelo_){
        marca = marca_;
        modelo = modelo_;
    }
    public double calcularCombustivel(int km){
        return km/consumoCombustivel;
    }
}
