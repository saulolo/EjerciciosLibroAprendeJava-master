package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte una escalera que va descendiendo de izquierda a derecha. El programa pedirá el
número de escalones y la altura de cada escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.

Ejemplo 1:
Introduzca el número de escalones: 4
Introduzca la altura de cada escalón: 2
****
****
********
********
************
************
****************
****************

Ejemplo 2:
Introduzca el número de escalones: 3
Introduzca la altura de cada escalón: 3
****
****
****
********
********
********
************
************
************

*/

public class Ejercicio5_4_67 {

    public static void main(String[] args) {

        System.out.println("PINTANDO ESCALERA DESCENDENTE");
        System.out.println("-----------------------------");

        String inputEscalones = JOptionPane.showInputDialog("Introduzca el número de escalones: ");
        Integer escalones = Integer.parseInt(inputEscalones);

        String inputAltura = JOptionPane.showInputDialog("Introduzca la altura de cada escalón: ");
        Integer altura = Integer.parseInt(inputEscalones);


        for (int i = 1; i <= escalones; i++) {
            for (int j = 1; j <= altura; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("****");
                }
                System.out.println();
            }
        }
    }
}























