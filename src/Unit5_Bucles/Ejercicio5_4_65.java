package Unit5_Bucles;

import javax.swing.*;
import java.util.Scanner;

/* todo: @author: Saulolo */

/* Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir la altura total y la fila en
la que debe aparecer el palito horizontal (contando desde el vértice). La altura mínima es de 3 pisos. La fila
donde va el palito horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario introduce algún dato
incorrecto, el programa debe mostrar un mensaje de error.

Ejemplo:

Ejemplo 1:
Introduzca la altura de la A (un número mayor o igual a 3): 7
Introduzca la fila del palito horizontal (entre 2 y 6): 5
      *
     * *
    *   *
   *     *
  *********
 *         *
*           *

Ejemplo 2:
Introduzca la altura de la A (un número mayor o igual a 3): 7
Introduzca la fila del palito horizontal (entre 2 y 6): 6
      *
     * *
    *   *
   *     *
  *       *
 ***********
*           *

Ejemplo 3:
Introduzca la altura de la A (un número mayor o igual a 3): 7
Introduzca la fila del palito horizontal (entre 2 y 6): 7
La fila introducida no es correcta.

Ejemplo 4:
Introduzca la altura de la A (un número mayor o igual a 3): 2
La altura introducida no es correcta.

Ejemplo 5:
Introduzca la altura de la A (un número mayor o igual a 3): 4
Introduzca la fila del palito horizontal (entre 2 y 3): 2
   *
  ***
 *   *
*     *

Ejemplo 6:
Introduzca la altura de la A (un número mayor o igual a 3): 5
Introduzca la fila del palito horizontal (entre 2 y 4): 4
    *
   * *
  *   *
 *******
*       *
*/

public class Ejercicio5_4_65 {

    public static void main(String[] args) {

        System.out.println("PINTANDO LA LETRA A");
        System.out.println("-------------------");

        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
        int altura = Integer.parseInt(s.nextLine());

        if (altura < 3) {
            System.out.println("La altura introducida no es correcta.");
        } else {
            System.out.print("Introduzca la fila del palito horizontal (entre 2 y " + (altura - 1) + "): ");
            int palito = Integer.parseInt(s.nextLine());

            if ((palito < 2) || (palito >= altura)) {
                System.out.println("La fila introducida no es correcta.");
            } else {
                // Pinta la letra A
                int espaciosIzq = altura - 1;
                int espaciosCentro = 1;

                for (int fila = 1; fila <= altura; fila++) {
                    repiteCaracter(" ", espaciosIzq--);
                    System.out.print("*");
                    if (fila > 1) {
                        if (fila == palito) {
                            repiteCaracter("*", espaciosCentro);
                        } else {
                            repiteCaracter(" ", espaciosCentro);
                        }

                        espaciosCentro+=2;
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
        }
    }

    public static void repiteCaracter(String c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

}





















