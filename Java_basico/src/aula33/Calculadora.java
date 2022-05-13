package aula33;

public class Calculadora {
    // A sobrecarga de métodos é utilizada reescrevendo o método com tipos e/ ou quantidade de paramentros diferentes.
    // Também é possível realizar a sobrecarga de métodos construtores.
    public int soma(int num1, int num2){
        return num1 + num2;
    }

    public double soma(double num1, double num2){
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int soma(int[] numerosInteiros){
        int total = 0;
        for (int i = 0, size = numerosInteiros.length; i < size; i++){
            total += numerosInteiros[i];
        }
        return total;
    }
}
