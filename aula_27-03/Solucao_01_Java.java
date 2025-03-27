import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Solucao_01_Java {
    public static void main(String[] args) {
        int resultadomedia, x1, x2, x3, x4, p1, p2, p3, p4;

        p1 = 1;
        p2 = 2;
        p3 = 3;
        p4 = 4;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Calcule a média ponderada de 4 numéros!");
        System.out.println("Digite um valor para x1");
        x1 = teclado.nextInt();
        System.out.println("Digite um valor para x2");
        x2 = teclado.nextInt();
        System.out.println("Digite um valor para x3");
        x3 = teclado.nextInt();
        System.out.println("Digite um valor para x4");
        x4 = teclado.nextInt();

        resultadomedia = (((x1*p1)+(x2*p2)+(x3*p3)+(x4*p4))/(p1+p2+p3+p4));

        System.out.println("O resultado da média ponderada é: " + resultadomedia);


    }
}
