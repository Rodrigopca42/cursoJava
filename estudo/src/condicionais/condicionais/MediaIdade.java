package condicionais;

import java.util.Scanner;

public class MediaIdade {
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
