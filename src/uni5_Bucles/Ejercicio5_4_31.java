package uni5_Bucles;

import javax.swing.*;

/* @author: Saulolo */
public class Ejercicio5_4_31 {

    /* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la
    altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la
    altura más uno..*/

    /*      Introduzca la altura de la L: 5
     *
     *
     *
     *
     * * *
     */

    public static void main(String[] args) {

        System.out.println("PINTANDO LA LETRA L");
        System.out.println("-------------------");

        String inputAlt = JOptionPane.showInputDialog("Ingrese la altura: ");
        int altura = Integer.parseInt(inputAlt);

        int longitud = (altura / 2) + 1;

        for (int i = 1; i <= altura; i++) {
            if (i == altura) {
                for (int j = 1; j <= longitud; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
