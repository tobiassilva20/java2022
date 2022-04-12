package aula21;

// Nesta aula foi ensinado o uso do laço foreach
public class ForEach {
    public static void main(String[] args) {
        int[] notas = new int[5];
        for (int i=0, max = notas.length; i < max; i++){
            notas[i] = i + 2;
        }

        // Iterando com foreach
        for (int nota: notas) {
            System.out.println(nota);
        }
    }
}
