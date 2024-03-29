package uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Cargar un arreglo de n elementos, imprimir el menor y un mensaje si se repite dentro del arreglo.
 * @author Saulolo
 */
public class EjercicioExtra_3 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("MOSTRANDO EL MENOR DE LOS NÚMEROS");
        JOptionPane.showMessageDialog(null, into);

        int[] numeros;
        int tamanioArreglo;
        int menor;

        System.out.print("Introduce el tamaño del arreglo: ");
        tamanioArreglo = input.nextInt();

        numeros = new int[tamanioArreglo];

        //Llenado del array
        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;
            int numero;

            do {
                repetido = false; //Reiniciamos la bandera en cada iteración.
                System.out.print("Introduce el número en la posición " + i + ": ");
                numero = input.nextInt();
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numero) {
                        repetido = true;
                        System.out.println("El número ya se ha repetido, introduce otro número.");
                        break; //Salimos del bucle si encontramos una repetición.
                    }
                }

            } while (repetido); //Repetimos hasta que el número no se repita.
            numeros[i] = numero; //Agregamos el número al arreglo.
        }

        //Imprimiendo el menor número.
        menor = numeros[0]; //Inicializo con el primero numero del arreglo que esta en la posición 0
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El menor número es: " + menor);

        input.close();
    }

}


