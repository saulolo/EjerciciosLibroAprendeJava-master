package uni5_Bucles;

import javax.swing.*;

/* @author: Saulolo */
public class Ejercicio5_4_28 {

    public static void main(String[] args) {

        /* Escribe un programa que calcule el factorial de un número entero leido por teclado */

        System.out.println("CALCULO FACTORIAL");
        System.out.println("-----------------");

        String input = JOptionPane.showInputDialog("Ingrese un número: ");
        int numeroIngresado = Integer.parseInt(input);


        if (numeroIngresado >= 0) {
            int numFactorial = 1;
        for (int i = 1; i <= numeroIngresado; i++) {
            numFactorial *= i;
        }
            System.out.println("El factorial de: " + numeroIngresado + " es: " + numFactorial);
        } else {
            System.out.println("El número ingresado debe de ser mayor o igual a cero (0). ");
        }

    }

}
