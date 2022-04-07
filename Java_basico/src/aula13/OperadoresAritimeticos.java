package aula13;

// Neste aula foi ensinado sobre os principais tipos de operadores do Java e como usá-los

import java.util.Scanner;
/*
 * Operadores aritiméticos + - / *
 * Operadores relacionais < > <= >=
 * Operadores lógicos ! && ||
 * Operadores de atibuição = += *= /=
 * Operadores de precedência ()
 * Operadores de incremento e decremento ++ --
 */
public class OperadoresAritimeticos {
    public static void main(String[] args) {
        // ex.:
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite dois numero inteiros positivos separados por espaço: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        System.out.println("A soma e igual a: " + (numero1 + numero2));
        System.out.println("A diferença e igual a: " + (numero1 - numero2));
        System.out.println("O produto e igual a: " + (numero1 * numero2));
        System.out.println("A divisao e igual a: " + (numero1 / numero2));
    }
}
