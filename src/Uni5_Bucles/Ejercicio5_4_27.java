package Uni5_Bucles;

import javax.swing.*;

/* @author: Saulolo */
public class Ejercicio5_4_27 {

    public static void main(String[] args) {

        /* Escribe un programa que muestre, cuente y sume los multiplos de 3 que hay entre 1
        y un número leido por teclado */

        System.out.println("CONTEO Y SUMA DE MÚLTIPLOS DE 3 DE UN NÚMERO");
        System.out.println("--------------------------------------------");

        String input = JOptionPane.showInputDialog("Ingrese un número: ");
        int numeroIngresado = Integer.parseInt(input);

        int contador = 0;
        int suma = 0;

        System.out.println("Los multiplos de " + numeroIngresado + " son: ");

        for (int i = 1; i <= numeroIngresado; i++) {
            if (i %3 == 0) {
                System.out.println(i);
                contador++;
                suma = suma + i;
            }
        }

        System.out.println("Hay " + contador + " números");
        System.out.println("La suma total de sus múltiplos es:  " + suma );

    }

}
