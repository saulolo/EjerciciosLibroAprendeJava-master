package Unit5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */
public class Ejercicio5_4_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Muestra por pantalla todos los números primos entre 2 y 100, ambos 
        incluidos.
         */
        System.out.println("NÚMEROS PRIMOS ENTRE 2 Y 100");
        System.out.println("----------------------------");

        boolean esPrimo = true;
        int numero = 0;

        for (int n = 2; n <= 100; n++) {

            //Comprobar si n es primo
            esPrimo = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }

            //Si n es primo se muestra por pantalla
            if (esPrimo) {
                System.out.println(n + " ");
            }
        }
        System.out.println();
    }

}
