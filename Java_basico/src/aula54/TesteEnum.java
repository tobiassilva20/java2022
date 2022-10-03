package aula54;

// Usando um enum semelhante a uma classe java.
public class TesteEnum {
    public static void main(String[] args) {

        DiaSemana diaSemana = DiaSemana.DOMINGO;

        System.out.println(diaSemana.toString() + ": " + diaSemana.getValor());
    }
}
