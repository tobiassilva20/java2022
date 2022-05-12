package aula30;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro (String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){

        // A palavra reservada this faz referencia aos atributos da propria classe.
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public double calcularCombustivel(int km){
        return km/consumoCombustivel;
    }
}
