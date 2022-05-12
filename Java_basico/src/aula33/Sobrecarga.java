package aula33;

// Nesta aula foi ensinado como é realizada a sobrecarga de métodos
public class Sobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.soma(33, 33));
        System.out.println(calculadora.soma(2.0, 8.5));
        System.out.println(calculadora.soma(33,33,33));

        int[] inteiros = new int[4];
        inteiros[0] = 33;
        inteiros[1] = 33;
        inteiros[2] = 33;
        inteiros[3] = 33;
        System.out.println(calculadora.soma(inteiros));
    }

}
