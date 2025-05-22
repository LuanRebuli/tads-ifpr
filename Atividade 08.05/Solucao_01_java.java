import java.util.*;

public class Solucao_01_Java {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] entrada = new int[20];
        int[] sequencias = new int[20];
        int i, contagemUm, contagemZero, indiceSeq, numero = 0;
        boolean entradaValida;

        System.out.println("Digite números entre 0 e 1: ");
        for (i = 0; i <= 19; i++) {
            entradaValida = true;
            while (entradaValida == true) {
                numero = input.nextInt();
                if (numero == 0 || numero == 1) {
                    System.out.println("Digite números entre 0 e 1: " + i);
                    entradaValida = false;
                } else {
                    System.out.println("O número deve ser 0 ou 1, digite novamente, por favor: ");
                }
            }
            entrada[i] = numero;
        }
        System.out.print("Entrada: ");
        for (i = 0; i <= 19; i++) {
            System.out.print(Integer.toString(entrada[i]) + " ");
        }

        System.out.println(" ");

        System.out.print("Saída: ");
        if (entrada[0] == 1) {
            System.out.print(" 0 ");
        }
        
        contagemUm = 0;
        contagemZero = 0;
        indiceSeq = 0;
        for (i = 0; i <= 19; i++) {
            sequencias[i] = -1;
            if (entrada[i] == 1) {
                contagemUm = contagemUm + 1;
                if (contagemZero > 0) {
                    sequencias[indiceSeq] = contagemZero;
                    indiceSeq = indiceSeq + 1;
                    contagemZero = 0;
                }
            }
            if (entrada[i] == 0) {
                contagemZero = contagemZero + 1;
                if (contagemUm > 0) {
                    sequencias[indiceSeq] = contagemUm;
                    indiceSeq = indiceSeq + 1;
                    contagemUm = 0;
                }
            }
            if (entrada[i] == entrada[19]) {
                if (contagemZero > 0) {
                    sequencias[indiceSeq] = contagemZero;
                }
                if (contagemUm > 0) {
                    sequencias[indiceSeq] = contagemUm;
                }
            }
        }
        for (i = 0; i <= 19; i++) {
            if (sequencias[i] == -1) {
            } else {
                System.out.print(Integer.toString(sequencias[i]) + " ");
            }
        }
    }
}
