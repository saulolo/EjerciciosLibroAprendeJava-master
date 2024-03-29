package uni3_EntradaDeDatos;

import java.util.*;

public class Ejercicio3_4_5 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa que calcule el área de un rectángulo.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int base;
        int altura;
        int area;
        
        System.out.println("ÁREA DE UN RECTANGULO");
        System.out.println("---------------------");
        
        
        System.out.println("Ingresa la  base (cm)");
        base = entrada.nextInt();
        
        System.out.println("Ingresa la altura (cm)");
        altura = entrada.nextInt();
        
        area = base * altura;
        
        
        System.out.println("El área del rectángulo es: " + area + " cm cuadrados");
        
    }
    
}
