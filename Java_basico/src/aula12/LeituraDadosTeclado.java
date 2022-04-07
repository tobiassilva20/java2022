package aula12;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


// Nesta aula foi explicado como ler dados do terminal com a classe Scanner;
public class LeituraDadosTeclado {
    public static void main(String[] args) {
        // Objeto Scanner responsável pela captura dos dados digitados.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Olá! " + nomeCompleto);
        System.out.print("Por favor, digite seu ano de nascimento: ");
        int idade = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);

        System.out.println("Olá " + nomeCompleto + " você tem: " + (anoAtual - idade) + " ano(s)");
    }
}
