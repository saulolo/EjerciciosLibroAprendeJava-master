package Unit5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números capicúa se
leen igual hacia delante y hacia atrás. El programa debe aceptar números de cualquier longitud siempre que lo
permita el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar long en lugar de int
ya que el primero admite números más largos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 678
El 678 no es capicúa.

Ejemplo 2:
Por favor, introduzca un número entero positivo: 2019102
El 2019102 es capicúa.

*/

public class Ejercicio5_4_36 {

    public static void main(String[] args) {

        System.out.println("NÚMERO CAPICÚA");
        System.out.println("--------------");

        String input = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        Long numero = Long.parseLong(input);

        long numeroOriginal = numero;

        long numeroInvertido = 0;

        while (numero > 0) {
            long digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println("El " + numeroOriginal + " es capicúa.");
        } else {
            System.out.println("El " + numeroOriginal + " no es capicúa.");
        }
    }
}







