import java.util.*;
import java.lang.Math;

public class Solucao_01_java {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] v1 = new int[20];
        int[] v2 = new int[20];
        int i, c1, c0, p, num;
        boolean verdade;

        System.out.println("Digite números entre 0 e 1: ");
        for (i = 0; i <= 19; i++) {
            verdade = true;
            while (verdade == true) {
                num = input.nextInt();
                if (num == 0 || num == 1) {
                    verdade = false;
                } else {
                    System.out.println("Erro - O número deve ser 0 ou 1, digite novamente, por favor: ");
                }
            }
            v1[i] = num;
        }
        for (i = 0; i <= 19; i++) {
            System.out.print(Integer.toString(v1[i]) + " ");
        }
        System.out.println(" ");
        if (v1[0] == 1) {
            System.out.print(" 0 ");
        }
        c1 = 0;
        c0 = 0;
        p = 0;
        for (i = 0; i <= 19; i++) {
            v2[i] = -1;
            if (v1[i] == 1) {
                c1 = c1 + 1;
                if (c0 > 0) {
                    v2[p] = c0;
                    p = p + 1;
                    c0 = 0;
                }
            }
            if (v1[i] == 0) {
                c0 = c0 + 1;
                if (c1 > 0) {
                    v2[p] = c1;
                    p = p + 1;
                    c1 = 0;
                }
            }
            if (v1[i] == v1[19]) {
                if (c0 > 0) {
                    v2[p] = c0;
                }
                if (c1 > 0) {
                    v2[p] = c1;
                }
            }
        }
        for (i = 0; i <= 19; i++) {
            if (v2[i] == -1) {
            } else {
                System.out.print(Integer.toString(v2[i]) + " ");
            }
        }
    }
}
