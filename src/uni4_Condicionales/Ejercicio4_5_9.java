package uni4_Condicionales;

import java.util.Scanner;


public class Ejercicio4_5_9 {
    
    public static void main(String[] args) {
           
        Scanner entrada = new Scanner(System.in);
        
        
        /* Realiza un programa que resuelva una ecuación de segundo grado 
        (del tipo ax2 + bx + c = 0).
        Ejmplo resolver x2 -2x -24*/
        
        
        
        double a = 0;
        double b = 0;
        double c = 0;
        double x1 = 0;
        double x2 = 0;
        double discriminate = Math.pow(b, 2) - 4 * a * c;
        
        /*El discriminate se debe de analizar para que no vaya a dar negativo,
        ya qye una raiz negativa no es posible en los Reales.*/
        
        // Lo realice con la formula general. x => (-b +/- √(b2 - 4ac)) / 2a
        
        System.out.println("ECUACIÓN DE SEGUNDO GRADO");
        System.out.println("-----------------------");
        
        System.out.println("Ingresa el valor de a: ");
        a = entrada.nextDouble();
        
        System.out.println("Ingresa el valor de b: ");
        b = entrada.nextDouble();
        
        System.out.println("Ingresa el valor de c: ");
        c = entrada.nextDouble();
        
        discriminate = Math.pow(b, 2) - 4 * a * c;
        x1 = (b + Math.sqrt(discriminate)) / (2 * a);
        x2 = (b - Math.sqrt(discriminate)) / (2 * a);
        
        if (discriminate < 0) {
            System.out.println("x1 y x2 = " + x1);  
        }
        else {
            System.out.println("x1 = " + x1 + " y el x2 = " + x2);
        }
        
    }
    
}
