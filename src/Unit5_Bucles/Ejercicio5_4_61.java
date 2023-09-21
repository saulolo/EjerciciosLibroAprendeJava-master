package Unit5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

    /* Escribe un programa que pinte por pantalla la letra V. El ancho del palo de la V es siempre de 3 asteriscos. El
    usuario debe introducir la altura. La altura mínima es de 3 pisos. Si el usuario introduce una altura menor, el
    programa debe mostrar un mensaje de error.

    Ejemplo 1:
    Introduzca la altura de la V (un número mayor o igual a 3): 7
    ***            ***
     ***          ***
      ***        ***
       ***      ***
        ***    ***
         ***  ***
          ******

    Ejemplo 2:
    Introduzca la altura de la V (un número mayor o igual a 3): 4
    ***      ***
     ***    ***
      ***  ***
       ******

    Ejemplo 3:
    Introduzca la altura de la V (un número mayor o igual a 3): 9
    ***                ***
     ***              ***
      ***            ***
       ***          ***
        ***        ***
         ***      ***
          ***    ***
           ***  ***
            ******

    Ejemplo 4:
    Introduzca la altura de la V (un número mayor o igual a 3): 2
    La altura debe ser mayor o igual a 3.



    */

    public class Ejercicio5_4_61 {

        public static void main(String[] args) {

            System.out.println("PINTANDO LA LETRA V");
            System.out.println("-------------------");

            String inputNumero = JOptionPane.showInputDialog("Introduzca la altura de la V (un número mayor o igual a 3): ");
            Integer alturaIntroducida = Integer.parseInt(inputNumero);

            int altura = 0;
            int i = 0;
            int espaciosInternos = alturaIntroducida * 2 - 1;
            int espaciosPorDelante = 0;

            if (alturaIntroducida < 3) {
                System.out.println("La altura debe ser mayor o igual a 3.");
            } else {
                while (altura < alturaIntroducida) {
                    for (i = 1; i <= espaciosPorDelante; i++) {
                        System.out.print(" ");
                    }

                    System.out.print("***");
                    for (i = 1; i < espaciosInternos; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("***");

                    altura++;
                    espaciosPorDelante++;
                    espaciosInternos -= 2;
                }
            }
        }
    }




















