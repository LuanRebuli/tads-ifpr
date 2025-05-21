import java.util.*;
import java.lang.Math;

public class Solucao_04_java {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] v1 = new int[20];
        int[] v2 = new int[10];
        int i, j, encontrado;

        System.out.print(" V1: ");
        for (i = 0; i <= 19; i++) {
            v1[i] = random.nextInt(50);
            System.out.print(Integer.toString(v1[i]) + " ");
        }
        System.out.println(" ");
        System.out.print(" V2: ");
        for (j = 0; j <= 9; j++) {
            v2[j] = random.nextInt(50);
            System.out.print(Integer.toString(v2[j]) + " ");
        }
        System.out.println(" ");
        System.out.print(" Elementos incomuns entre V1 e V2: ");
        for (i = 0; i <= 19; i++) {
            encontrado = 0;
            for (j = 0; j <= 9; j++) {
                if (v1[i] == v2[j]) {
                    encontrado = encontrado + 1;
                }
            }
            if (encontrado == 0) {
                System.out.print(Integer.toString(v1[i]) + " ");
            }
        }
        for (j = 0; j <= 9; j++) {
            encontrado = 0;
            for (i = 0; i <= 19; i++) {
                if (v2[j] == v1[i]) {
                    encontrado = encontrado + 1;
                }
            }
            if (encontrado == 0) {
                System.out.print(Integer.toString(v2[j]) + " ");
            }
        }
    }
}
