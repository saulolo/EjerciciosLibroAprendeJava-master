package uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio5_4_9 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        /*Realiza un programa que nos diga cuántos dígitos tiene un número 
        introducido por teclado. Este ejercicio es equivalente a otro realizado 
        anteriormente, con la salvedad de que el anterior estaba limitado a 
        números de 5 dígitos como máximo. En esta ocasión, hay que realizar el 
        ejercicio utilizando bucles; de esta manera, la única limitación en el 
        número de dígitos la establece el tipo de dato que se utilice (int o 
        long).*/
        
        int numero;
        int digitos = 0;
        
        System.out.println("CONTAR LOS DÍGITOS DE UN NÚMERO");
        System.out.println("-------------------------------");
        
        System.out.println("Ingresa un número para saber cuantos dígitos tiene: ");
        numero = input.nextInt();
        
        System.out.print("Los digitos que tiene el número " + numero);
        while (numero != 0) {
            numero = numero / 10;
            digitos++;
        }
        System.out.print(" son: " + digitos);
        System.out.println(" ");
        
        
        System.out.println("=================================================");
        System.out.println("LA SOLUCIÓN DEL LIBRO");
        
        long numeroIntroducido;
        int numeroDeDigitos = 1;
        
        System.out.println("Introduzca un número entero y le diré cuántos dígitos tiene: ");
        numeroIntroducido  = input.nextLong();
        
        while (numeroIntroducido > 1) {
            numeroDeDigitos++;
            numeroIntroducido /= 10;
        }
        System.out.println("El número " + numeroIntroducido + " tiene " + numeroDeDigitos + " dígitos.");
    }
}
