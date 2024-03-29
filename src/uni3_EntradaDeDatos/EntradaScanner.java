package uni3_EntradaDeDatos;

import java.util.Scanner;

public class EntradaScanner {
    
    public static void main(String[] args) {
        
    //Para utilizar esta clase debo de importar la libreria java.util.scanner.

        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edad = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad + " años.");
        
        System.out.println("=================================================");
        
        
        /*Mediante del uso de la clase Scanner, se puede leer varios datos en 
        una misma línea separadolos por un espacio.*/
        
        System.out.println("Ingresa tu color y número favoritos: ");
        String color = entrada.next();
        int numFav = entrada.nextInt();
        
        System.out.println("Tu color favorito es " + color + " y tu número "
                + "favorito es " + numFav);
        
        System.out.println("=================================================");
        
        
        /*Calcula la media de tres números decimales. Para leer cada uno de los 
        números en la misma línea se utiliza s.nextDouble. y los separa con ,*/
        
        System.out.println("Ingresa los tres números: ");
        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();
        double num3 = entrada.nextDouble();
        
        double promedio = ((num1 + num2 + num3)/3);
        
        System.out.println("Los números ingresados son: " + num1 + " " + num2 + " " + num3);
        System.out.println("promedio = " + promedio);
        
    }
    
}
