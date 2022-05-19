package aula40;

// Nesta aula foi explicado o uso de polimorfismo associado com herança
public class Polimorfismo {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Foo", "9898989");
        Usuario aluno = new Aluno("Bar", "00222");
        Usuario professor = new Professor("Bar Foo", "444");

        usuario.setEndereco("Rio");
        aluno.setEndereco("Sp");
        professor.setEndereco("MG");

        // O método irá gerar uma saída diferente por conta do polimorfismo.
        System.out.println(usuario.gerarEtiquetaDeEndereço());
        System.out.println(aluno.gerarEtiquetaDeEndereço());
        System.out.println(professor.gerarEtiquetaDeEndereço());
    }
}