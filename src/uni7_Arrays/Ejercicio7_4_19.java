package uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Realiza un programa que sea capaz de insertar un número en una posición concreta de un array.
 * En primer lugar, el programa generará un array de 12 números enteros aleatorios entre 0 y 200
 * ambos incluidos. A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11).
 * Seguidamente el programa preguntará por el número que se quiere insertar y por la posición donde
 * será  insertado. Los números del array se desplazan a la derecha para dejar sitio al nuevo.
 * El último número (el que se encuentra en la posición 11) siempre se perderá.
 *
 * Ejemplo 1:
 * Array original:
 * Índice 0 1 2 3 4 5 6 7 8 9 10 11
 * Valor 5 82 0 131 113 200 134 44 48 134 68 151
 * Introduzca el número que quiere insertar: 77
 * Introduzca la posición donde lo quiere insertar (0 – 11): 6
 * Array resultado:
 * Índice 0 1 2 3 4 5 6 7 8 9 10 11
 * Valor 5 82 0 131 113 200 77 134 44 48 134 68
 *
 * Ejemplo 2:
 * Array original:
 * Índice 0 1 2 3 4 5 6 7 8 9 10 11
 * Valor 148 86 64 126 77 148 182 99 8 126 73 20
 * Introduzca el número que quiere insertar: 33
 * Introduzca la posición donde lo quiere insertar (0 – 11): 11
 * Array resultado:
 * Índice 0 1 2 3 4 5 6 7 8 9 10 11
 * Valor 148 86 64 126 77 148 182 99 8 126 73 33
 *
 * Ejemplo 3:
 * Array original:
 * Índice 0 1 2 3 4 5 6 7 8 9 10 11
 * Valor 186 4 58 150 200 141 34 137 62 170 200 70
 * Introduzca el número que quiere insertar: 88
 * Introduzca la posición donde lo quiere insertar (0 – 11): 2
 * Array resultado:
 * Índice 0 1 2 3 4 5 6 7 8 9 10 11
 * Valor 186 4 88 58 150 200 141 34 137 62 170 200
 * @author Saulolo
 */
public class Ejercicio7_4_19 {

    public static void main(String[] args)  {

        String into = ("INSERTANDO NÚMERO EN UN ARRAY");
        JOptionPane.showMessageDialog(null, into);


        // Crea el array con valores aleatorios
        int[] n = new int[12];

        for (int i = 0; i < 12; i++) {
            n[i] = (int) (Math.random() * 201);
        }

        // Muestra el array original
        System.out.println("Array original:");

        System.out.print("\nÍndice ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }

        System.out.print("\nValor  ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", n[i]);
        }

        // Pide el número y la posición donde colocarlo
        Scanner s = new Scanner(System.in);

        System.out.print("\n\nIntroduzca el número que quiere insertar: ");
        int numero = Integer.parseInt(s.nextLine());

        System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
        int posicion = Integer.parseInt(s.nextLine());

        // Inserta el número y desplaza el resto hacia la derecha
        for (int i = 11; i > posicion; i--) {
            n[i] = n[i - 1];
        }

        n[posicion] = numero;

        // Muestra el resultado
        System.out.println("\nArray resultado:");

        System.out.print("\nÍndice ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }

        System.out.print("\nValor  ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", n[i]);
        }
    }

}

