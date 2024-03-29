package uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */
public class Ejercicio5_4_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Escribe un programa que dados dos números, uno real (base) y un entero
        positivo (exponente), saque por pantalla todas las potencias con base el
        numero dado y exponentes entre uno y el exponente introducido. No se 
        deben utilizar funciones de exponenciación. Por ejemplo, si introducimos 
        el 2 y el 5, se deberán mostrar 21, 22, 23, 24 y 25.*/
        System.out.println("TODAS LAS POTENCIAS DE UNA BASE");
        System.out.println("-------------------------------");

        int base;
        int exponenteFinal;
        int exponente;
        int potencia;

        System.out.println("Ingrese el número base: ");
        base = input.nextInt();

        System.out.println("Ingrese el número exponente máximo: ");
        exponenteFinal = input.nextInt();

        for (int i = 1; i < exponenteFinal; i++) {
            potencia = 1;
            exponente = i;
            
            for (int j = 0; j < exponente; j++) {
                potencia *= base;
            }
            System.out.println(base + "^" + i + " = " + potencia);

        }
    }

}

