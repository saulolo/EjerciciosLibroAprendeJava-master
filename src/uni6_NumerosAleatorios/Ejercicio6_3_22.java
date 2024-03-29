package uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. La cabeza se representará
 con el carácter @ y se debe colocar exactamente en la posición 13 (con 12 espacios delante). A partir de ahí, el
 cuerpo irá serpenteando de la siguiente manera: se generará de forma aleatoria un valor entre tres posibles que
 hará que el siguiente carácter se coloque una posición a la izquierda del anterior, alineado con el anterior o
 una posición a la derecha del anterior. La longitud de la serpiente se pedirá por teclado y se supone que el usuario
 introducirá un dato correcto.

Ejemplo:
Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
  @
  *
*
 *
 *
  *
*/

public class Ejercicio6_3_22 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("PINTANDO UNA SERPIENTE");
        JOptionPane.showMessageDialog(null, into);

        String inputLongitud = JOptionPane.showInputDialog("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        Integer longitud = Integer.parseInt(inputLongitud);

        // pinta la cabeza
        System.out.println("\n            @");

        // pinta el cuerpo
        int i;
        int x = 13;

        while (longitud > 1) {
            // suma -1, 0 o 1 a la variable x
            x += (int)(Math.random() * 3) - 1;

            // pinta x - 1 espacios
            for (i = 1; i < x; i++) {
                System.out.print(" ");
            }

            // pinta el cuerpo
            System.out.println("#");

            longitud--;
        }

    }
}
