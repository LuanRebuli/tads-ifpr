import java.util.Scanner;

public class Solucao_01_Java_02 {
    public static void main(String[] args) {
        int number;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro!");
        number = teclado.nextInt();
     

        if (number > 0) {
            System.out.println("O numero " + number + " é positivo!");
        } else if(number < 0 ) {
            System.out.println("O numero " + number + " é negativo!");
        } else {
            System.out.println("O numero " + number + " é neutro!");
        }

    }
}
