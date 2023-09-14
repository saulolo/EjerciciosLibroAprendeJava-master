package Unit5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte un triángulo hueco tal como se muestra en los ejemplos. El usuario debe
introducir la altura de la figura.

Ejemplo 1:
Introduzca la altura de la figura: 8
********
*     *
*    *
*   *
*  *
* *
**
*

Ejemplo 2:
Introduzca la altura de la figura: 5
*****
*  *
* *
**
*

*/

public class Ejercicio5_4_54 {

    public static void main(String[] args) {

        System.out.println("PINTANDO UN TRIANGULO");
        System.out.println("---------------------");

        String inputNumero = JOptionPane.showInputDialog("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(inputNumero);

        for (int i = 0; i < altura; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i < altura - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < altura - i - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println("*");
    }

}




















