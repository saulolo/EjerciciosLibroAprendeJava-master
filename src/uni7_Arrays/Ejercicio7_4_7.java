package uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla
 * separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación
 * cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente.
 * Los números que se han cambiado deben aparecer entrecomillados.
 * @author Saulolo
 */
public class Ejercicio7_4_7 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("CAMBIANDO LAS OCURRENCIAS DE LOS NÚMEROS");
        JOptionPane.showMessageDialog(null, into);


        int[] numeros = new int[100];
        int i;

        // Rellena el array con números aleatorios
        for (i = 0; i < 100; i++) {
            numeros[i] = (int)(Math.random() * 21);
        }

        System.out.print("Números generados: ");
        for (i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");

        }
        System.out.println(); // Nueva línea

        System.out.print("Introduzca un número de los que se han mostrado: ");
        int valor1 = input.nextInt();
        input.nextLine(); // Consumir el carácter de nueva línea

        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        int valor2 = input.nextInt();

        System.out.println("Números modificados: ");
        for (i = 0; i < 100; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
            }
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Nueva línea


    }

}
