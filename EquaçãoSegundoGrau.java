import java.util.Scanner;

public class EquaçãoSegundoGrau {
    public static void main(String[] args) {
        int a, b, c;
        double x1, x2;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor de a");
        a = teclado.nextInt();

        System.out.println("Digite o valor de b");
        b = teclado.nextInt();
        
        System.out.println("Digite o valor de c");
        c = teclado.nextInt();

        x1 = (-b+(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
        x2 = (-b-(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
        String resultadoFormatadoX1 = String.format("%.2f", x1);
        String resultadoFormatadoX2 = String.format("%.2f", x2);

        System.out.println("Resultado de x1: " + resultadoFormatadoX1);
        System.out.println("Resultado de x2: " + resultadoFormatadoX2);
    }
}
