package Uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Vamos a ampliar uno de los ejercicios de la relación anterior para 
        considerar las horas extras. Escribe un programa que calcule el salario 
        semanal de un trabajador teniendo en cuenta que las horas ordinarias 
        (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de 
        la hora 41, se pagan a 16 euros la hora.
        
        Ejemplo 1: Por favor, introduzca el número de horas trabajadas durante 
        la semana: 36 
        El sueldo semanal que le corresponde es de 432 euros.
        Ejemplo 2: Por favor, introduzca el número de horas trabajadas durante 
        la semana: 40 
        El sueldo semanal que le corresponde es de 480 euros.
        Ejemplo 3: Por favor, introduzca el número de horas trabajadas durante 
        la semana: 55 
        El sueldo semanal que le corresponde es de 720 euros. */
        
        System.out.println("NÓMINA CON HORAS EXTRAS");
        System.out.println("-----------------------");
        
        int horas;
        int nomina;
        
        System.out.println("Por favor, introduzca el número de horas trabajadas "
                + "durante la semana: ");
        horas = entrada.nextInt();
        
        if (horas <= 40){
            nomina = horas * 12;
        }
        else {
            nomina = (40 * 12) + ((horas - 40) * 16);
        }
        System.out.println("Para las horas trabajadas, tu nómina semanal es de: " + nomina + " euros");
    }

}
