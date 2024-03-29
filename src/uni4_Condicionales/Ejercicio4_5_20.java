package uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_20 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Realiza un programa que diga si un número entero positivo introducido 
        por teclado es capicúa. Se permiten números de hasta 5 cifras.*/
        
        int numero;
        boolean capicua = false;
        
        System.out.println("NÚMERO CAPICÚA");
        System.out.println("--------------");
        
        System.out.println("Ingresa un número máximo de 5 cifras: ");
        numero = entrada.nextInt();
        
        if (numero < 10) {
            capicua = true;
        }
        if (numero >= 10 && numero <= 100) {
            if (numero / 10 == numero % 10)
                    capicua = true;
            if (capicua == true) {
                System.out.println("El número " + numero + " ingresado es un capicúa");
            }
            else {
                System.out.println("El número " + numero + " ingresado no es un capicúa");
            }
        }
        
        if (numero >= 100 && numero <= 1000) {
            if (numero / 100 == numero % 10)
                    capicua = true;
            if (capicua == true) {
                System.out.println("El número " + numero + " ingresado es un capicúa");
            }
            else {
                System.out.println("El número " + numero + " ingresado no es un capicúa");
            }
        }
        
        if (numero >= 1000 && numero <= 10000) {
            if (numero / 1000 == numero % 10)
                    capicua = true;
            if (capicua == true) {
                System.out.println("El número " + numero + " ingresado es un capicúa");
            }
            else {
                System.out.println("El número " + numero + " ingresado no es un capicúa");
            }
        }
        
        if (numero >= 10000 && numero <= 100000) {
            if (numero / 10000 == numero % 10)
                    capicua = true;
            if (capicua == true) {
                System.out.println("El número " + numero + " ingresado es un capicúa");
            }
            else {
                System.out.println("El número " + numero + " ingresado no es un capicúa");
            }
        }
    }
}
