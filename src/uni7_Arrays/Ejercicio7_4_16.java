package uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos
 * entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el
 * usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar
 * el array escribiendo los números que se quieren resaltar entre corchetes.
 *
 * Ejemplo:
 * 159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
 * ¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
 * 159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13
 *
 * @author Saulolo
 */
public class Ejercicio7_4_16 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("RESALTANDO NÚMEROS DE UN ARRAY");
        JOptionPane.showMessageDialog(null, into);

        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }

        System.out.print("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int opcion = input.nextInt();

        int multiplo = (opcion == 1) ? 5 : 7;

        // Muestra el resultado.
        for (int elemento : n) {
            if (elemento % multiplo == 0) {
                System.out.print("[" + elemento + "] ");
            } else {
                System.out.print(elemento + " ");
            }
        }


    }

}

