package aula45;

// Nesta aula foram explicados os conceitos de upcast e downcast
public class Main {

    /*
     * O upcast ocorre quando um objeto de uma superclasse recebe um objeto de uma subclasse
     * exatamente como mostra o exemplo abaixo:
     */
    Aluno aluno = new Aluno("Joao","98888888" );
    Usuario usuario = aluno;

    // Outras formas de realizar o upcast:

    // Automático:
    Usuario usr = new Aluno("Foo", "989898989");

    // Manualmente:
    Usuario usr2 = (Usuario) new Aluno("Bar", "98989898");

    /*
     * O downcast é realizado quando atribui-se um objeto de uma superclasse a um objeto de uma
     * subclasse:
     */
    Usuario usuarioDown = new Usuario("Far", "989898989");
    Aluno alunoDown = (Aluno) usuarioDown;
}
