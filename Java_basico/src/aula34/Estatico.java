package aula34;

// Nesta aula foi ensinado como utilizar variáveis e métodos estáticos
public class Estatico {
    public static void main(String[] args) {
        // Para acessar métodos e atributos estáticos basta escrever o nome da classe seguido de . (ponto)

        // Chamada de um método estático
        int soma = Calculadora.soma(33, 34);
        System.out.println(soma);
    }
}
