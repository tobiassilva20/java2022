package aula17;

import java.util.Scanner;

// Nesta aula foi ensinado o uso do laço de repetição for.
public class LacoFor {
    public static void main(String[] args) {
        // O laço for repete um bloco de código uma determinada quantidade de vezes.
        int anterior = 0;
        int atual = 1;
        int proximo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 15: ");
        int termo = scanner.nextInt();

        // Imprime a sequencia de Fibonacci até o 12 termo;
        for (int i=0; i <=termo; i++){
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            System.out.print(proximo);
            if(i < termo){
                System.out.print(" - ");
            }
        }
    }
}
