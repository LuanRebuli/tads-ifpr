import java.util.Scanner;

public class Solucao_03_Java_02 {
    public static void main(String[] args) {
        int number, divisao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro!");
        number = teclado.nextInt();

        divisao = number % 2;

        if(divisao == 0) {
        System.out.println("O numero digitado é par"); 
        } else {
            System.out.println("O numero digitado é par"); 
        }
    }
}
