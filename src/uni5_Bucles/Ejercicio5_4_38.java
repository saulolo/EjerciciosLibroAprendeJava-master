package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa debe pedir la altura.
Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
de error.

Ejemplo:
Por favor, introduzca la altura del reloj de arena: 5
*****
 ***
  *
 ***
*****

*/

public class Ejercicio5_4_38 {

    public static void main(String[] args) {

        System.out.println("PINTANDO UN RELOJ DE ARENA");
        System.out.println("--------------------------");

        String input = JOptionPane.showInputDialog("Por favor, introduzca la altura del reloj de arena: ");
        int altura = Integer.parseInt(input);

        if (altura % 2 == 1 && altura >= 3) {
            for (int i = 0; i < altura / 2; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < altura - (2 * i); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i < altura / 2; i++) {
                System.out.print(" ");
            }
            System.out.println("*");

            for (int i = altura / 2 - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < altura - (2 * i); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("El número introducido es inválido, vuelve a intentarlo.");
        }
    }


}







