package aula52;


// Nesta aula foi mostrado como é possível criar exceções personalizadas que apresentam textos especificados.
public class ExceptionPersonalizada {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 5,  16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 2, 4};

        for (int i=0; i < numeros.length; i++){

            try {
                if (numeros[i] % 2 != 0){
                    throw new MinhaExcecao(); // Aqui será lançada a exceção personalizada
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i]/denominadores[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Houve um erro ao realizar a operação!");
            } catch (Exception e) {
                System.out.println("Houve um erro.");
                e.printStackTrace();
            }
        }
    }
}
