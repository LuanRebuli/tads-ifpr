import java.util.Scanner;

public class Solucao_02_Java_02 {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro!");
        n1 = teclado.nextInt();
        System.out.println("Digite um numero inteiro!");
        n2 = teclado.nextInt();
        System.out.println("Digite um numero inteiro!");
        n3 = teclado.nextInt();
     

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("O maior numero é: " + n1);
            if (n2 <= n3) {
                System.out.println("O menor numero é: " + n2);
            } else {
                System.out.println("O menor numero é: " + n3);
            }
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("O maior numero é: " + n2);
            if (n1 <= n3) {
                System.out.println("O menor numero é: " + n1);
            } else {
                System.out.println("O menor numero é: " + n3);
            }
        } else {
            System.out.println("O maior numero é: " + n3);
            if (n1 <= n2) {
                System.out.println("O menor numero é: " + n1);
            } else {
                System.out.println("O menor numero é: " + n2);
            }
        }
        
    }
}
