package Uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero
 * con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores que
 * hay en el array numero. En el array cubo se deben almacenar los cubos de los valores que hay en numero. A
 * continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.
 * @author Saulolo
 */
public class Ejercicio7_4_4 {

    public static void main(String[] args)  {


        String into = ("MOSTRANDO TRES ARRAYS EN TRES COLUMNAS");
        JOptionPane.showMessageDialog(null, into);

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        int i;

        for (i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random()*101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * numero[i];
        }

        System.out.println("A continuación se muestran en tres columnas, un número aleatorio entre " +
                "0 y 100, su cuadrado y su cubo: ");

        System.out.println("  n  │   n²  │    n³\n─────┼───────┼─────────");
        for (i = 0; i < 20; i++) {
            System.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
        }

    }

}


