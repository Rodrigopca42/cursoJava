package loop;

import java.util.Scanner;

public class MediaPonderada {
     public static void main(String[] args) {
        
         /*
          *           Problema "media_ponderada" (adaptado de URI 1079)
          * Leia um valor inteiro N, que representa o número de casos de teste que vem a
          * seguir. Cada caso de teste consiste de 3 valores reais, para os quais você
          * deverá calcular e mostrar a média ponderada, sendo que o primeiro valor tem
          * peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale
          * lembrar que a média ponderada é a soma de todos os valores multiplicados pelo
          * seu respectivo peso, dividida pela soma dos pesos.
          */

            Scanner tec = new Scanner (System.in);
            
            int n, i;
            float x1, x2, x3, media;

            System.out.print("Quantos casos voce vai digitar? ");
            n = tec.nextInt();

            for (i = 1; i <= n; i++){
                System.out.println("Digite tres numeros: ");
                x1 = tec.nextFloat();
                x2 = tec.nextFloat();
                x3 = tec.nextFloat();

                media = (x1 * 2 + x2 * 3 + x3 * 5) / (2 + 3 + 5);
  
                System.out.printf("MÉDIA = %.1f%n", media);
            }


     }
}
