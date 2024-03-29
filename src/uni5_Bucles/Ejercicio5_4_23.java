package uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */
public class Ejercicio5_4_23 {

    public static void main(String[] args) {

        /*Escribe un programa que permita ir introduciendo una serie 
        indeterminada de números mientras su suma no supere el valor 10000. 
        Cuando esto último ocurra, se debe mostrar el total acumulado, el 
        contador de los números introducidos y la media..
         */
        System.out.println("SUMANDO NÚMEROS CONSECUTIVOS HASTA 10000");
        System.out.println("----------------------------------------");

        Scanner input = new Scanner(System.in);

        
        System.out.println("El programa terminará cuando la suma de los números "
                + "sea mayor que 10000");
        System.out.println("Por favor, introdusca los números.");
        
        int numeroIntro;
        int suma = 0;
        int numeroElementos = 0;

        do {
            numeroIntro = input.nextInt();
            System.out.println("el número introducido es: " + numeroIntro);
            input.nextLine();

            suma = suma + numeroIntro;

            numeroElementos = numeroElementos + 1;

        } while (suma < 10000);

        System.out.println("Ha introducido un total de " + numeroElementos + " números.");
        System.out.println("La suma total es " + suma + ".");
        System.out.println("La media es " + suma / (double) numeroElementos);

    }

}
