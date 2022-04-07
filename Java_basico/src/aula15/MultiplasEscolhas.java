package aula15;

import java.util.Scanner;

public class MultiplasEscolhas {
    public static void main(String[] args) {
        System.out.print("Escolha o dia da semana \n" +
                "[1] - domingo\n" +
                "[2] - segunda-feira\n" +
                "[3] - terça-feira\n" +
                "[4] - quarta-feira\n" +
                "[5] - quinta-feira\n" +
                "[6] - sexta-feira\n" +
                "[7] - sabádo\n" +
                "\n dia: ");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch (opcao){
            case 1 :
                System.out.println("Hoje é domingo!");
                break;
            case 2:
                System.out.println("Hoje é segunda-feira!");
                break;
            case 3:
                System.out.println("Hoje é terça-feira!");
                break;
            case 4:
                System.out.println("Hoje é quarta-feira!");
                break;
            case 5:
                System.out.println("Hoje é quinta-feira!");
                break;
            case 6:
                System.out.println("Hoje é sexta-feira!");
                break;
            case 7:
                System.out.println("Hoje é sábado!");
                break;
            default:
                System.out.println("Dia inválido!");

        }
    }
}
