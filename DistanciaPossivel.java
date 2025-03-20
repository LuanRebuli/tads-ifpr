import java.util.Scanner;

public class DistanciaPossivel {
    public static void main(String[] args) {
        int distanciaPossivel, consumoMedio, tanqueDisponivel;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o consumo médio do veiculo em KM:");
        consumoMedio = teclado.nextInt();

        System.out.println("Digite o tanque disponível do veiculo em Litros:");
        tanqueDisponivel = teclado.nextInt();

        distanciaPossivel = tanqueDisponivel*consumoMedio;

        System.out.println("A distância possivel de percorrer com esse tanque é de: " + distanciaPossivel + "km");
    }
}
