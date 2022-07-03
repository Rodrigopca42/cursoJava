package loop;

import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        /*
         *            Problema "soma_impares" (adaptado de URI 1071)
         * Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre
         * a soma dos números impares entre eles.
         */

        
        Scanner tec = new Scanner(System.in);
        int x, y, soma, troca;
        
        System.out.println("Digite dois numeros: ");
         x = tec.nextInt();
         y = tec.nextInt();

         if(x > y){
            troca = x; 
            x = y;
            y = troca;
         }
         soma = 0;
        for (int i = x+1; i < y; i++){
            if(i % 2 != 0){
                soma = soma + i;
            }
        }
        System.out.println("SOMA DOS IMPARES = "+ soma);
        tec.close();
    }
}
