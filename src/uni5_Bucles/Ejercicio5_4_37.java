package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un conversor del sistema decimal al sistema de “palotes”.

Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.

*/

public class Ejercicio5_4_37 {

    public static void main(String[] args) {

        System.out.println("CONVERSOR A PALOTES");
        System.out.println("-------------------");

        String input = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        int numero = Integer.parseInt(input);

        String palotes = "";

        while (numero > 0) {
            int digito = numero % 10;
            for (int i = 0; i < digito; i++) {
                palotes += "|";
            }

            if (numero >= 10) {
                palotes += " ";
            }
            numero /= 10;
        }

        System.out.println("En el sistema de palotes: " + palotes);
    }
}







