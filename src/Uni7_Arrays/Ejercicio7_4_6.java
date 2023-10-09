package Uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los
 * elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de
 * la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.
 * Finalmente, muestra el contenido del array.
 * @author Saulolo
 */
public class Ejercicio7_4_6 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("ROTANDO NÚMEROS");
        JOptionPane.showMessageDialog(null, into);

        int[] numeros = new int[15];
        int i;

        System.out.println("Escribe 15 números, por favor: ");

        for (i = 0; i < 15; i++) {
            System.out.println("Número " + (i+1) + ":");
            numeros[i] = input.nextInt();
        }

        System.out.println("|");
        for (i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numeros[i]);
        }
        System.out.println("|");
        ////////////////////////////////////////////

        // rota una posición a la derecha //////////

        int aux = numeros[14];
        for (i = 14; i > 0; i--) {
            numeros[i] = numeros[i-1];
        }
        numeros[0] = aux;
        ////////////////////////////////////////////

        // Muestra el array rotado /////////////////
        System.out.println("\nArray rotado a la derecha una posición:");
        for (i = 0; i < 15; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        for (i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numeros[i]);
        }
        System.out.println("|");
        ////////////////////////////////////////////

    }
}
