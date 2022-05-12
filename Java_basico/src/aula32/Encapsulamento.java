package aula32;

// Nesta aula foram explicados os conceito de encapsulamento e o uso dos métodos Getters e Setters.
public class Encapsulamento {
    public static void main(String[] args) {
        Carro carro = new Carro();

        // Uso do método Setter para configurar um atributo privado.
        carro.setMarca("Volkswagem");
        carro.setModelo("Gol G5");

        // Uso do método Getter para recuperar o valor de um atributo.
        System.out.println(carro.getMarca() + " " + carro.getModelo());
    }
}
