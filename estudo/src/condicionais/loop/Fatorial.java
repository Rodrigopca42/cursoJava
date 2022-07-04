package loop;

import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        
        /*
         * Problema "fatorial" (adaptado de URI 1153)
         * Fazer um programa para ler um número natural N (valor máximo: 15), e depois
         * calcular e mostrar o fatorial de N.
         */


        Scanner tec = new Scanner(System.in);

        int n, i, fatorial;

        System.out.print("Digite o valor de N: ");
        n = tec.nextInt();

        fatorial = 1;
        for(i = 1; i <= n; i++){
            fatorial = fatorial * i;

            
        }
        System.out.println("FATORIAL = "+ fatorial);
         tec.close();
         System.out.println("");
         System.out.println("**** Muito Obrigado Por Participar da Brincadeira ****");
         System.out.println("");
    }
}
