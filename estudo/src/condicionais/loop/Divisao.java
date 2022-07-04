package loop;

import java.util.Scanner;

public class Divisao {
    
    
    public static void main(String[] args) {
        
        /*
         * Problema "divisao" (adaptado de URI 1116)
         * Escreva um algoritmo que leia dois números e imprima o resultado da divisão
         * do primeiro pelo segundo. Caso não for possível, mostre a mensagem “DIVISAO
         * IMPOSSIVEL”.
         */

        Scanner tec = new Scanner(System.in);
        
        int n, i; 
        float res, numerador, denominador;
        
        System.out.print("Quantos casos voce vai digitar? ");
        n = tec.nextInt();
        
        
        for(i = 1; i <= n; i++){

            System.out.print("Entre com o numerador: ");
            numerador = tec.nextFloat();
            System.out.print("Entre com o denominador: ");
            denominador = tec.nextFloat();

            if(denominador == 0){
                System.out.println("DIVISÃO IMPOSSIVEL");
            }else {
                res = numerador / denominador;
                System.out.printf("DIVISÃO = %.2f%n ", res);
            }
        }
        System.out.println("");
        System.out.println("***Muito Obrigado Por Brincar***");
        System.out.println("");
    }
}
