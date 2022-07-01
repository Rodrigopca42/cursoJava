package loop;

import java.util.Scanner;

public class SenhaFixa {

    /*
     * Escreva um programa que repita a leitura de uma senha até que ela seja
     * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
     * "Senha Invalida! Tente novamente:". Quando a senha for informada corretamente
     * deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
     * Considere que a senha correta é o valor 2002.
     */

public static void main(String[] args) {
    
    Scanner tec = new Scanner(System.in);


    System.out.print("Digite a senha: ");
    int senha = tec.nextInt();

    while (senha != 2002){
        if (senha != 2002){
            System.out.print("Senha Inválida! Tente Novamente: ");
            senha = tec.nextInt();
        } 
        
    }
    System.out.println("Acesso Permitido");

}
}
