package uni4_Condicionales;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio4_5_29 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Realiza un programa que calcule el precio de un desayuno. El programa 
        preguntará primero qué ha tomado el usuario de comer: palmera, donut o
        pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, 
        el programa debe preguntar además si era con aceite o con tortilla; el 
        primero vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la 
        bebida: zumo o café a 1’50 y 1’20 respectivamente.
        
        Ejemplo 1:
        ¿Qué ha tomado de comer? (palmera, donut o pitufo): palmera
        ¿Qué ha tomado de beber? (zumo o café): café
        Palmera: 1,40 €
        Café: 1,20 €
        Total desayuno: 2,60 €
        
        Ejemplo 2:
        ¿Qué ha tomado de comer? (palmera, donut o pitufo): pitufo
        ¿Con qué se ha tomado el pitufo? (aceite o tortilla): tortilla
        ¿Qué ha tomado de beber? (zumo o café): zumo
        Pitufo con tortilla: 1,60 €
        Zumo: 1,50 €
        Total desayuno: 3,10 €
        */
        
        System.out.println("PRECIO DEL DESAYUNO");
        System.out.println("-------------------");
        
        String comida = "";
        String acompaniante = "";
        String bebida = "";
        double costoComida = 0;
        double costoacompaniante = 0;
        double costoBebida = 0;
        double total = 0;
        
        System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        comida = input.next();
        
        switch (comida) {
            case "palmera":
                costoComida = 1.40;
                break;
            case "donut":
                costoComida = 1;
                break;
            case "pitufo":
                System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
                acompaniante = input.next();
                switch (acompaniante) {
                    case "aceite":
                        costoacompaniante = 1.20;
                        break;
                    case "tortilla":
                        costoacompaniante = 1.60;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
                
                break;
            default:
                System.out.println("Opción no válida");  
        }
        
        
        
        System.out.println("¿Qué ha tomado de beber? (zumo o café):");
        bebida = input.next();
        
        switch (bebida) {
            case "zumo":
                costoBebida = 1.50;
                break;
            case "cafe":
                costoBebida = 1.20;
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        System.out.println(acompaniante + ": " + costoacompaniante);
        System.out.println(bebida + ": " + costoBebida);
        
        total = costoComida + costoacompaniante + costoBebida;
        System.out.println("Total desayuono: " + total);
        
    
        
    }
    
}
