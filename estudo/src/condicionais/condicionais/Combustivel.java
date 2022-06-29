package condicionais;

import java.util.Scanner;

public class Combustivel {
    
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;


    System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
    int codigo = tec.nextInt();

    while (codigo != 4){
        switch (codigo) {
            case 1:
                alcool = alcool + 1;
                break;
        
            case 2:
                gasolina = gasolina + 1;
                break;

            case 3:
                diesel = diesel + 1;
                break;
            
            default:
                break;
        }
        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        codigo = tec.nextInt();
    }

    System.out.println("Muito Obrigado");
    System.out.printf("Alcool %d%n", alcool);
    System.out.printf("Diesel %d%n", diesel);
    System.out.printf("Gasolina %d%n", gasolina);
}

}
