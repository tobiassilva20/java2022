package aula43;

// Nesta aula foi mostrado como a classe object é a classe mãe de todas as outras classes java.
public class ClasseObject {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("Ciências da Computação");

        double[] notas = {10.0, 8.0, 7.0, 7.0};
        aluno.setNotas(notas);

        System.out.println(aluno);

    }
}
