package Uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un número entero introducido por
teclado. El orden es el que se muestra en los ejemplos. Utiliza el tipo long para que el usuario pueda introducir
números largos.

Ejemplo 1:
Introduzca un número entero: 67706
Dígitos que aparecen en el número: 0 6 7
Dígitos que no aparecen: 1 2 3 4 5 8 9

Ejemplo 2:
Introduzca un número entero: 555
Dígitos que aparecen en el número: 5
Dígitos que no aparecen: 1 2 3 4 6 7 8 9

Ejemplo 3:
Introduzca un número entero: 9876543210
Dígitos que aparecen en el número: 0 1 2 3 4 5 6 7 8 9
Dígitos que no aparecen:

Ejemplo 4:
Introduzca un número entero: 13247721
Dígitos que aparecen en el número: 1 2 3 4 7
Dígitos que no aparecen: 0 5 6 8 9

*/

public class Ejercicio5_4_48 {

    public static void main(String[] args) {

        System.out.println("MOSTRANDO DÍGITOS QUE APARECEN Y QUE NO");
        System.out.println("---------------------------------------");

        String inputNumero = JOptionPane.showInputDialog("Introduzca un número entero: ");
        long numero = Long.parseLong(inputNumero);

        long aux;
        boolean encontrado;

        System.out.print("Dígitos que aparecen en el número: ");

        for (int i = 0; i < 10; i++) {
            encontrado = false;
            aux = numero;
            while (aux > 0) {
                if (aux % 10 == i) {
                    encontrado = true;
                }
                aux /= 10;
            }
            if (encontrado) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nDígitos que no aparecen: ");

        for (int i = 0; i < 10; i++) {
            encontrado = false;
            aux = numero;
            while (aux > 0) {
                if (aux % 10 == i) {
                    encontrado = true;
                }
                aux /= 10;
            }
            if (!encontrado) {
                System.out.print(i + " ");
            }
        }

    }
}
















