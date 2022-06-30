package condicionais;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.JOptionPane;

public class Quadrante {
    
    public static void main(String[] args) {
         
        String x1 = JOptionPane.showInputDialog("Digite a Coordenada de X");
        String y1 = JOptionPane.showInputDialog("Digite a Coordenada de Y");

        int x = Integer.parseInt(x1);
        int y = Integer.parseInt(y1);

        while (x != 0 && y != 0) {
            
            if (x > 0 && y > 0) {
                System.out.println("Quadrante Q1");
            } else if (x < 0 && y > 0){
                System.out.println("Quadrante Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante Q3");
            } else {
                System.out.println("Quadrante Q4");
            }

            Scanner tec = new Scanner(System.in);

            System.out.println("Digite a Coordenada de X");
             x = tec.nextInt();
            System.out.println("Digite a Coordenada de Y");
            y = tec.nextInt();


        }
        // tec.close();
    }
}
