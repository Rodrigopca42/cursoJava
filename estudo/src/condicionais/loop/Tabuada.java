package loop;

import javax.swing.JOptionPane;

public class Tabuada {
     public static void main(String[] args) {
        
         /*
          *                         Problema "tabuada"
          * Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10,
          * conforme exemplo.
          */

          String x1 = JOptionPane.showInputDialog("Deseja a tabuada para qual valor?");

          int x = Integer.parseInt(x1);
          
          for (int i = 1; i <= 10; i++){
              int mult = x * i;  
              
              System.out.println(x +" x "+ i +" = "+ mult );
            }

     }
}
