package aula52;

// Para criar uma exceção personalizada a classe deve extender a superclasse Exception
public class MinhaExcecao extends Exception{
    public MinhaExcecao(){
        super("Divisão não exata!");
    }
}
