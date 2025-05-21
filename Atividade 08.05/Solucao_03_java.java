import java.util.*;

public class Solucao_03_java {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] fatoriais = new int[5];

        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println("Digite um número inteiro:");
            numeros[indice] = scanner.nextInt();
            while (numeros[indice] < 0) {
                System.out.println(numeros[indice] + " não é inteiro positivo.");
                System.out.println("Digite um número inteiro:");
                numeros[indice] = scanner.nextInt();
            }
        }

        for (int indice = 0; indice < numeros.length; indice++) {
            fatoriais[indice] = 1;
            int contador = 1;
            while (contador <= numeros[indice]) {
                fatoriais[indice] *= contador;
                contador++;
            }
        }

        System.out.println("Fatoriais calculados:");
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice] + "! = " + fatoriais[indice]);
        }
    }
}