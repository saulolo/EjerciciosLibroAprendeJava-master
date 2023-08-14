package Unit5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio5_4_10 {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        /*Escribe un programa que calcule la media de un conjunto de números 
        positivos introducidos por teclado. A priori, el programa no sabe 
        cuántos números se introducirán. El usuario indicará que ha terminado de 
        introducir los datos cuando meta un número negativo.*/
        
        System.out.println("PROMEDIO DE LOS NÚMEROS INTRODUCIDOS");
        System.out.println("------------------------------------");
        
        int numeroIntroducido;
        int contador = 0;
        int suma = 0;
        int promedio = 0;
        
        System.out.println("Por favor, vaya introduciendo númmeros y pulsando enter.");
        System.out.println("Para terminar, introduzca un número negativo.");
        numeroIntroducido = input.nextInt();
        
        while (numeroIntroducido >= 0) {
            suma = suma + numeroIntroducido;
            numeroIntroducido = input.nextInt();
            contador = contador + 1;;
            promedio = suma / contador;
        }
        System.out.println("Has introducido " + contador + " números" + " la"
                + " sumatoria de dichos números es: " + suma + " y su promedio es: "
                + promedio);
        
    }
}
