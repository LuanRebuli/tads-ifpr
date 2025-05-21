import java.util.*;

public class Solucao_04_java {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] vetorPrincipal = new int[20];
        int[] vetorComparacao = new int[10];
        int i, j, achou;

        System.out.print(" V1: ");
        for (i = 0; i <= 19; i++) {
            vetorPrincipal[i] = random.nextInt(50);
            System.out.print(Integer.toString(vetorPrincipal[i]) + " ");
        }
        System.out.println(" ");
        System.out.print(" V2: ");
        for (j = 0; j <= 9; j++) {
            vetorComparacao[j] = random.nextInt(50);
            System.out.print(Integer.toString(vetorComparacao[j]) + " ");
        }
        System.out.println(" ");
        System.out.print(" Elementos incomuns entre V1 e V2: ");
        for (i = 0; i <= 19; i++) {
            achou = 0;
            for (j = 0; j <= 9; j++) {
                if (vetorPrincipal[i] == vetorComparacao[j]) {
                    achou = achou + 1;
                }
            }
            if (achou == 0) {
                System.out.print(Integer.toString(vetorPrincipal[i]) + " ");
            }
        }
        for (j = 0; j <= 9; j++) {
            achou = 0;
            for (i = 0; i <= 19; i++) {
                if (vetorComparacao[j] == vetorPrincipal[i]) {
                    achou = achou + 1;
                }
            }
            if (achou == 0) {
                System.out.print(Integer.toString(vetorComparacao[j]) + " ");
            }
        }
    }
}
