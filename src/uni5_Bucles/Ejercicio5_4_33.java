package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura.
Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de
las esquinas inferiores.

Ejemplo 1:
Introduzca la altura de la U: 5
*     *
*     *
*     *
*     *
 * * *
Ejemplo 2:
Introduzca la altura de la U: 4
*     *
*     *
*     *
  * *

*/

public class Ejercicio5_4_33 {

    public static void main(String[] args) {

        System.out.println("PINTANDO LA LETRA U");
        System.out.println("-------------------");

        String inputALt = JOptionPane.showInputDialog("Introduzca la altura de la U: ");
        int altura = Integer.parseInt(inputALt);

        int longitud = altura - 1;

        for (int i = 1; i <= altura; i++) {
            if (i == altura) {
                System.out.print(" ");
                for (int j = 1; j <= longitud - 1; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("*");
                System.out.print(" ");
                for (int j = 1; j <= longitud - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



