package aula37;

// Nesta aula foi explicado o conceito de herança entre classes no Java.
public class Heranca {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Professor professor = new Professor();

        // Com o uso da herança a classe Aluno herda os atributos e métodos da classe Usuario
        aluno1.setNome("John Conor");
        aluno1.setEndereco("Rua dos bobos");
        aluno1.setTelefone("98999998888");
        aluno1.setCpf("05005005000");

        professor.setNome("Terminator");
        professor.setEndereco("Los Angeles");
        professor.setTelefone("9899988889");

        System.out.println(professor.getTelefone());
        System.out.println(aluno1.getNome());
    }
}