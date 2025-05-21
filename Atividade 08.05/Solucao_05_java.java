import java.util.*;

public class Solucao_05_java {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorIntercalado = new int[20];
        int i;

        for (i = 0; i <= 9; i++) {
            vetorA[i] = random.nextInt(50);
            vetorB[i] = random.nextInt(50);
        }
        System.out.print(" Vetor A: ");
        for (i = 0; i <= 9; i++) {
            System.out.print(Integer.toString(vetorA[i]) + " ");
        }
        System.out.println(" ");
        System.out.print(" Vetor B: ");
        for (i = 0; i <= 9; i++) {
            System.out.print(Integer.toString(vetorB[i]) + " ");
        }
        System.out.println(" ");
        for (i = 0; i <= 9; i++) {
            vetorIntercalado[2 * i] = vetorA[i];
            vetorIntercalado[2 * i + 1] = vetorB[i];
        }
        System.out.print("Vetor V: ");
        for (i = 0; i <= 19; i++) {
            System.out.print(Integer.toString(vetorIntercalado[i]) + " ");
        }
    }
}
