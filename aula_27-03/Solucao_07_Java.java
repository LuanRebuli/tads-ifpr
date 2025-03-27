import java.util.Scanner;

public class Solucao_07_Java {
    public static void main(String[] args) {
        int hora, minutosTotais;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o entre 0 a 23 horas:");
        hora = teclado.nextInt();

        minutosTotais = hora * 60;

        System.out.println("Desde o início do dia, passaram " + minutosTotais + " minutos.");
        
    }
}
