package uni7_Arrays;

import javax.swing.*;

/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores
 * según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en
 * forma de tabla como se muestra en la figura (pag 131).
 *
 * @author Saulolo
 */
public class Ejercicio7_5_1 {

    public static void main(String[] args)  {

        String into = ("MOSTRANDO UN ARRAY DE NÚMEROS");
        JOptionPane.showMessageDialog(null, into);

        int[][] num = new int[3][6];

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;

        num[1][0] = 75;
        num[1][4] = 0;

        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.printf(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}

