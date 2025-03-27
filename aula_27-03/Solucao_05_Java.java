import java.util.Scanner;

public class Solucao_05_Java {
    public static void main(String[] args) {
        double resultadoDecimoTermo;
        int termo1, razao, termoCalcular;
        termoCalcular = 10 - 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro termo:");
        termo1 = teclado.nextInt();

        System.out.println("Digite a razão:");
        razao = teclado.nextInt();

        resultadoDecimoTermo = termo1 * Math.pow(razao, termoCalcular);

        System.out.println("O decimo termo é: " + resultadoDecimoTermo);
    }
}
