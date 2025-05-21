import java.util.*;
import java.lang.Math;

public class Solucao_03_java {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] v1 = new int[5];
        int[] fatorial = new int[5];
        int j, i;

        i = 0;
        for (i = 0; i <= 4; i++) {
            System.out.println("Digite um Numero Inteiro");
            v1[i] = input.nextInt();
            while (v1[i] < 0) {
                System.out.println(Integer.toString(v1[i]) + " não é inteiro ");
                System.out.println(" Digite um numero inteiro ");
                v1[i] = input.nextInt();
            }
        }
        for (i = 0; i <= 4; i++) {
            fatorial[i] = 1;
            j = 1;
            while (j <= v1[i]) {
                fatorial[i] = fatorial[i] * j;
                j = j + 1;
            }
        }
        System.out.println(" Fatorias calculadas ");
        for (i = 0; i <= 4; i++) {
            System.out.println(Integer.toString(v1[i]) + "! = " + fatorial[i]);
        }
    }
}
