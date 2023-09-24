package Uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_18 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Escribe un programa que diga cuál es la primera cifra de un número 
        entero introducido por teclado. Se permiten números de hasta 5 cifras.*/
        
        int numero;
        int primerCifra = 0;

        
        System.out.println("PRIMERA CIFRA DE UN NÚMERO");
        System.out.println("-------------------------");
        
        System.out.println("Ingresa un número máximo de 5 cifras");
        numero = entrada.nextInt();
        
        
        if (numero >= 1 && numero <= 9) {
            primerCifra = numero / 1;   
        } 
        if (numero >= 10 && numero <= 99) {
            primerCifra = numero / 10;    
        } 
        if (numero >= 100 && numero <= 999) {
            primerCifra = numero / 100; 
        }
        if (numero >= 1000 && numero <= 9999) {
            primerCifra = numero / 1000; 
        }
        if (numero >= 10000 && numero <= 99999) {
            primerCifra = numero / 10000; 
        }
        
        System.out.println("La primera cifra del número ingresado es: " + primerCifra);
        
    }
    
}
