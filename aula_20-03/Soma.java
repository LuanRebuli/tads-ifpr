import java.util.Scanner;

public class Soma {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int a, b, soma;
        

        System.out.println("Soma de dois valores!");
        System.out.println("Digite um valor para a");
        a = teclado.nextInt();
        System.out.println("Digite um valor para b");
        b = teclado.nextInt();

        soma = a + b;
        System.out.println("O valor da soma é: " + soma);
    }
}
