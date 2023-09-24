package Uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte por pantalla un rombo hueco hecho con asteriscos. El programa debe pedir la
altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar
un mensaje de error.

Por favor, introduzca la altura del rombo: 5
   *
 *   *
*     *
 *   *
   *

*/

public class Ejercicio5_4_40 {

    public static void main(String[] args) {

        System.out.println("PINTAR ROMBO HUECO");
        System.out.println("------------------");

        String input = JOptionPane.showInputDialog("Por favor, introduzca la altura del rombo: ");
        int altura = Integer.parseInt(input);

        if (altura % 2 == 1 && altura >= 3) {
            int mitad = altura / 2;

            // Parte superior del rombo
            for (int i = 0; i < mitad; i++) {
                for (int j = 0; j < mitad - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                if (i > 0) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Parte inferior del rombo
            for (int i = mitad; i >= 0; i--) {
                for (int j = 0; j < mitad - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                if (i > 0) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("El número introducido es inválido, debe ser un entero impar mayor o igual a 3.");
        }
    }
}







