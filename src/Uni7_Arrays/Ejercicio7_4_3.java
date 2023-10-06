package Uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir, el
 * primero que se introduce es el último en mostrarse y viceversa.
 * @author Saulolo
 */
public class Ejercicio7_4_3 {

    public static void main(String[] args)  {

        Scanner input = new  Scanner(System.in);

        String into = ("MOSTRANDO UN ARRAY INVERSO");
        JOptionPane.showMessageDialog(null, into);

        int[] numeros = new int[10];

        System.out.println("Ingresa 10 números, por favor: ");

        for (int i = 0; i < 10; i++) {

            System.out.println("Número " + (i + 1) + ":"); //Asi pido número por número.
            numeros[i] = input.nextInt();
        }

        System.out.println("Los números ingresados en orden inverso son: ");

        for (int j = 9; j >= 0; j--) {
            System.out.println(numeros[j] + " ");

        }
    }
}

