package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_17 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Escribe un programa que diga cuál es la última cifra de un número
        entero introducido por teclado.*/
        
        int numero;
        int modNumero;
        
        System.out.println("ULTIMA CIFRA DE UN NÚMERO");
        System.out.println("-------------------------");
        
        System.out.println("Ingresa por favor un número: ");
        numero = entrada.nextInt();
        
        modNumero = numero%10 ;
        
        System.out.println("La útima cifra del número " + numero + " es: " + modNumero);
        
    }
    
}
