import java.util.Scanner;

public class Solucao_05_Java_02 {
    public static void main(String[] args) {
        int number, x1, x2, x3, x4;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro de 3 digitos! Calcular qual o triangulo. (exemplo: triangulo equilatero de 4x4x4 = 444)");
        number = teclado.nextInt();

        
        if (number>99 & number<=999) {
            x1 = number/100;
            x2 = number%100;
            x3 = x2/10;
            x4 = x2%10;

            if(x1 == x3) {
                if(x1 == x4) {
                    System.out.println("É um Triangulo Equilátero");
                } else {
                    System.out.println("É um Triangulo Isóscele");
                }
            } else if(x1 == x4) {
                System.out.println("É um Triangulo Isóscele");
            } else if (x3 == x4) {
                System.out.println("É um Triangulo Isóscele");
            } else {
                System.out.println("É um Triangulo Escaleno");
            }

        }else {
            System.out.println("Você não digitou um numero de 3 digitos");
        }

    
    }
}
