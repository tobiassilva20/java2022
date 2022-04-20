package aula26;

// Nesta aula foi mostrado métodos com retorno.
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }
}
