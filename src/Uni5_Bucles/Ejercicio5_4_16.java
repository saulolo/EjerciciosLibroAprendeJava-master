package Uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio5_4_16 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Escribe un programa que diga si un número introducido por teclado es o
        no primo. Un número primo es aquel que sólo es divisible entre él mismo 
        y la unidad.*/
        
        int numero;
        int acum = 0;
        int aux;
        
        System.out.println("NÚMERO PRIMO");
        System.out.println("------------");
        
        System.out.println("Ingrese un número para validar si es primo: ");
        numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            aux = numero % i;
            if (aux == 0) {
                acum = acum + 1;
            }
        }
        if (acum > 2) {
            System.out.println("El número " + numero + " ingresado, NO es un número Primo");
        } else {
            System.out.println("El número " + numero + " ingresado, es un número Primo");
        }
    }
}
