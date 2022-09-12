package aula49;


// Nesta aula foram explicados os casos em que o bloco finally é utilizado e quando ele é executado ou não
public class TesteDoFinally {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i=0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i]/denominadores[i]));
            } catch (ArithmeticException e0){ // Exceção de um tipo
                System.out.println("Divisão por 0 inválida!");
                // System.exit(0);
                // Caso a linha acima seja descomentada, sempre que um erro for capturado a execução do
                // programa finaliza.
            } catch (ArrayIndexOutOfBoundsException e1) { // Exceção de outro tipo em um catch separado.
                System.out.println("Divisão inválida!");
            }finally {
                System.out.println("Sempre sera impressa");
            }

            // Outra forma possível de realizar tratamento de múltiplos erros.
//            try {
//                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i]/denominadores[i]));
//            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
//                System.out.println("Houve um erro ao realizar a operação!");
//            }
        }
    }
}
