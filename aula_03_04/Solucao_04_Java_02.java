import java.util.Scanner;

public class Solucao_04_Java_02 {
    public static void main(String[] args) {
        int age;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma idade!");
        age = teclado.nextInt();

        if (age<=0) {
            System.out.println("Idade inválida"); 
        } else if(age <=11) {
            System.out.println("Essa pessoa está faixa etária de: Criança"); 
        } else if(age<=17){
            System.out.println("Essa pessoa está faixa etária de: Adolescente"); 
        } else if(age<=59) {
            System.out.println("Essa pessoa está faixa etária de: Adulto"); 
        } else {
            System.out.println("Essa pessoa está faixa etária de: Idoso"); 
        }

    
    }
}
