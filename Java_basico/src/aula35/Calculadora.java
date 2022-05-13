package aula35;

public class Calculadora {
    // Uma função recursiva tem a capacidade de chamar a si mesma.
    public static int calcularFatorial(int num){
        if(num == 1){
            return 1;
        }
        return num * calcularFatorial(num - 1);
    }
}
