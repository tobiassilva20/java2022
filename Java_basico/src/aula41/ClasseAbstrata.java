package aula41;

// Nesta aula foi explicado o conceito de classes abstratas.
public class ClasseAbstrata {
    public static void main(String[] args) {


        //Usuario usuario = new Usuario("Foo", "9898989"); Por ser uma classe abstrata usuario não pode ser instanciada.
        Usuario aluno = new Aluno("Bar", "00222");
        Usuario professor = new Professor("Bar Foo", "444");

        //usuario.setEndereco("Rio"); uma vez que a classe Usuario é abstrata, esse objeto torna-se inválido.
        aluno.setEndereco("Sp");
        professor.setEndereco("MG");
    }
}