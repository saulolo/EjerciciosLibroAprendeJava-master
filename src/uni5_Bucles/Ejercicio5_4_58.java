package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que calcule la media de los dígitos que contiene un número entero introducido por teclado.

Ejemplo 1:
Introduzca un número: 609831
La media de sus dígitos es 4.5

Ejemplo 2:
Introduzca un número: 78201345
La media de sus dígitos es 3.75

Ejemplo 3:
Introduzca un número: 24
La media de sus dígitos es 3.0

Ejemplo 4:
Introduzca un número: 8
La media de sus dígitos es 8.0

*/

public class Ejercicio5_4_58 {

    public static void main(String[] args) {

        System.out.println("PROMEDIO DE LOS DÍGITOS");
        System.out.println("-----------------------");

        String inputNumero = JOptionPane.showInputDialog("Introduzca un número: ");
        Double numero = Double.parseDouble(inputNumero);

        int suma = 0;
        int longitud = 0;

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
            longitud++;
        }

        System.out.println("La media de sus dígitos es " + (double)suma / longitud);
    }

}



















