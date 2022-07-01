package loop;

import java.util.Scanner;

public class Combustivel {

    /*
     * Um posto de combustíveis deseja determinar qual de seus produtos tem a
     * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
     * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
     * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
     * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
     * será encerrado quando o código informado for o número 4, devendo então
     * mostrar a mensagem "MUITO OBRIGADO", bem como as quantidades de cada
     * combustível.
     */ 

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
    System.out.printf("Gasolina %d%n", gasolina);
    System.out.printf("Diesel %d%n", diesel);
}

}
