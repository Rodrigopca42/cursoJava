package loop;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Trabalho confirmado na terça? ");
        boolean ter = tec.nextBoolean();

        System.out.print("Trabalho confirmado na quinta? ");
        boolean qui = tec.nextBoolean();

        tec.close();

        if( ter == true && qui == true) {
                System.out.println("Vamos ao shopping  tomar sorvete e comprar uma tv de 52\". ");
                System.out.println("Cuidado! Muito Sorvere faz mal para saúde");

        }else if ( ter == false && qui == false) {
            System.out.println("Vamos ficar em casa mesmo."); 
            System.out.println("Ótimo! Assim não gastamos Dinheiro.");
        } 
        else {
            System.out.println("Vamos ao shopping comprar uma tv de 32\" e não iremos tomar sorvete.");
        }
    }
}
