package aula31;

public class Carro {

    // Com o uso do modificador de acesso private o acesso aos atributos da classe fica restrito à própria classe.
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    // O modificador public deixa o acesso liberado para classes externas.
    public double calcularCombustivel(int km){
        return km/consumoCombustivel;
    }
}
