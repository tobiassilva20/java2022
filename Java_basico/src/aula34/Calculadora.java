package aula34;

public class Calculadora {
    // A palavra reservada static permite que os atributos e métodos da classe sejam acessados sem a necessidade de
    // criação de uma instancia
    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    public static double soma(double num1, double num2){
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static int soma(int[] numerosInteiros){
        int total = 0;
        for (int i = 0, size = numerosInteiros.length; i < size; i++){
            total += numerosInteiros[i];
        }
        return total;
    }
}