package Uni5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */
public class Ejercicio5_4_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Igual que el ejercicio anterior pero esta vez se debe pintar una 
        pirámide hueca.*/
        
        System.out.println("PINTANDO PIRÁMIDE HUECA");
        System.out.println("-----------------------");

        int alturaIntroducida;
        String relleno;

        System.out.println("Ingresa la altura de la pirámide: ");
        alturaIntroducida = input.nextInt();

        System.out.println("Ingrese el caractér a emplear: ");
        relleno = input.next();

        int altura = 1;
        int i = 0;
        int espaciosPorDelante = alturaIntroducida - 1;
        int espaciosInternos = 0;

        while (altura < alturaIntroducida) {

            // inserta espacios delante
            for (i = 1; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            System.out.print(relleno);
            for (i = 1; i < espaciosInternos; i++) {
                System.out.print(" ");
            }

            if (altura > 1) {
                System.out.print(relleno);
            }

            System.out.println();
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } // while ////////////////////////////

        // base de la pirámide
        for (i = 1; i < altura * 2; i++) {
            System.out.print(relleno);
        }
    }
}
