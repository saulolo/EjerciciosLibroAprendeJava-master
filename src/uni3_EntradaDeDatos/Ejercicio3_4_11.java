package uni3_EntradaDeDatos;

import java.util.*;

public class Ejercicio3_4_11 {
    
    public static void main(String[] args) {
        
        
        /*Realiza un conversor de Kb a Mb.*/
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CONVERSOR");
        System.out.println("-----------------------");
        
        
        double kilobyte;
        double megabyte = 1024;
        double conversion;
        
        System.out.println("Ingrese la cantidad de Kb a convertir: ");
        kilobyte = entrada.nextInt();
        
        conversion = kilobyte / megabyte ;
        
        System.out.println(kilobyte + " Kb = " + conversion + " Mb");
        
    }
    
}
