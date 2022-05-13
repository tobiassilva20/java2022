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
        inteiros[1] = 34;
        inteiros[2] = 35;
        inteiros[3] = 36;

        for (int i=0, size = inteiros.length; i < size; i++){
            System.out.println(inteiros[i]);
        }
        System.out.println(calculadora.soma(inteiros));
    }

}
