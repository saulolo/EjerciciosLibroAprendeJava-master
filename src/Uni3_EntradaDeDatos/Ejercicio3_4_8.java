package Uni3_EntradaDeDatos;

import java.util.*;

public class Ejercicio3_4_8 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa que calcule el salario semanal de un empleado en 
        base a las horas trabajadas, a razón de 12 euros la hora.*/
        
        Scanner entrada = new Scanner(System.in);
        
        double horas;
        int valorHora = 12;
        double salario;
        
        System.out.println("SALARIO SEMANAL");
        System.out.println("-----------------------");
        
        System.out.println("Ingresa la cantidad de horas laboradas: ");
        horas = entrada.nextDouble();
        
        salario = horas * valorHora;
        
        System.out.println("salario semanal = " + salario + " €.");
        

    }
    
}
