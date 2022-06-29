package condicionais;

import java.util.Scanner;

public class SenhaFixa {
    

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
