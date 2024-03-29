package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte una pirámide maya. Por los lados, se trata de una pirámide normal y corriente.
Por el centro se van pintando líneas de asteriscos de forma alterna (empezando por la superior): la primera se
pinta, la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre tiene 6 asteriscos, por
tanto, las líneas centrales que se añaden a la pirámide normal tienen 4 asteriscos. El programa pedirá la altura.
Se supone que el usuario introducirá un número entero mayor o igual a 3; no es necesario comprobar los datos de
entrada.

Ejemplo 1:
Introduzca la altura de la pirámide maya: 5

    ******
   **    **
  **********
 ****    ****
**************

Ejemplo 2:
Introduzca la altura de la pirámide maya: 8

       ******
      **    **
     **********
    ****    ****
   **************
  ******    ******
 ******************
********    ********

*/

public class Ejercicio5_4_69 {

    public static void main(String[] args) {

        System.out.println("PINTANDO PIRÁMIDE MAYA");
        System.out.println("----------------------");

        String inputAltura = JOptionPane.showInputDialog("Introduzca la altura de la pirámide maya: ");
        Integer altura = Integer.parseInt(inputAltura);

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = altura - 1;

        while (planta <= altura) {

            // Izquierda
            for (int i = 1; i <= espacios; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i <= longitudDeLinea / 2; i++) {
                System.out.print('*');
            }

            // Centro
            System.out.print(planta % 2 == 1 ? "****" : "    ");

            // Derecha
            for (int i = 0; i <= longitudDeLinea / 2; i++) {
                System.out.print('*');
            }
            System.out.println();

            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }

}
























