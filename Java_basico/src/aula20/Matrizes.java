package aula20;
// Nesta aula foram estudados os arrays multidimensionais (matrizes)
public class Matrizes {
    public static void main(String[] args) {

        // Armazenar 4 notas de 4 alunos
        double[][] notasAlunos = new double[4][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 8;

        notasAlunos[1][0] = 10;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 9;
        notasAlunos[1][3] = 8;

        notasAlunos[2][0] = 10;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 9;
        notasAlunos[2][3] = 8;

        notasAlunos[3][0] = 10;
        notasAlunos[3][1] = 7;
        notasAlunos[3][2] = 9;
        notasAlunos[3][3] = 8;

        for (int i = 0, max = notasAlunos.length; i < max; i++){
            System.out.print("Aluno: " + (i+1) + " -");
            for(int j = 0, maxx = notasAlunos[0].length; j < maxx; j++) {
                System.out.print(" nota: " + (j + 1) + " : " + notasAlunos[i][j] + " | ");
            }
            System.out.println("\n");
        }
    }
}
