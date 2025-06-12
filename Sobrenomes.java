import java.util.Scanner;
import java.lang.String;

public class teste {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Digite um nome");
	    nome = teclado.nextLine();
        System.out.println("\nNome Digitado: "+nome);
       
        String[] arrOfStr = nome.split(" ");

        String[] sufixos = {"FILHO", "NETO", "JUNIOR"};
        String[] preposicoes = {"DE", "DO", "DA", "DAS", "DOS", "DI"};
        String ultimo = arrOfStr[arrOfStr.length - 1].toUpperCase();
        String penultimo = arrOfStr.length >= 2 ? arrOfStr[arrOfStr.length - 2].toUpperCase() : "";
        
        boolean temSufixo = false;
        for (String s : sufixos) {
            if (ultimo.equals(s)) {
                temSufixo = true;
                break;
            }
        }
        
        String sobrenome;
        if (temSufixo) {
            sobrenome = penultimo + " " + ultimo;
        } else {
            sobrenome = ultimo;
        }

        System.out.print(sobrenome + ", ");
        
        for (String palavra : arrOfStr) {
            boolean ignorar = false;
            for (String prep : preposicoes) {
                if (palavra.equalsIgnoreCase(prep)) {
                    ignorar = true;
                    break;
                }
                String[] partesSobrenome = sobrenome.split(" ");
                for (String parte : partesSobrenome) {
                    if (palavra.equalsIgnoreCase(parte)) {
                        ignorar = true;
                        break;
                    }
                }
               for (String sobrenomes : sufixos) {
                    if(palavra.equalsIgnoreCase(sobrenomes) ) {
                        ignorar = true;
                        break;
                }
               }
            }
            if (!ignorar && !palavra.isEmpty()) {
                System.out.print(palavra.toUpperCase().charAt(0) + ".");
            }
        }

        	
	}

}