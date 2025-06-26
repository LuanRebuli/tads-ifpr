import java.util.Scanner;

public class JogoDaForca extends JogoDaForcaBase {

    public JogoDaForca(String caminhoArquivo) {
        super(caminhoArquivo);
    }
    @Override
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        String[] palavras = LerArquivo();
        Boolean Vivo = true;
        int contadorVidas = 5;
        
        int numero = (int) (Math.random() * palavras.length - 1);
        String palavraEscolhida = palavras[numero];
        String progresso = "_".repeat(palavraEscolhida.length());
        
        while (Vivo) {
            System.out.println("Palavra: " + progresso);
            System.out.println("Digite uma letra: ");
            char letra = scanner.nextLine().charAt(0); 

            boolean acertou = false;

            StringBuilder novoProgresso = new StringBuilder(progresso);
            for(int i = 0; i < palavraEscolhida.length(); i++) {
                if(palavraEscolhida.charAt(i) == letra) {
                    novoProgresso.setCharAt(i, letra);
                    acertou = true;
                }
            }
            progresso = novoProgresso.toString();

            if (!acertou) {
                contadorVidas--;
                System.out.println("Letra incorreta! Você tem " + contadorVidas + " vidas restantes.");
            }
            if (progresso.equals(palavraEscolhida)) {
                System.out.println("Parabéns! Você completou a palavra: " + palavraEscolhida);
                Vivo = false;
            } else if (contadorVidas <= 0) {
                System.out.println("Você perdeu! A palavra era: " + palavraEscolhida);
                Vivo = false;
            }

        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o nível do jogo:");
        System.out.println("1 - Fácil");
        System.out.println("2 - Médio");
        System.out.println("3 - Difícil");
        System.out.print("Digite o número do nível: ");

        int nivel = scanner.nextInt();
        scanner.nextLine(); 

        String caminhoArquivo;

        switch (nivel) {
            case 1:
                caminhoArquivo = "forca_facil.txt";
                break;
            case 2:
                caminhoArquivo = "forca_medio.txt";
                break;
            case 3:
                caminhoArquivo = "forca_dificil.txt";
                break;
            default:
                System.out.println("Nível inválido! Usando nível Fácil.");
                caminhoArquivo = "forca_facil.txt";
                break;
        }

        JogoDaForca jogo = new JogoDaForca(caminhoArquivo);
        jogo.iniciar();

        scanner.close();
    }
}
