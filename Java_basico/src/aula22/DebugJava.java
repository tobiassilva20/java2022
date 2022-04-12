package aula22;

import java.util.Scanner;

// Nesta aula foi ensinado como utilizar o debug na IDE Intellij
public class DebugJava {

    // Para debugar um programa é necessário inserir breakpoints para parar a execução do programa e fazer as inspeções necessárias
    public static void main(String[] args) {
        System.out.println("Digite dois numeros separados por espaço: ");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int resultado = somar(numero1, numero2);
        System.out.println("Soma = " + resultado);
    }

    public static int somar(int num1, int num2){
        return num1 + num2;
    }
}
