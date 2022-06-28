package condicionais;

import java.util.Scanner;

/**
 * Desafio
 */
public class DiasDaSemana {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String dia = tec.nextLine();

        tec.close();

        if ("domingo".equalsIgnoreCase(dia) ) {
            System.out.println("1");
        } else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println("2");
        } else if ("terca".equalsIgnoreCase(dia) || "terça".equalsIgnoreCase(dia)) {
            System.out.println("3");
        } else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println("4");
        } else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println("5");
        } else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println("6");
        } else if ("sabado".equalsIgnoreCase(dia) || "sábado".equalsIgnoreCase(dia)) {
            System.out.println("7");
        } 
    }
}