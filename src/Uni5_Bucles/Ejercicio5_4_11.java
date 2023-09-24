package Uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */
public class Ejercicio5_4_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Escribe un programa que muestre en tres columnas, el cuadrado y el 
        cubo de los 5 primeros números enteros a partir de uno que se introduce 
        por teclado.*/
        System.out.println("CUBO DE 5 PRIMEROS NÚMEROS");
        System.out.println("--------------------------");

        int numIng;
        int cuadrado = 0;
        int cubo = 0;
        int contador = 1;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el número " + contador);
            numIng = input.nextInt();
            contador = contador + 1;
            cuadrado = numIng * numIng;
            cubo = numIng * numIng * numIng;
            System.out.println("El cuadrado es: " + cuadrado);
            System.out.println("El cubo es es: " + cubo);
            System.out.println(" ");
        }
        
        System.out.println("================================================");
        System.out.println("SOLUCIÓN DEL LIBRO");

        System.out.print("Introduzca un número: ");
        numIng = input.nextInt();
        
        int numing2;

        System.out.println("   n  |    n²   |    n³");
        System.out.println("---------------------------");
        for (numing2 = 0; numing2 < 5 + 5; numing2++) {
            System.out.printf("%5d |%8d |%9d\n", numing2, numing2 * numing2, numing2 * numing2 * numing2);
            
        }
    }
}
