import java.util.Scanner;

public class Solucao_03_Java {
    public static void main(String[] args) {
        int lado, altura, areadolosango;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o lado do losango!");
        lado = teclado.nextInt();

        System.out.println("Digite a altura do losango!");
        altura = teclado.nextInt();

        areadolosango = lado * altura;

        System.out.println("Área do losango é: " + areadolosango);
    }
}
