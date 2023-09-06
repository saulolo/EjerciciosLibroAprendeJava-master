package Unit5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los números
desde el 1 al número introducido junto con su factorial.

Ejemplo:
Por favor, introduzca un número entero positivo: 7
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5040

*/

public class Ejercicio5_4_39 {

    public static void main(String[] args) {

        System.out.println("NÚMERO FACTORIAL");
        System.out.println("----------------");

        String input = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        int numero = Integer.parseInt(input);

        long factorial = 1;

        if(numero >= 0) {
            for (int i = 1; i <=numero; i++) {
                factorial *= i;
                System.out.println(i + "!" + " = " + factorial);
            }

            System.out.println("Número no válido, debe de ser un entero positivo.");
        }
    }
}







