package Uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7

Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3

Ejemplo 3:
Por favor, introduzca un número entero positivo: 406783
0
*/


public class Ejercicio6_3_24 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("DIGITO ALEATORIO");
        JOptionPane.showMessageDialog(null, into);

        String inputNumero = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        Long numeroIntroducido = Long.parseLong(inputNumero);

        long numero = numeroIntroducido;

        // calcula la longitud del número
        int longitud = 0;

        do {
            numero /= 10;
            longitud++;
        } while (numero > 0);

        // elige una posición al azar dentro del número
        int posicion = (int)(Math.random() * longitud) + 1;

        // extrae el dígito de esa posición
        JOptionPane.showMessageDialog(null, (numeroIntroducido / (long)(Math.pow(10, longitud - posicion))) % 10 );
    }

}

