package Uni5_Bucles;

import java.util.Scanner;

/* todo: @author: Saulolo */

/* Una empresa de cartelería nos ha encargado un programa para realizar uno de sus diseños. Debido a los
acontecimientos que han tenido lugar en Cataluña durante el 2018, han recibido muchos pedidos del cartel que
muestra el número 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al usuario se le pedirán
dos datos, la altura del cartel y el número de espacios que habrá entre los números. La altura mínima es 5. La
anchura de los números siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura.

Ejemplo 1:
Introduzca la altura (5 como mínimo): 5 Introduzca el número de
espacios entre los números (1 como mínimo): 2
* **** ****
* *    *
* **** ****
*    *    *
* **** ****

Ejemplo 2:
Introduzca la altura (5 como mínimo): 7 Introduzca el número de
espacios entre los números (1 como mínimo): 3
* **** ****
* *    *
* **** ****
*    *    *
*    *    *
*    *    *
* **** ****

Ejemplo 3:
Introduzca la altura (5 como mínimo): 6 Introduzca el número de
espacios entre los números (1 como mínimo): 1
* **** ****
* *    *
* **** ****
*    *    *
*    *    *
* **** ****

*/

public class Ejercicio5_4_50 {

    public static void main(String[] args) {

        System.out.println("PINTANDO EL NÚMERO 5");
        System.out.println("--------------------");

        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura (5 como mínimo): ");
        int altura = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
        int espacios = Integer.parseInt(s.nextLine());

        // Parte superior del 5 //////////////////////////
        // Fila 1
        System.out.print("*");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("****");

        // Fila 2
        System.out.print("*");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("*   ");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        // Fila 3 (igual que la fila 1)
        System.out.print("*");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("****");

        // Parte inferior del 5 //////////////////////////
        // Filas variables
        for (int fila = 0; fila < altura - 4; fila++) {
            System.out.print("*");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.print("   *");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.println("   *");
        }

        // Última fila (igual que la primera)
        System.out.print("*");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("****");
    }
}
















