package uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos
 * junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
 * @author Saulolo
 */
public class Ejercicio7_4_5 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("MOSTRANDO EL NÚMERO MÁX Y MIN");
        JOptionPane.showMessageDialog(null, into);

        System.out.println("Ingresa 10 números, por favor: ");

        int[] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int i;

        for (i = 0; i < 10; i++) {

            System.out.println("Número " + (i+1) + ":");
            numero[i] = input.nextInt();

            if (numero[i] < minimo) minimo = numero[i];
            if (numero[i] > maximo)  maximo = numero[i];
            }

        System.out.println();

/*
        for (i = 0; i < 10; i++) {
            System.out.print(numero[i]);
            if (numero[i] == maximo) System.out.print(" máximo");
            if (numero[i] == minimo) System.out.print(" mínimo");

            System.out.println();
        }
*/

        //Mostrando con un foreach
        for (int num : numero) {
            System.out.print(num);
            if (num == maximo) System.out.print(" máximo");
            if (num == minimo) System.out.print(" mínimo");
            System.out.println();

        }
    }
}
