package Unit5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio5_4_18 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Escribe un programa que obtenga los números enteros comprendidos entre
        dos números introducidos por teclado y validados como distintos, el 
        programa debe empezar por el menor de los enteros introducidos e ir 
        incrementando de 7 en 7.*/
        
        System.out.println("RANGO ENTRE DOS NÚMEROS");
        System.out.println("-----------------------");
        
        int num1;
        int num2;
        int acum = 0;
        
        System.out.println("Introduce el primer número: ");
        num1 = input.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        num2 = input.nextInt();
        
        if (num1 != num2) {
            for (int i = num1; i < num2; i += 7) {
                acum = acum + num1;
                num1 = num1 + 7;
                System.out.println(num1);  
            }
        } else {
            System.out.println("Los números introducidos no pueden ser iguales.");
        }  
    }
}
