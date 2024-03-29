package uni3_EntradaDeDatos;

import java.util.Scanner;

public class Ejercicio3_4_2 {
    
    public static void main(String[] args) {
        
        /*Realiza un conversor de euros a pesetas. La cantidad de euros que se 
        quiere convertir debe ser introducida por teclado.*/
        

        
        System.out.println("Por favor introduce la cantidad de Euros a convetir: ");
        Scanner entrada = new Scanner (System.in);
        double euro = entrada.nextDouble();
        
        double peseta = euro * 166.3860;
        
        System.out.println("los " + euro + " euros ingresados equivalen a " 
                + peseta + " pesetas.");
        
    }
    
}
