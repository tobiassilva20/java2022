package aula28;

// Importação da classe de um pacote externo;
import aula27.Carro;

// Nesta aula foram explicados os conceitos sobre organização de pacotes e como realizar os imports.
public class Pacotes {
    public static void main(String[] args) {

        // Uso de uma classe de um pacote diferente
        Carro carro = new Carro();
        carro.consumoCombustivel = 100;
        double consumo = carro.calcularCombustivel(250);
        System.out.println(consumo);
    }
}
