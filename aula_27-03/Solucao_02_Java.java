import java.io.Console;
import java.util.Scanner;

public class Solucao_02_Java {
    public static void main(String[] args) {
        int cdu, centena, dezena, calculo, unidade, resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero com 3 digitos");
        cdu = teclado.nextInt();

        if(cdu > 99 & cdu<=999) {
            unidade = cdu%10;
            dezena = (cdu / 10) % 10;
            centena = cdu / 100;

            resultado = unidade * 100 + dezena * 10 + centena;

            System.out.println("O resultado invertido desses 3 numeros é: " + resultado);
        }else {
            System.out.println("Você não digitou um numero de 3 digitos");
        }
    }
}
