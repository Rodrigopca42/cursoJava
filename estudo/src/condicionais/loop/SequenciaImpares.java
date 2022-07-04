package loop;

import java.util.Scanner;

public class SequenciaImpares {
    
    public static void main(String[] args) {

        /*
         * Problema "sequencia_impares" (adaptado de URI 1067)
         * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor
         * por linha, inclusive o X, se for o caso.
         */
        
        Scanner tec = new Scanner(System.in);

        int x, i;

        System.out.print("Digite o valor de X: ");
        x = tec.nextInt();
        tec.close();

        for(i = 1; i <= x; i++){
            if( i % 2 != 0){
                System.out.println(i);
            }
        }


    }
}
