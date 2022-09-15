package aula50;

import java.util.Scanner;

// Classe para exemplificar o uso do throws para passar a responsabilidade sobre o tratamento das Exceptions
public class UsandoThrows {
    public static void main(String[] args) {
        try {
            double numeroLido = lerNum();
            System.out.println("Número lido: " + numeroLido);
        } catch (Exception e) {
            System.out.println("O número lido é inválido!");
            e.printStackTrace();
        }
    }


    // Com o uso do throws a responsabilidade de tratamento das exceções sera passada para que invocar este método.
    public static double lerNum() throws Exception{
        System.out.print("Digite um número decimal: ");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        return num;
    }
}
