import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        float raio;
        double valorpi, area;

        valorpi = 3.14;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculo da area de um circulo!");
        System.out.println("Digite o valor do raio:");
        raio = teclado.nextFloat();

        area = valorpi * (raio * raio);
        System.out.println("A soma da área do circulo é: " + area);
    }
    
}
