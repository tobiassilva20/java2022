package aula14;

import java.util.Scanner;

// Nesta aula foram vistos os controles de fluxo condicionais do Java
public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if((idade >= 16 && idade < 18) || idade > 70){
            System.out.println("Voto facultativo");
        }else if(idade >= 18){
            System.out.println("Voto obrigatório");
        }else{
            System.out.println("Não vota");
        }
    }
}
