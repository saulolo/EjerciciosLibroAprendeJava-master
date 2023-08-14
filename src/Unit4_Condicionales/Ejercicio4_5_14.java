package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_14 {
    
    public static void main(String[] args) {
        
        /*Realiza un programa que diga si un número introducido por teclado 
        es par y/o divisible entre 5.*/
        
        System.out.println("NÚMERO PAR O DIVISIBLE POR 5");
        System.out.println("----------------------------");
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        
        if (num %2==0 || num %5==0) {
            System.out.println("El número introducido es par o divisible por cinco");
        }
        else {
            System.out.println("El número introdicido no cumple con ninguna de las dos condiciones");   
        }
        
    }
    
}
