package uni3_EntradaDeDatos;

import java.util.*;

public class Ejercicio3_4_9 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa que calcule el volumen de un cono según la 
        fórmula V = 1/3πr2h.*/
        
        Scanner entrada = new Scanner(System.in);
        
        double volumen;
        double radio;
        //double radioCuadrado = Math.pow(radio, 2);
        double altura;
        
        System.out.println("VOLÚMEN DE UN CONO");
        System.out.println("-----------------------");
        
        System.out.println("Ingresa el radio (r) del cono; ");
        radio = entrada.nextDouble();
        
        System.out.println("Ingresa la altura (h) del cono; ");
        altura = entrada.nextDouble();
        
        volumen =  (Math.PI * radio * radio * altura)/3;
        
        System.out.printf(" Volumen del cono = %2.2f ", volumen);
        System.out.print("cm cúbicos ");
        
    }
    
}
