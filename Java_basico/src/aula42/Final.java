package aula42;

// Nesta aula foi demonstrado o uso da palavra reservada final
public class Final {
    public static void main(String[] args) {

        // Uso de final em classes
        Usuario usuario = new Usuario();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // Uso de final em atributos
        System.out.println(Constates.URL_UM);
        System.out.println(Constates.URL_DOIS);

    }
}
