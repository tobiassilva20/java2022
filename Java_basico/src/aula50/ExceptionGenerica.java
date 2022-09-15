package aula50;


// Nesta aula foram abordados os assuntos stacktrace e throws
public class ExceptionGenerica {

        // A classe Throwable é a super classe de todas as Exceptions no Java.
        public static void main(String[] args) {
            int[] numeros = {4, 8, 16, 32, 64, 128};
            int[] denominadores = {2, 0, 4, 8, 0};

            for (int i=0; i < numeros.length; i++){
                try{
                    System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i]/denominadores[i]));
                } catch (Exception e0){ // Em um projeto real Java algumas exceptions são salvas em Logs utilizando a
                                        // biblioteca Log4j e utiliza-se o método .getMessage() e o printStackTrace();
                    System.out.println(e0.getMessage());
                    e0.printStackTrace();
                }
            }
        }
}
// A diferença entre Error e Exception é que o primeiro finaliza a execução do programa e o segundo pode ser tratado
// o erro é capturado e tratado e prossegue com a execução do programa.