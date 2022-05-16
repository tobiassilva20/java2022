package aula35;

import java.util.Scanner;

// Nesta aula foi explicada como é utizada a recursividade.
public class Recursividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número entre 0 e 12: ");
        int num = sc.nextInt();
        int fatorial = Calculadora.calcularFatorial(num);
        System.out.println(num + "! = " + fatorial);
    }
}