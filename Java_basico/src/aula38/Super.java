package aula38;

// Nesta aula foi explicado o uso da palavra reservada super.
public class Super {
    public static void main(String[] args) {
        // As os dados passados por meio do construtor da classe aluno serão enviadas para a
        // superclasse através da palavra reservada super;
        Aluno aluno = new Aluno("Jovencio", "9898888888");

        Professor professor = new Professor("Lourenço", "9866635454");

        System.out.println(aluno.getNome() + " - " + aluno.getTelefone());
        System.out.println(professor.getNome() + " - " + professor.getTelefone());
    }
}
