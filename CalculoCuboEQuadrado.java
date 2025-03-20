import java.util.Scanner;

public class CalculoCuboEQuadrado {
    public static void main(String[] args) {
        int a;
        double cubo, quadrado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor para calcular o quadrado e o cubo dele:");
        a = teclado.nextInt();

        quadrado = Math.pow(a, 2);
        cubo = Math.pow(a, 3);

    
        System.out.println("O quadrado de: " + a + " é igual a: " + quadrado);
        System.out.println("O cubo de: " + a + " é igual a: " + cubo);

    }
}
