package Uni3_EntradaDeDatos;

import java.util.*;

public class Ejercicio3_4_6 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa que calcule el área de un triángulo.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int area;
        int base;
        int altura;
        int constante = 2;
        
        System.out.println("ÁREA DE UN RECTANGULO");
        System.out.println("-----------------------");
        
        System.out.println("Ingresa la longitud de la base (cm): ");
        base = entrada.nextInt();
        
        System.out.println("Ingresa la longitud de la altura (cm): ");
        altura = entrada.nextInt();
        
        area = ((base * altura) / constante);
        
        System.out.println("El área del triangulo es: " + area + " cm.");
        
    }
    
}
