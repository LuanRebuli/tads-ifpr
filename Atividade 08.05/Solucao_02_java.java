import java.util.*;

public class Solucao_02_java {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] crescente = new int[10];
        int[] decrescente = new int[10];
        int i, tamanho, j, temp;
        Boolean entradaValida;

        tamanho = 0;

        System.out.println("Digite um numero:");
        for (i = 0; i <= 9; i++) {
            entradaValida = true;
            while (entradaValida == true) {
                numeros[i] = input.nextInt();
                if (numeros[i] > 0) {
                    System.out.println("Digite um numero: [" + i + "]");
                    crescente[i] = numeros[i];
                    decrescente[i] = numeros[i];
                    entradaValida = false;
                }else {
                    System.out.println("Digite um numero inteiro.");
                }
            tamanho = tamanho + 1;
            
        }
        }
        System.out.print(" Vetor Original: ");
        for (i = 0; i <= 9; i++) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println(" ");
        for (i = 0; i <= tamanho - 2; i++) {
            for (j = 0; j <= tamanho - i - 2; j++) {
                if (crescente[j] > crescente[j + 1]) {
                    temp = crescente[j];
                    crescente[j] = crescente[j + 1];
                    crescente[j + 1] = temp;
                }
            }
        }
        for (i = 0; i <= tamanho - 2; i++) {
            for (j = 0; j <= tamanho - i - 2; j++) {
                if (decrescente[j] < decrescente[j + 1]) {
                    temp = decrescente[j];
                    decrescente[j] = decrescente[j + 1];
                    decrescente[j + 1] = temp;
                }
            }
        }
        System.out.print(" Vetor Crescente: ");
        for (i = 0; i <= tamanho - 1; i++) {
            System.out.print(Integer.toString(crescente[i]) + " ");
        }
        System.out.println(" ");
        System.out.print(" Vetor decrescente: ");
        for (i = 0; i <= tamanho - 1; i++) {
            System.out.print(Integer.toString(decrescente[i]) + " ");
        }
    }
}
