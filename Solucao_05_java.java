import java.util.*;
import java.lang.Math;

public class Solucao_05_java {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v = new int[20];
        int i, b;

        for (i = 0; i <= 9; i++) {
            v1[i] = random.nextInt(50);
            v2[i] = random.nextInt(50);
        }
        System.out.print(" Vetor A: ");
        for (i = 0; i <= 9; i++) {
            System.out.print(Integer.toString(v1[i]) + " ");
        }
        System.out.println(" ");
        System.out.print(" Vetor B: ");
        for (i = 0; i <= 9; i++) {
            System.out.print(Integer.toString(v2[i]) + " ");
        }
        System.out.println(" ");
        for (i = 0; i <= 9; i++) {
            v[2 * i] = v1[i];
            v[2 * i + 1] = v2[i];
        }
        System.out.print("Vetor V: ");
        for (i = 0; i <= 19; i++) {
            System.out.print(Integer.toString(v[i]) + " ");
        }
    }
}
