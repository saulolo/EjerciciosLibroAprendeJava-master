package Unit4_Condicionales;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio4_5_27 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Una pastelería nos ha pedido realizar un programa que haga 
        presupuestos de tartas. El programa preguntará primero de qué sabor 
        quiere el usuario la tarta: manzana, fresa o chocolate. La tarta de 
        manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta 
        de chocolate, el programa debe preguntar además si el chocolate es negro
        o blanco; la primera opción vale 14 euros y la segunda 15. Por último 
        se pregunta si se añade nata y si se personaliza con un nombre; la nata 
        suma 2.50 y la escritura del nombre 2.75.
        
        Ejemplo 1:
        Elija un sabor (manzana, fresa o chocolate): chocolate
        ¿Qué tipo de chocolate quiere? (negro o blanco): negro
        ¿Quiere nata? (si o no): si
        ¿Quiere ponerle un nombre? (si o no): no
        Tarta de chocolate negro: 14,00 €
        Con nata: 2,50 €
        Total: 16,50 €
        
        Ejemplo 2:
        Elija un sabor (manzana, fresa o chocolate): manzana
        ¿Quiere nata? (si o no): no
        ¿Quiere ponerle un nombre? (si o no): si
        Tarta de manzana: 18,00 €
        Con nombre: 2,75 €
        Total: 20,75 €
        
        Ejemplo 3:
        Elija un sabor (manzana, fresa o chocolate): fresa
        ¿Quiere nata? (si o no): si
        ¿Quiere ponerle un nombre? (si o no): si
        Tarta de fresa: 16,00 €
        Con nata: 2,50 €
        Con nombre: 2,75 €
        Total: 21,25 €*/
        
        System.out.println("PRESUPUESTOS DE TARTAS");
        System.out.println("----------------------");
        
        
        double costoTarta = 0;
        double costoChocolate = 0;
        double costoNata = 0;
        double costoNombre = 0;
        double totalTarta = 0;
        String sabor;
        String chocolate;
        String nata;
        String nombre;
        
        System.out.println("Elija un sabor (manzana, fresa o chocolate): ");
        sabor = input.next();
        
        
        switch (sabor) {
            case "manzana":
                costoTarta = 18;
                break;
            case "fresa":
                costoTarta = 16;
                break;
            case "chocolate":
                System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco): ");
                chocolate = input.next();
                if (chocolate.equals("negro")) {
                    costoChocolate = 14;
                    
                } else if (chocolate.equals("blanco")){
                    costoChocolate = 15;
                }
                break;    
            default:
                System.out.println("Opción no válida");
        }
        
        System.out.println("¿Quiere nata? (si o no): ");
        nata = input.next();
        
        switch (nata) {
            case "si":
                costoNata = 2.50;
                break;
            case "no":
                costoNata = 0;
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        System.out.println("¿Quiere ponerle un nombre? (si o no): ");
        nombre = input.next();
        
        switch (nombre) {
            case "si":
                costoNombre = 2.75;
                break;
            case "no":
                costoNombre = 0;
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        totalTarta = costoTarta + costoChocolate + costoNata + costoNombre;
        
        System.out.println("Tarta de " + sabor + ": " + costoTarta + " €");
        System.out.println("Con nata: " + costoNata + " €");
        System.out.println("Con nombre: " + costoNombre + " €");
        System.out.println("Total: " + totalTarta + " €");

    }
    
}
