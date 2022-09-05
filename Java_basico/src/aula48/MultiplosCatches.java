package aula48;

// Nesta aula foi mostrado como é possível realizar a captura de múltiplas exceções no Java
public class MultiplosCatches {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i=0; i < numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i]/denominadores[i]));
            } catch (ArithmeticException e0){ // Exceção de um tipo
                System.out.println("Divisão por 0 inválida!");
            } catch (ArrayIndexOutOfBoundsException e1) { // Exceção de outro tipo em um catch separado.
                System.out.println("Divisão inválida!");
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
