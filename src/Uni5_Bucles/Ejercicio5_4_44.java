package Uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que sea capaz de insertar un dígito dentro de un número indicando la posición. El nuevo
dígito se colocará en la posición indicada y el resto de dígitos se desplazará hacia la derecha. Las posiciones
se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario introduce correctamente los datos.
Se recomienda usar long en lugar de int ya que el primero admite números más largos.

Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición donde quiere insertar: 3
Introduzca el dígito que quiere insertar: 5
El número resultante es 4056783.

*/

public class Ejercicio5_4_44 {

    public static void main(String[] args) {

        System.out.println("INSERTANDO UN DÍGITO EN UN NÚMERO");
        System.out.println("---------------------------------");

        String inputNumero = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(inputNumero);

        String inputPosicion = JOptionPane.showInputDialog("Introduzca la posición donde quiere insertar: ");
        int posicion = Integer.parseInt(inputPosicion);

        String inputDigito = JOptionPane.showInputDialog("Introduzca el dígito que quiere insertar: ");
        int digito = Integer.parseInt(inputDigito);

        if (numero >= 0 && posicion >= 1) {

            // Calcular el número resultante
            long parteIzquierda = numero / (long) Math.pow(10, posicion - 1);
            long parteDerecha = numero % (long) Math.pow(10, posicion - 1);

            long numeroResultante = parteIzquierda * (long) Math.pow(10, String.valueOf(digito).length()) + digito * (long) Math.pow(10, posicion - 1) + parteDerecha;

            System.out.println("El número resultante es " + numeroResultante + ".");
        } else {
            System.out.println("Los datos introducidos no son válidos.");
        }
    }
}













