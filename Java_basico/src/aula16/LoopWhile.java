package aula16;

import java.util.Scanner;

// Nesta aula foram ensinados os usos do laço de repetição While e do While
public class LoopWhile {
    public static void main(String[] args) {
        int i = 0;
        // O laço while repete o bloco de código interno até que a condição seja falsa.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número entre 1 e 9 para ver sua tábuada.");
        System.out.print("Numero: ");
        int numero = scanner.nextInt();
        while (i < 10){
            System.out.println(numero + " X " + (i + 1) + " = " + (i + 1) * numero);
            i++;
        }

        // O laço do while executa o bloco de código e depois verifica se a expressão é verdadeira.
        do{
            System.out.print("Digite um número entre 0 e 9: ");
            numero = scanner.nextInt();
        }while (numero < 1 || numero > 9);
    }
}
