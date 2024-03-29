package uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio5_4_7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Realiza el control de acceso a una caja fuerte. La combinación será un
        número de 4 cifras. El programa nos pedirá la combinación para abrirla. 
        Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la 
        combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto 
        satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja 
        fuerte.*/
        
        System.out.println("CONTROL ACCESO CAJA FUERTE");
        System.out.println("--------------------------");
        
        int clave = 1313;
        int numero;
        
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa la clave de la caja fuerte: ");
            numero = input.nextInt();
            if (numero == clave) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } 
            
            else {
                System.out.println("Lo siento, esa no es la combinación.");
            }

        }
        
        System.out.println("==========================");
        System.out.println("SOLUCIÓN LIBRO");
        
        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;
        
        do {    
            System.out.println("Ingresa la clave de la caja fuerte: ");
            numeroIntroducido = input.nextInt();
            
            if (numeroIntroducido == 1313) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta.");
            }
            intentos--;
            
        } while ((intentos > 0) && (!acertado));
        
        if(acertado){
            System.out.println("Ha abierto la caja fuerte.");
        }
        else{
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
    }
}
