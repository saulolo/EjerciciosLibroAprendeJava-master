package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_8 {
    
    public static void main(String[] args) {
        
        /*Amplía el programa anterior para que diga la nota del boletín 
        (insuficiente, suficiente, bien, notable o sobresaliente).*/
        
        System.out.println("CÁLCULO DE LA MEDIA CON DESCRIPTORES");
        System.out.println("-----------------------");
        
        
        Scanner entrada = new Scanner(System.in);
        
        /*Realiza un programa que calcule la media de tres notas.*/
        
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        
        System.out.println("Ingresa la primera nota: ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Ingresa la segunda nota: ");
        nota2 = entrada.nextDouble();
        
        System.out.println("Ingresa la tercera nota: ");
        nota3 = entrada.nextDouble();
        
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("media = %1.2f\n", media);
        
        if (media < 2.5) {
            System.out.println("Insuficiente");
        }
        if (media >= 2.5 && media < 3) {
            System.out.println("Suficiente");
        }
        if (media >= 3 && media < 4) {
            System.out.println("Bien");
        }
        if (media >= 4 && media <= 4.9) {
            System.out.println("Notable");
        }
        if (media == 5) {
            System.out.println("Sobresaliente");
        }
        
    }
    
}
