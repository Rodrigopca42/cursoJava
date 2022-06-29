package condicionais;

import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
       
        Scanner tec = new Scanner(System.in);
        

        System.out.println("Digite dois números: ");
        int x1 = tec.nextInt();
        int y1 = tec.nextInt();

        while ( x1 != y1) {
            if (x1 < y1) {
                System.out.println("CRESCENTE");
            }else {
                System.out.println("DECRESCENTE");
            }
            System.out.println("Digite dois números: ");
                 x1 = tec.nextInt();
                 y1 = tec.nextInt();
    

        }
        
        
    }
}