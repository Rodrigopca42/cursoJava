package loop;

import java.util.Scanner;

public class MediaIdade {
    /*
     * Faça um programa para ler um número indeterminado de dados, contendo cada um,
     * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
     * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
     * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
     * mensagem "IMPOSSIVEL CALCULAR".
     */


    public static void main(String[] args) {
        Scanner tec = new Scanner(System .in);

        float idade, media;
        int cont = 0;
        float soma = 0;
      

        System.out.println("Digite as idades ");
        idade = tec.nextFloat();

        //Lógica While
    while (idade >= 0) {

    cont = cont + 1;
    soma = soma + idade;
    
    idade = tec.nextFloat();

    }
    //Lógica if else
    if (cont == 0 ){
        System.out.println("IMPOSSIVEL CALCULAR");
    }else {
        media = soma / cont;
        System.out.printf("Média %.2f", media);
    }

}
}
