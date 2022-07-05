package loop;

import java.util.Scanner;

public class DentrFora {

    /*
     * Problema "dentro_fora" (adaptado de URI 1072)
     * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
     * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
     * intervalo [10,20] e quantos estão fora do intervalo, conforme exemplo
     */
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int x, n, dentro, fora ;

        dentro = 0;
        fora = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = tec.nextInt();

        for (int i = 1; i <= n; i++){

            System.out.print("Digite um número:");
            x = tec.nextInt();

            if(x >= 10 && x <= 20){
                dentro = dentro + 1;
                System.out.println(dentro +" DENTRO");
            } else {
                fora = fora + 1;
            }
            System.out.print(fora + " FORA");

        }



        tec.close();
    }
}
