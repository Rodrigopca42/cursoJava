package loop;

import java.util.Scanner;

public class ValidacaoDeNota {
     public static void main(String[] args) {
        
         /*
          * Problema "validacao_de_nota" (adaptado de URI 1117)
          * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
          * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
          * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
          * ser validada separadamente.
          */
          
          Scanner tec = new Scanner(System.in);
          float nota1, nota2, media;
          
        System.out.print("Digite a 1ª nota: ");
        nota1 = tec.nextFloat();

        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Nota Invalida! Tente Novamente: ");
            nota1 = tec.nextFloat();
        }

        System.out.print("Digite a 2ª nota: ");
        nota2 = tec.nextFloat();

        while (nota2 < 0 || nota2 > 10){
            System.out.print("Nota Invalida! Tente Novamente: ");
            nota2 = tec.nextFloat();  
        }
        

        media = (nota1 + nota2) / 2;
        System.out.printf("A média do semestre é %.2f", media);


     }
}
