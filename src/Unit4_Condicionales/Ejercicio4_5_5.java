package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_5 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Realiza un programa que resuelva una ecuación de primer grado 
        (del tipo ax+b =0).
        
        Ejemplo 1: Este programa resuelve ecuaciones de primer grado del tipo 
        ax + b = 0
        Por favor, introduzca el valor de a: 2 
        Ahora introduzca el valor de b: 1
        x = -0.5
        
        Ejemplo 2: Este programa resuelve ecuaciones de primer grado del tipo 
        ax + b = 0
        Por favor, introduzca el valor de a: 0
        Ahora introduzca el valor de b: 7
        Esa ecuación no tiene solución real.
        */
        
        System.out.println("ECUACIÓN LINEAL");
        System.out.println("-----------------------");
        
        double a;
        double b;
        double x;
        
        System.out.println("Por favor, introduzca el valor de a: ");
        a = entrada.nextInt();
        
        System.out.println("Ahora, introduzca el valor de b: ");
        b = entrada.nextInt();
        
        x = (-b/a);
        
        if (a == 0) {
            System.out.println("La ecuación no tiene solución en los reales");
        }
        else {
            x = (-b/a);
        }
        
        System.out.println("x = " + (-b/a));
    }

}
