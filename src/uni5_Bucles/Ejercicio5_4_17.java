package uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio5_4_17 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Realiza un programa que sume los 100 números siguientes a un número 
        entero y positivo introducido por teclado. Se debe comprobar que el dato 
        introducido es correcto (que es un número positivo).*/
        
        System.out.println("SUMA DE NÚMEROS A UN ENTERO POSITIVO");
        System.out.println("------------------------------------");
        
        int numero;
        int suma = 0;

        do {
            System.out.println("Introduce un número positivo");
            numero = input.nextInt();

            if (numero < 0) {
                System.out.println("Número introducido es negativo, introduce un "
                        + "número positivo");
            }

        } while (numero < 0);

        for (int i = numero; i <= numero + 100; i++) {
            suma = suma + i;

        }
        
        System.out.println("La suma de los 100 números siguientes a " + numero
                + " es: " + suma);

    }
}
