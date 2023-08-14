package Unit4_Condicionales;

import java.util.*;


public class Ejercicio4_5_6 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Realiza un programa que calcule el tiempo que tardará en caer un 
        objeto desde una altura h. Aplica la fórmula t =√(2h/g) siendo 
        g = 9:81m/s2.*/
        
        System.out.println("TIEMPO DE CAIDA");
        System.out.println("-----------------------");
        
        double altura;
        double caida = 0;
        double g = 9.8;
        
        System.out.println("Ingresa la altura (m) de caida del objeto: ");
        altura = entrada.nextDouble();
        
        caida = Math.sqrt((altura*2) / g);
        
        System.out.printf("El objeto tarda %.2f segundos en caer.\n", caida);
        
    }
    
}
