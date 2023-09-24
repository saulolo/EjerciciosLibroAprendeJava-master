package Uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */
public class Ejercicio5_4_24 {

    public static void main(String[] args) {

        /*Escribe un programa que lea un número n e imprima una pirámide de 
        números con n filas como en la siguiente figura:
           1
          121
         12321
        1234321
         */
        System.out.println("PINTAR PIRÁMIDE A BASE DE NÚMEROS");
        System.out.println("---------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("introduzca la altura de la pirámide: ");
        int alturaIntroducida = input.nextInt();

        int altura = 1;
        int i = 0;
        int espacios = alturaIntroducida - 1;

        while (altura <= alturaIntroducida) {

            // inserta espacios
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // pinta la línea de números
            for (i = 1; i < altura; i++) {
                System.out.print(i);
            }

            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }

            System.out.println();

            altura++;
            espacios--;
        } // while

    }

}
