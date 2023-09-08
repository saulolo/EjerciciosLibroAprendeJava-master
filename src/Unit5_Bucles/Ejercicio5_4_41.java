package Unit5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número. Se
recomienda usar long en lugar de int ya que el primero admite números más largos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
El 406783 contiene 4 dígitos pares y 2 dígitos impares.

Ejemplo 2:
Por favor, introduzca un número entero positivo: 3177840
El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
*/

public class Ejercicio5_4_41 {

    public static void main(String[] args) {

        System.out.println("DÍGITOS PARES E IMPARES EN UN NÚMERO");
        System.out.println("------------------------------------");

        String input = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(input);

        long digitoPar = 0;
        long digitoImpar = 0;

        while (numero > 0) {
            long digito = numero % 10;
            if (digito % 2 == 0) {
                digitoPar++;
            } else {
                digitoImpar++;
            }
            numero /= 10;
        }
        System.out.println("El número original contenía " + digitoPar + " dígitos pares y " + digitoImpar + " dígitos impares.");
    }
}







