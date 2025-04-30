import java.util.Random;

public class Solucao_03_Java {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[4];
        int soma = 0;
        double media;

        System.out.print("Vetor Aleatório: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(90) + 10; 
            System.out.print(vetor[i] + " ");
            soma += vetor[i];
        }

        media = (double) soma / vetor.length;

        System.out.println("\n- Valor médio: " + media);
    }
}
