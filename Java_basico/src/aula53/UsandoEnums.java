package aula53;

// Nesta aula foi abordado o uso básico de enumeradores.
public class UsandoEnums {

    public static void main(String[] args) {
        imprimeDias(DiaSemana.SEGUNDA);
        imprimeDias(DiaSemana.TERCA);
        imprimeDias(DiaSemana.QUARTA);
        imprimeDias(DiaSemana.QUINTA);
        imprimeDias(DiaSemana.SEXTA);
        imprimeDias(DiaSemana.SABADO);
        imprimeDias(DiaSemana.DOMINGO);
    }

    public static void imprimeDias(DiaSemana diaSemana){
        switch (diaSemana){
            case SEGUNDA :
                System.out.println("Segunda-feira");
                break;

            case TERCA :
                System.out.println("Terça-feira");
                break;

            case QUARTA:
                System.out.println("Quarta-feira");
                break;

            case QUINTA:
                System.out.println("Quinta-feira");
                break;

            case SEXTA:
                System.out.println("Sexta-feira");
                break;

            case SABADO:
                System.out.println("Sábado");
                break;

            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }
}
