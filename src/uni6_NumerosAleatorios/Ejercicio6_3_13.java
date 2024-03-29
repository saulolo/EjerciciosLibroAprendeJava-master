package uni6_NumerosAleatorios;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando los dados una y otra
vez hasta que en alguna tirada los dos dados tengan el mismo valor.
*/

public class Ejercicio6_3_13 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("TIRADA DE DADOS");
        JOptionPane.showMessageDialog(null, into);
        System.out.println("-----------");

        int contador = 0;
        int dado1;
        int dado2;
        do{
            dado2 = (int)(Math.random() * 6) + 1;
            dado1 = (int)(Math.random() * 6) + 1;
            contador++;
            JOptionPane.showMessageDialog(null, "La tirada de dados número " + contador +
                    " fue: " + dado1 + " | " + dado2);

        } while (dado1 != dado2);

        JOptionPane.showMessageDialog(null, "Ambos dados tienen el mismo valor de: " + dado1 +
                " después de " + contador + " tiradas.");
    }
}

