package Uni3_EntradaDeDatos;

import java.util.Scanner;

public class Ejercicio3_4_3 {
    
    public static void main(String[] args) {
        
        /*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se
        quiere convertir debe ser introducida por teclado.*/
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor introduce la cantidad de pesetas a "
                + "convetir: ");
        
        double peseta = entrada.nextDouble();

        double euro = peseta * 0.006010121;

        System.out.print("las " + peseta + " pesetas ingresados equivalen a "); 
        System.out.printf("%1.2f", euro);
        System.out.print (" euros.");

    }

}
