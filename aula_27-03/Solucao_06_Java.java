import java.util.Scanner;

public class Solucao_06_Java {
    public static void main(String[] args) {
        int valorHoraAula, numerosDeAulasMensais, salarioBruto;
        double salarioLiquido;
        double descontoINSS;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da hora:");
        valorHoraAula = teclado.nextInt();

        System.out.println("Digite o número de aulas mensais:");
        numerosDeAulasMensais = teclado.nextInt();

        salarioBruto = valorHoraAula*numerosDeAulasMensais;

        if (salarioBruto <= 1302) {
            descontoINSS = salarioBruto * 0.075;
            salarioLiquido = salarioBruto - descontoINSS;
            System.out.println("O salário liquido com desconto 7,5% é: " + salarioLiquido);
        } else if (salarioBruto <= 2571) {
            descontoINSS = salarioBruto * 0.085;
            salarioLiquido = salarioBruto - descontoINSS;
            System.out.println("O salário liquido com desconto 8,5% é: " + salarioLiquido);
        } else if (salarioBruto <= 3856) {
            descontoINSS = salarioBruto * 0.105;
            salarioLiquido = salarioBruto - descontoINSS;
            System.out.println("O salário liquido com desconto 10,5% é: " + salarioLiquido);
        } else {
            descontoINSS = salarioBruto * 0.125;
            salarioLiquido = salarioBruto - descontoINSS;
            System.out.println("O salário liquido com desconto 12,5% é: " + salarioLiquido);
        }
    
    }
}
