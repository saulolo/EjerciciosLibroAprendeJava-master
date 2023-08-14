package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_7 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Realiza un programa que calcule la media de tres notas.*/
        
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        System.out.println("CÁLCULO DE LA MEDIA");
        System.out.println("-----------------------");
        
        System.out.println("Ingresa la primera nota: ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Ingresa la segunda nota: ");
        nota2 = entrada.nextDouble();
        
        System.out.println("Ingresa la tercera nota: ");
        nota3 = entrada.nextDouble();
        
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("media = %1.2f\n", media);
        
    }
    
}
