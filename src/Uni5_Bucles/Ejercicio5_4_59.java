package Uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe introducir la altura. En esa
altura va incluida la estrella y el tronco. Suponemos que el usuario introduce una altura mayor o igual a 4.

Ejemplo 1:
Por favor, introduzca la altura del árbol: 7
    *
    ^
   ^ ^
  ^   ^
 ^     ^
^^^^^^^^^
    Y

Ejemplo 2:
Por favor, introduzca la altura del árbol: 4
 *
 ^
^^^
 Y

Ejemplo 3:
Por favor, introduzca la altura del árbol: 10
       *
       ^
      ^ ^
     ^   ^
    ^     ^
   ^       ^
  ^         ^
 ^           ^
^^^^^^^^^^^^^^^
       Y

*/

public class Ejercicio5_4_59 {

    public static void main(String[] args) {

        System.out.println("PINTANDO EL ÁRBOL DE NAVIDAD");
        System.out.println("----------------------------");

        String inputNumero = JOptionPane.showInputDialog("Por favor, introduzca la altura del árbol: ");
        Integer altura = Integer.parseInt(inputNumero);

        if (altura < 4) {
            System.out.println("La altura del árbol debe ser mayor o igual a 4.");
        } else {
            // Parte superior del árbol
            for (int i = 1; i <= altura; i++) {
                // Espacios en blanco antes del ^
                for (int j = 0; j < altura - i; j++) {
                    System.out.print(" ");
                }
                // ^ repetidos
                for (int j = 0; j < 2 * i - 1; j++) {
                    if (j == 0 || j == 2 * i - 2 || i == altura) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // Tronco
            for (int i = 0; i < altura - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("Y");

            // Estrella
            for (int i = 0; i < altura - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }

}



















