package Unit5_Bucles;

import java.lang.Math;
import java.util.Scanner;

/* @author: Saulolo */
public class Ejercicio5_4_14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /*Escribe un programa que pida una base y un exponente (entero positivo)
        y que calcule la potencia.*/
        System.out.println("CÁLCULO DE POTENCIA");
        System.out.println("-------------------");

        double base = 0;
        double exponente = 0;
        double potencia = 0;

        System.out.println("Ingresa un número base: ");
        base = entrada.nextInt();

        System.out.println("Ingresa un número de exponente: ");
        exponente = entrada.nextInt();

        if (exponente >= 0) {
            potencia = Math.pow(base, exponente);
            System.out.println("Potencia de " + base + " ^ " + exponente + " = " + potencia);
        } else {
            System.out.println("El número ingresado es negativo, por lo tanto"
                    + " no es posible efectuar la operación.");
        }

        System.out.println("================================================");
        System.out.println("SOLUCIÓN LIBRO");
        

        if (exponente == 0) {
            potencia = 1;
        }

        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        }

        if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                potencia *= base;
            }

            potencia = 1 / potencia;
        }

        System.out.println(base + "^" + exponente + " = " + potencia);

    }
}
