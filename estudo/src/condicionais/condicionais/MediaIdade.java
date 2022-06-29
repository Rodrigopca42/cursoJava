package condicionais;

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System .in);

        int cont = 0;
        int media, idade;

        System.out.println("Digite as idades ");
        idade = tec.nextInt();

while (idade < 0) {
    if (idade < 0 ){
        System.out.println("IMPOSSIVEL CALCULAR");
    }else {
        
        cont = cont + 1;
        idade = idade + idade;
        media = idade / cont;


    }

    
}

    }
}
