package Unit5_Bucles;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio5_4_8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Muestra la tabla de multiplicar de un número introducido por teclado.*/
        
        System.out.println("TABLA DE MULTIPLICAR");
        System.out.println("--------------------");
        
        int numero;
        int multiplicacion;
        
        System.out.println("Ingresa el número para visulizar su tabla de "
                + "multiplicar");
        numero = input.nextInt();
        
        for (int factor = 1; factor <= 10; factor++) {
            multiplicacion = numero * factor;
            System.out.println(numero + " x " + factor + " = " + multiplicacion);
        }
    }
}
