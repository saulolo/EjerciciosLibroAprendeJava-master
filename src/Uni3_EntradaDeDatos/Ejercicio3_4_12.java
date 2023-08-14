package Uni3_EntradaDeDatos;

import java.util.*;

public class Ejercicio3_4_12 {
    
    public static void main(String[] args) {
        
        /*Realiza un programa que calcule la nota que hace falta sacar en el 
        segundo examen de la asignatura Programación para obtener la media 
        deseada. Hay que tener en cuenta que la nota del primer examen cuenta 
        el 40% y la del segundo examen un 60%.*/
        
                
        System.out.println("CÁLCULO DE NOTA");
        System.out.println("---------------------");
        
        Scanner entrada = new Scanner(System.in);
        
        double porcNota1 = 0.40;
        double porcNota2 = 0.60;
        double nota1;
        double nota2;
        double notaFinal;
        
        

        System.out.println("Ingresa la nota del primer parcial: ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Ingresa la nota que deseas sacar en la materia: ");
        notaFinal = entrada.nextDouble();
        
        nota2 = (notaFinal - (nota1 * porcNota1)) / porcNota2;
        
        System.out.println("Para obtener una nota final de " + notaFinal + 
                " necesitas sacar: " + nota2 + " en el segundo parcial");

    }
    
}
