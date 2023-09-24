package Uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los 5 números
consecutivos a partir del número introducido. Al lado de cada número se debe indicar si se trata de un primo o no..

Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo
*/

public class Ejercicio5_4_42 {

    public static void main(String[] args) {

        System.out.println("NÚMEROS CONSECUTIVOS Y PRIMOS");
        System.out.println("-----------------------------");

        String input = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        int numero = Integer.parseInt(input);

        for (int i = numero; i < numero + 5; i++) {
            if (i <= 1) {
                System.out.println(i + " no es primo");
            } else {
                boolean esPrimo = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                String mensaje = esPrimo ? " es primo" : " no es primo"; //Condicional terciario
                System.out.println(i + mensaje);

            }
        }
    }
}














