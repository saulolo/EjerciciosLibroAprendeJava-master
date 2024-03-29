package uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */
public class Ejercicio5_4_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Realiza un programa que pinte una pirámide por pantalla. La altura se 
        debe pedir por teclado. El carácter con el que se pinta la pirámide 
        también se debe pedir por teclado.*/
        
        System.out.println("PINTANDO PIRÁMIDE");
        System.out.println("-----------------");

        int alturaIntroducida;
        String relleno;
        
        System.out.println("Ingresa la altura de la pirámide: ");
        alturaIntroducida = input.nextInt();
        
        System.out.println("Ingrese el caractér a emplear: ");
        relleno = input.next();
        

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida - 1;

        while (planta <= alturaIntroducida) {

            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
                System.out.print(relleno);
            }

            System.out.println();

            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}
