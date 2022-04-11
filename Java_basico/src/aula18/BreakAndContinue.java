package aula18;

import java.util.Scanner;
// Nesta aula foram ensinados os comandos breake e Continue
public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite um limite: ");
        int limite = sc.nextInt();

        // O break irá para a execução do laço ao encontar o primeiro número divisível por 7
        for (int i = num1; i <= limite; i++){
            if(i % 7 == 0){
                System.out.println("O primeiro numero divisivel por 7 é : " + i);
                break;
            }
        }

        // O continue irá saltar para a próxima iteração do for ao encontrar um multiplo de 7
        for (int j = num1; j <= limite; j++){
            if(j % 7 == 0){
                continue;
            }
            System.out.println("j vale: " + j);
        }
    }
}
