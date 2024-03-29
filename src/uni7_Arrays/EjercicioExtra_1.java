package uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Crear un arreglo de 10 elementos enteros y contar los elementos negativos, positivos, pares
 * e impares.
 * @author Saulolo
 */
public class EjercicioExtra_1 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("MOSTRANDO UN ARRAY DE 10 NÚMEROS");
        JOptionPane.showMessageDialog(null, into);

        int[] elementos = new int[10];

        int negativos = 0;
        int positivos = 0;
        int pares = 0;
        int impares = 0;

        //Llenado del Array
        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Ingresa en la posición " + i + " el número correspondiente: ");
            elementos[i]  = input.nextInt();

            if (elementos[i] < 0) negativos = negativos + 1;
            if (elementos[i] > 0) positivos = positivos + 1;
            if (elementos[i] %2==0) pares = pares + 1;
            if (elementos[i] %2!=1) impares = impares + 1;
        }

        //Impresion del aaray
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        System.out.println("La cantidad de números negativos son: " + negativos);
        System.out.println("La cantidad de números positivos son: " + positivos);
        System.out.println("La cantidad de números pares son: " + pares);
        System.out.println("La cantidad de números impares son: " + impares);

    }
}

