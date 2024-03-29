package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que permita partir un número introducido por teclado en dos partes. Las posiciones se
cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario introduce correctamente los datos,
es decir, el número introducido tiene dos dígitos como mínimo y la posición en la que se parte el número está
entre 2 y la longitud del número. No se permite en este ejercicio el uso de funciones de manejo de String (por ej.
para extraer subcadenas dentro de una cadena).

Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición a partir de la cual quiere partir el número: 5
Los números partidos son el 4067 y el 83.
*/

public class Ejercicio5_4_43 {

    public static void main(String[] args) {

        System.out.println("PARTIENDO UN NÚMERO");
        System.out.println("-------------------");

        String inputNumero = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        int numero = Integer.parseInt(inputNumero);

        String inputPosicion = JOptionPane.showInputDialog("Introduzca la posición a partir de la cual quiere partir el número: ");
        int posicion = Integer.parseInt(inputPosicion);

        if (posicion >= 2 && posicion <= String.valueOf(numero).length() - 1) {

            int primerNumero = numero / (int) Math.pow(10, String.valueOf(numero).length() - posicion);

            int segundoNumero = numero % (int) Math.pow(10, String.valueOf(numero).length() - posicion);

            System.out.println("Los números partidos son el " + primerNumero + " y el " + segundoNumero + ".");
        } else {
            System.out.println("La posición introducida no es válida.");
        }
    }
}













