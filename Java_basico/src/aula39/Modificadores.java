package aula39;

// Nesta aula foi visto o que é visível em uma subclasse com o uso dos modificadores de acesso.
public class Modificadores {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Bar", "9898989");

        // Atributo default está acessível pois pertencem ao mesmo pacote
        aluno.atributo_default = "Foo";

        // Atributo protected está acessível pois pertencem ao mesmo pacote
        aluno.atributo_protected = "Bar";
    }

}
