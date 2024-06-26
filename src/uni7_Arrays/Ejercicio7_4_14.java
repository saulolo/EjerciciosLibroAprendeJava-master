package uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
 * correspondientes a colores se deben almacenar al comienzo y las que no son colores a continuación.
 * Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa deben
 * estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco
 * y morado.
 *
 * Ejemplo:
 * Array original:
 * ┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐
 * │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │
 * ├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤
 * │casa │azul │verde │orden │morado │bombilla│bici │rosa │
 * └────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘
 *
 * @author Saulolo
 */
public class Ejercicio7_4_14 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("ALMACENANDO ARRAYS DE COLORES");
        JOptionPane.showMessageDialog(null, into);

        String[] color = {
                "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
        };

        String[] palabra = new String[8];
        String[] resultado = new String[8];

        System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra.");

        int j = 0;

        for (int i = 0; i < 8; i++) {
            palabra[i] = input.nextLine();

            // Si la palabra introducida es un color, la guarda en el array resultado.
            for (String c : color) {
                if (palabra[i].equals(c)) {
                    resultado[j++] = c;
                }
            }
        }

        // Mete las palabras que no son colores al final del array resultado.
        for (int i = 0; i < 8; i++) {
            boolean esColor = false;

            for (String c : color) {
                if (palabra[i].equals(c)) {
                    esColor = true;
                }
            }

            if (!esColor) {
                resultado[j++] = palabra[i];
            }
        }

        // Muestra el array original.
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 8; i++) {
            System.out.printf("│   %d    ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

        for (String p : palabra) {
            System.out.printf("│%-8s", p);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");

        // Muestra el array resultado.
        System.out.println("\n\nArray resultado:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 8; i++) {
            System.out.printf("│   %d    ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

        for (String r : resultado) {
            System.out.printf("│%-8s", r);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    }

}

