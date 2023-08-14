package Uni3_EntradaDeDatos;

import java.util.*;

public class Ejercicio3_4_10 {
    
    public static void main(String[] args) {
        
        /*Realiza un conversor de Mb a Kb.*/
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CONVERSOR");
        System.out.println("-----------------------");
        
        
        int megabyte = 1024;
        int kilobyte;
        int conversion;
        
        System.out.println("Ingrese la cantidad de Mb a convertir: ");
        kilobyte = entrada.nextInt();
        
        conversion = megabyte * kilobyte;
        
        System.out.println(kilobyte + " Mb = " + conversion + " Kb");
        
    }
    
}
