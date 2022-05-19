package aula39.subpacote;

import aula39.Aluno;
import aula39.Usuario;

public class ClasseDeAcessoSubPacote extends Usuario {
    public void verificarAcesso(){
        Aluno aluno = new Aluno("A", "9");
        // Mesmo sendo um subpacote o atributo default não pode ser acessado.
        //aluno.atributo_default = "Foo";

        // Mesmo sendo um subpacote o atributo protected não pode ser acessado.
        //aluno.atributo_protected = "Foo";

        // Apenas métodos e atributos públicos podem ser acessados pela
        aluno.atributo_public = "Bar";
    }
}
