package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe
comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
de error.

Ejemplo:
Por favor, introduzca la altura de la X: 5
*     *
 *   *
   *
 *   *
*     *

*/

public class Ejercicio5_4_35 {

    public static void main(String[] args) {

        System.out.println("PINTANDO UNA X");
        System.out.println("--------------");

        String input = JOptionPane.showInputDialog("Por favor, introduzca la altura de la X: ");
        int altura = Integer.parseInt(input);


        if (altura % 2 == 1 && altura >= 3) {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura; j++) {
                    if (j == i || j == altura - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Número introducido no válido, vuelve a intentarlo.");
        }
    }
}




