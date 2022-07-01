package loop;

import javax.swing.JOptionPane;

/**
 * Calculadora
 */
public class Calculadora {

    public static void main(String[] args) {
        String nu1 = JOptionPane.showInputDialog("Digite o 1º número:");
        String nu2 = JOptionPane.showInputDialog("Digite o 2º número:");

        String operador = JOptionPane.showInputDialog("digite o operador:");

        float numero1 = Float.parseFloat(nu1);
        float numero2 = Float.parseFloat(nu2);

        // Lógica
        float resultado = "+".equals(operador) ? numero1 + numero2 : 0;
        resultado = "-".equals(operador) ? numero1 - numero2 : resultado;
        resultado = "*".equals(operador) ? numero1 * numero2 : resultado;
        resultado = "/".equals(operador) ? numero1 / numero2 : resultado;
        resultado = "%".equals(operador) ? numero1 % numero2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f",numero1, operador, numero2, resultado);
       
        

    }
}