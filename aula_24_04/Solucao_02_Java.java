import java.util.Random;

public class Solucao_02_Java {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[12];
        int maior, menor, posMaior, posMenor;

        System.out.print("Vetor Aleatório: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(90) + 10; 
            System.out.print(vetor[i] + " ");
        }

        maior = vetor[0];
        menor = vetor[0];
        posMaior = 0;
        posMenor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }

        System.out.println("\n- Maior elemento: " + maior + " / Posição: " + posMaior);
        System.out.println("- Menor elemento: " + menor + " / Posição: " + posMenor);
    }
}