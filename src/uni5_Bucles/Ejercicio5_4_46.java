package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos. Se debe pedir al usuario
la anchura y la altura. Hay que comprobar que tanto la anchura como la altura sean mayores o iguales que 2, en
caso contrario se debe mostrar un mensaje de error.

Ejemplo 1:
Por favor, introduzca la anchura del rectángulo (como mínimo 2): 4
Ahora introduzca la altura (como mínimo 2): 1
Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.

Ejemplo 2:
Por favor, introduzca la anchura del rectángulo (como mínimo 2): 6
Ahora introduzca la altura (como mínimo 2): 4
* * * * * *
*         *
*         *
* * * * * *

*/

public class Ejercicio5_4_46 {

    public static void main(String[] args) {

        System.out.println("PINTANDO UN RECTÁNGULO");
        System.out.println("----------------------");

        String inputAnchura = JOptionPane.showInputDialog("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        int anchura = Integer.parseInt(inputAnchura);

        String inputAltura = JOptionPane.showInputDialog("Ahora introduzca la altura (como mínimo 2): ");
        int altura = Integer.parseInt(inputAltura);


        if (anchura >= 2 && altura >= 2) {
            for (int i = 0; i < anchura; i++) {
                System.out.print("* ");
            }
            System.out.println();

            for (int i = 2; i < altura; i++) {
                System.out.print("* ");
                for (int j = 2; j < anchura; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }

            if (altura > 1) {
                for (int i = 0; i < anchura; i++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y " +
                    "la altura es 2.");
        }

    }

}














