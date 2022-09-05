package aula47;

/*
 * Aula sobre tratamento de exceções no Java
 */
public class Excecao {
    public static void main(String[] args) {
        int[] vetor = new int[4];


        // A linha abaixo irá gerar uma exceção que irá interromper a execução do programa, pois estamos tentando
        // acessar uma possição que não existe no vetor:
        // vetor [4] = 0;

        // O bloco try/catch captura eventuais erros que possam ocorrer e os trata, sem interromper a execução do
        // programa.
        try {
            vetor[4] = 0;
        }catch (IndexOutOfBoundsException exception){
            System.out.println("Erro ao acessar posição no vetor!");
        }

        System.out.println("Esse print será executado.");
    }
}
