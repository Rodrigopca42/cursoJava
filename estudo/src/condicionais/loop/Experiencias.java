package loop;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Experiencias {
    
    public static void main(String[] args) {
        /*
         * Problema "experiencias" (adaptado de URI 1094)
         * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
         * precisa de sua ajuda para organizar os experimentos de um laboratório o qual
         * ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
         * utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
         * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
         * coelhos. Para obter estas informações, ela sabe exatamente o número de
         * experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
         * de cobaias utilizadas em cada experimento. Faça um programa que leia um valor
         * inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de
         * teste contém um inteiro que representa a quantidade de cobaias utilizadas e
         * uma letra ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo
         * C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
         * cobaia utilizada e o percentual de cada uma em relação ao total de cobaias
         * utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após
         * o ponto.
         */

         String n1 = JOptionPane.showInputDialog("Quantos casos de teste serão digitados?");
         
         int n = Integer.parseInt(n1);
         Scanner tec = new Scanner(System.in);
         
         
         int i,  quantidade, totalratos, totalsapos, totalcoelhos;
        float pratos, psapos, pcoelhos, total;
        String cobaias;
        
        totalratos = 0;
        totalsapos = 0; 
        totalcoelhos = 0;



        for(i = 1; i <= n; i++){
            System.out.print("Quantidade de cobaias: ");
            quantidade = tec.nextInt();
            System.out.print("Tipo de cobaia: ");
            cobaias = tec.next();

            if("r".equalsIgnoreCase(cobaias)){
                totalratos = totalratos + quantidade;

            }else if ("c".equalsIgnoreCase(cobaias)){
                totalcoelhos = totalcoelhos + quantidade;
            
            }else if ("s".equalsIgnoreCase(cobaias)){
                totalsapos = totalsapos + quantidade;

            }

        }
        total = totalcoelhos + totalratos + totalsapos;
      
        pcoelhos = totalcoelhos / total * 100;
        pratos = totalratos / total * 100;
        psapos = totalsapos / total * 100;

        System.out.println("");
        System.out.println("***RELATORIO FINAL: ***");
        System.out.println("");
        System.out.printf("Número Total = %.2f%n", total);
        System.out.printf("Total de coelhos: %d%n", totalcoelhos);
        System.out.printf("Total de ratos: %d%n",totalratos);
        System.out.printf("Total de sapos: %d%n", totalsapos);
        System.out.println("");
        System.out.printf("Percentual de coelhos: %.2f%n", pcoelhos);
        System.out.printf("Percentual de ratos: %.2f%n",  pratos);
        System.out.printf("Percentual de sapos: %.2f", psapos);
        System.out.println("");
    }
}
