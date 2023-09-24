package Uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_11 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Escribe un programa que dada una hora determinada (horas y minutos), 
        calcule los segundos que faltan para llegar a la medianoche.*/
        
        int hora;
        int minutos;
        int diamin;
        int diahor;
        int horaJornada;
        int minutoJornada;
        int segundosMedianoche;
        int totalEnSegudos;
        
        System.out.println("SEGUNDOS FALTATES PARA LA MEDIANOCHE");
        System.out.println("-----------------------");
        
        System.out.println("Ingresa la hora: ");
        hora = entrada.nextInt();
        
        System.out.println("Ingresa los minutos: ");
        minutos = entrada.nextInt();
        
        
        horaJornada = 24 - hora;
        minutoJornada = 60 - minutos;
        
        
        diamin = horaJornada * 3600; 
        diahor = minutoJornada * 60;
        
        totalEnSegudos = diamin + diahor;
        
        segundosMedianoche = 86400 - totalEnSegudos;
        
        
        System.out.println("El total de segundos faltantes para la medianoche son: " + segundosMedianoche + " Segundos");
        
        
    }
    
}
