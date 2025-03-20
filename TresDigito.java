import java.util.Scanner;

public class TresDigito {
    public static void main(String[] args) {
        int numero, n1, n2, n3, n4, resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero de 3 digitos:");
        numero = teclado.nextInt();

        if (numero>99 & numero<=999) {
            n1 = numero/100;
            n2 = numero%100;
            n3 = n2/10;
            n4 = n2%10;

            resultado = n1 + n3 + n4;
            System.out.println(n1 + " + " + n3 + " + " + n4 + " = " + resultado);
        }else {
            System.out.println("Você não digitou um numero de 3 digitos");
        }
    }
}
