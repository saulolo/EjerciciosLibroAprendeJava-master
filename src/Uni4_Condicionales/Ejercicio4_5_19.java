package Uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_19 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Realiza un programa que nos diga cuántos dígitos tiene un número 
        entero que puede ser positivo o negativo. Se permiten números de hasta 
        5 dígitos.*/
        
        int numero;
        int mostrarDigitos = 0;
        
        System.out.println("CANTIDAD DE DÍGITOS DE UN NÚMERO ENTERO");
        System.out.println("---------------------------------------");
        
        System.out.println("Ingresa un número máximo de 5 cifras: ");
        numero = entrada.nextInt();
        
        while (numero != 0) {
            numero = numero / 10;
            mostrarDigitos++;
        }
        System.out.println("Digitos: " + mostrarDigitos);
        
        
        
        System.out.println("=================================================");
        System.out.println("SOLUCIÓN DEL LIBRO");
        
        int n, digitos = 0;
    
        System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
        n = Math.abs(entrada.nextInt());

        if (n < 10) {
            digitos = 1;
        }

        if ((n >= 10) && (n < 100)) {
            digitos = 2;
        }

        if ((n >= 100) && (n < 1000)) {
            digitos = 3;
        }

        if ((n >= 1000) && (n < 10000)) {
            digitos = 4;
        }

        if (n >= 10000) {
            digitos = 5;
        }

        if (digitos == 1) {
            System.out.println("El número introducido tiene 1 dígito.");
        } else {
            System.out.println("El número introducido tiene " + digitos + " dígitos.");

        }

    }

}
  
