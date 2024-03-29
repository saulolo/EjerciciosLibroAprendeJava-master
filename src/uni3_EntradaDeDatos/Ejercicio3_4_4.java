package uni3_EntradaDeDatos;

import java.util.Scanner;

public class Ejercicio3_4_4 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa que sume, reste, multiplique y divida dos 
        números introducidos por teclado.*/
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("OPERACIONES BÁSICAS");
        System.out.println("---------------------");

        System.out.println("Ingresa los dos números a operar: ");
        double num1 = entrada.nextInt();
        double num2 = entrada.nextInt();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("La operación de los números introducios es: ");
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);    
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);         
        System.out.println("Multiplicación: " + num1 + " x " + num2 + " = " + multiplicacion);
        System.out.println("División: " + num1 + " / " + num2 + " = " + division);
        
    }
    
}
