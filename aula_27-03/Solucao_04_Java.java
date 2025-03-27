import java.util.Scanner;

public class Solucao_04_Java {
    public static void main(String[] args) {
        int resultadoDecimoTermo, termo1, razao, CalculoTermo;
        CalculoTermo = 10;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro termo:");
        termo1 = teclado.nextInt();

        System.out.println("Digite a razão:");
        razao = teclado.nextInt();

        resultadoDecimoTermo = termo1 + (CalculoTermo - 1) * razao;

        System.out.println("O decimo termo é: " + resultadoDecimoTermo);
    }
}
