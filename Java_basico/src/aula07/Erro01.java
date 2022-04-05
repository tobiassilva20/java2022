package aula07;

// Nesta aula serão explicados os principais erros apresentados pelo Java.
public class Erro01 {
    public static void main(String[] args) {
        // Erro de sintaxe identificados em tempo de compilação.
        //System.out.println("Ola mundo!")

        // Erro de semântica identificado em tempo de execução.
        int soma = 10 - 5;
        System.out.println(soma);
    }
}
