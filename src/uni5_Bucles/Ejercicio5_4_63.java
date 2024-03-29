package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos, una al lado de la otra y separadas por un
espacio en su base.

Ejemplo 1:
Introduzca la altura de la primera pirámide: 7
Introduzca la altura de la segunda pirámide: 3

      *
     ***
    *****
   *******
  *********     *
 ***********   ***
************* *****

Ejemplo 2:
Introduzca la altura de la primera pirámide: 4
Introduzca la altura de la segunda pirámide: 5

            *
   *       ***
  ***     *****
 *****   *******
******* *********
*/

public class Ejercicio5_4_63 {

    public static void main(String[] args) {

        System.out.println("PINTANDO DOS PIRÁMIDES RELLENAS");
        System.out.println("-------------------------------");

        String inputAltura1 = JOptionPane.showInputDialog("Introduzca la altura de la primera pirámide: ");
        Integer primeraAltura = Integer.parseInt(inputAltura1);

        String inputAltura2 = JOptionPane.showInputDialog("Introduzca la altura de la segunda pirámide: ");
        Integer segundaAltura = Integer.parseInt(inputAltura2);


        int alturaMaxima = Math.max(primeraAltura, segundaAltura);
        int espaciosP1 = primeraAltura - 1;
        int espaciosP2 = segundaAltura - 1;
        int baseP1 = primeraAltura * 2 - 1;
        int baseP2 = segundaAltura * 2 - 1;
        int asteriscosP1 = 1;
        int asteriscosP2 = 1;



        for (int i = alturaMaxima; i > 0; i--) {

            // Pirámide 1

            if (i > primeraAltura) {
                // Si la pirámide 1 queda por debajo, pinta el hueco.
                for (int j = 0; j <= baseP1; j++) {
                    System.out.print(" ");
                }
            } else {
                // Espacios por delante de la pirámide 1
                for (int j = 0; j < espaciosP1; j++) {
                    System.out.print(" ");
                }

                // Pirámide 1
                for (int j = 0; j < asteriscosP1; j++) {
                    System.out.print("*");
                }

                // Espacios por detrás de la pirámide 1
                for (int j = 0; j <= espaciosP1; j++) {
                    System.out.print(" ");
                }

                espaciosP1--;
                asteriscosP1 += 2;
            }

            // Pirámide 2

            if (i > segundaAltura) {
                // Si la pirámide 2 queda por debajo, pinta el hueco.
                for (int j = 0; j < baseP2; j++) {
                    System.out.print(" ");
                }
            } else {
                // Espacios por delante de la pirámide 1
                for (int j = 0; j < espaciosP2; j++) {
                    System.out.print(" ");
                }

                // Pirámide 1
                for (int j = 0; j < asteriscosP2; j++) {
                    System.out.print("*");
                }

                // Espacios por detrás de la pirámide 1
                for (int j = 0; j <= espaciosP1; j++) {
                    System.out.print(" ");
                }

                espaciosP2--;
                asteriscosP2 += 2;
            }
            System.out.println();
        }


    }
}





















