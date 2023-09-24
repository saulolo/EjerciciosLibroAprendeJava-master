package Uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */
public class Ejercicio5_4_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Escribe un programa que lea una lista de diez números y determine 
        cuántos son positivos, y cuántos son negativos.*/
        System.out.println("LISTA DE NÚMEROS");
        System.out.println("----------------");

        int num;
        int contador = 0;
        int acumPositivo = 0;
        int acumNegativo = 0;

        for (int i = 1; i <= 10; i++) {
            contador = contador + 1;
            System.out.println("Ingrese 10 números");
            num = input.nextInt();

            if (num > 0) {
                acumPositivo = acumPositivo + 1;
                System.out.println("Este es el # " + i + " ingresado y corresponde"
                        + " al número " + num);
                System.out.println("llevamos " + acumPositivo + " números positivos");

            } else {
                acumNegativo = acumNegativo + 1;
                System.out.println("Este es el # " + i + " ingresado y corresponde"
                        + " al número " + num);
                System.out.println("llevamos " + acumNegativo + " números negativos");

            }
            
        }
        System.out.println("Total números positivos ingresados: " + acumPositivo);
        System.out.println("Total números negativos ingresados: " + acumNegativo);
        
        
        
        System.out.println("================================================");
        System.out.println("SOLUCIÓN DEL LIBRO");
        
        System.out.println("Por favor, introduzca 10 números enteros: ");

        int negativos = 0;
        int positivos = 0;
        int numeroIntroducido;

        for (int i = 0; i < 10; i++) {
            numeroIntroducido = input.nextInt();
            if (numeroIntroducido < 0) {
                negativos++;
            } else {
                positivos++;
            }
        }

        System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos.");
    }

}


