package Unit5_Bucles;

import javax.swing.*;
import java.util.Scanner;

/* todo: @author: Saulolo */

/* La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal para desviar el tráfico hacia la
derecha. La señal es una doble flecha con el vértice apuntando a la derecha. Se pide al usuario la altura de la
figura, que debe ser un número impar mayor o igual que 3. La distancia entre cada flecha de asteriscos es siempre
de 4 espacios. Si la altura introducida por el usuario no es un número impar mayor o igual que 3, el programa debe
mostrar un mensaje de error.

Ejemplo 1:
Por favor, introduzca la altura de la figura: 7
* *
 * *
  * *
   * *
  * *
 * *
* *

Ejemplo 2:
Por favor, introduzca la altura de la figura: 3
* *
 * *
* *

Ejemplo 3:
Por favor, introduzca la altura de la figura: 4
La altura no es correcta, debe ser un número impar mayor o igual que 3.
*/

public class Ejercicio5_4_66 {

    public static void main(String[] args) {

        System.out.println("PINTANDO SEÑAL DE TRÁFICO");
        System.out.println("-------------------------");

        String inputAltura = JOptionPane.showInputDialog("Por favor, introduzca la altura de la figura: ");
        Integer altura = Integer.parseInt(inputAltura);

        if ((altura < 3) || (altura % 2 == 0)) {
            System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
        } else {
            System.out.println();
            for (int i = 0; i < altura / 2; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*    *");
            }

            for (int i = altura / 2; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*    *");
            }
        }
    }
}























