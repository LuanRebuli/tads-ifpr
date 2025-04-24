import java.util.Scanner;
import java.util.Random;

public class Solucao_01_Java {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();        
                
        for(int i=10;i<=50;i++){            
	        System.out.println(gerador.nextInt(10,50));
        }              
	}
}