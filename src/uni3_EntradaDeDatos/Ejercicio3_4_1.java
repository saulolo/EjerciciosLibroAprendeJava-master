package uni3_EntradaDeDatos;

import java.util.Scanner;

public class Ejercicio3_4_1 {
    
    public static void main(String[] args) {
        
        /*Realiza un programa que pida dos números y que luego muestre el 
        resultado de su multiplicación.*/
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresa los dos números a multiplicar: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        int multiplicacion = num1 * num2;
        
        System.out.println("La multiplicación de: " + num1 + " x " + num2 + " = " + multiplicacion);
        
    }
    
}
