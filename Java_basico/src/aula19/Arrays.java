package aula19;
// Nesta aula foram explorados os conceitos relativos a arrays
public class Arrays {

    // O uso básico de arrays é agrupar variáveis de mesmo tipo;
    public static void main(String[] args) {

        // Armazenando as temperaturas de uma semana.
        double[] temperaturas = new double[7];
        temperaturas[0] = 31.3;
        temperaturas[1] = 30.3;
        temperaturas[2] = 32.3;
        temperaturas[3] = 33.7;
        temperaturas[4] = 34.3;
        temperaturas[5] = 31.3;
        temperaturas[6] = 33.1;

        // Saber o tamanho do array;
        System.out.println("Tamanho:" + temperaturas.length);

        for (int i=0, max = temperaturas.length; i < max; i++ ){
            System.out.println("Dia " + (i+1)+" : " + temperaturas[i]);
        }
    }
}
