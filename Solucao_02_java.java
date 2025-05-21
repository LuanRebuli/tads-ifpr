import java.util.*;
import java.lang.Math;

public class Solucao_02_java {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] c1 = new int[10];
        int[] d1 = new int[10];
        int i, tamanho, j, temp;

        tamanho = 0;
        for (i = 0; i <= 9; i++) {
            System.out.println("Digite um numero");;
            vetor[i] = input.nextInt();
            c1[i] = vetor[i];
            d1[i] = vetor[i];
            if (vetor[i] < 0) {
                System.out.println(" O programa será suspenso por usar numero negativo ");
            }
            tamanho = tamanho + 1;
        }
        System.out.print(" Vetor Original: ");
        for (i = 0; i <= 9; i++) {
            System.out.print(" " + vetor[i]);
        }
        System.out.println(" ");
        for (i = 0; i <= tamanho - 2; i++) {
            for (j = 0; j <= tamanho - i - 2; j++) {
                if (c1[j] > c1[j + 1]) {
                    temp = c1[j];
                    c1[j] = c1[j + 1];
                    c1[j + 1] = temp;
                }
            }
        }
        for (i = 0; i <= tamanho - 2; i++) {
            for (j = 0; j <= tamanho - i - 2; j++) {
                if (d1[j] < d1[j + 1]) {
                    temp = d1[j];
                    d1[j] = d1[j + 1];
                    d1[j + 1] = temp;
                }
            }
        }
        System.out.print(" Vetor Crescente ");
        for (i = 0; i <= tamanho - 1; i++) {
            System.out.print(Integer.toString(c1[i]) + " ");
        }
        System.out.println(" ");
        System.out.print(" Vetor decrescente ");
        for (i = 0; i <= tamanho - 1; i++) {
            System.out.print(Integer.toString(d1[i]) + " ");
        }
        System.out.println(" ");
        for (i = 0; i <= 9; i++) {
            if (vetor[i] == 4) {
                System.out.println(" Vetor está completo, programa suspenso! ");
            }
        }
    }
}
