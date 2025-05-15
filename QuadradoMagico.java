import java.util.Scanner;
import java.util.Random;

public class QuadradoMagico {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random(); 
        
        int Matriz[][] = new int[3][3];
        int i, j;
        int coluna = 0, linha = 0, diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                Matriz[i][j] = gerador.nextInt(1,9);
            }            		
        }
        
        for(i = 0; i < 3; i++) {
            coluna = Matriz[0][i] + Matriz[1][i] + Matriz[2][i];
            
            linha = Matriz[i][0] + Matriz[i][1] + Matriz[i][2];
            
            diagonalPrincipal = Matriz[0][0] + Matriz[1][1] + Matriz[2][2];
            
            diagonalSecundaria = Matriz[0][2] + Matriz[1][1] + Matriz[2][0];
        }
        
        if(coluna == 15 && linha == 15 && diagonalPrincipal == 15 && diagonalSecundaria == 15) {
            System.out.println("É um quadrado mágico!!!");
        } else {
            System.out.println("Não é um quadrado mágico!!");
        }
        
        System.out.println("\nMatriz:");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
