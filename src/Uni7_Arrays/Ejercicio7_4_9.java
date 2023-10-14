package Uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la
 * palabra “par” o “impar” según proceda.
 * @author Saulolo
 */
public class Ejercicio7_4_9 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("VERIFICANDO SI ES PAR O IMPAR");
        JOptionPane.showMessageDialog(null, into);

        int[] numeros = new int[8];

        System.out.println("Escribe 8 números, por favor: ");

        for (int i = 0; i < 8; i++) {
            System.out.println("Número " + (i+1) + ":");
            numeros[i] =  input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] %2 == 0) System.out.println(numeros[i] + ": Par");
            else System.out.println(numeros[i] + ": Impar");

        }

    }
}
