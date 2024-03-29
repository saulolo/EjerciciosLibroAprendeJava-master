package uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Crea un array tipo String de 20 elementos y mostrar por pantalla el elemento con mayor letras.
 * @author Saulolo
 */
public class EjercicioExtra_2 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("MOSTRANDO UN ARRAY CON MAYOR NÚMERO DE LETRAS");
        JOptionPane.showMessageDialog(null, into);

        String palabraMasLarga = "";
        int longitudMaxima = 0;
        int posición = 0;
        int nElementos;
        String[] arrayLetras;

        System.out.print("Ingresa el tamaño del  Array: ");
        nElementos = input.nextInt();

        //Inicializo el arreglo con el tamaño ingresado por el usuario.
        arrayLetras = new String[nElementos];


        //Llenado del array
        for (int i = 0; i < arrayLetras.length; i++) {
            System.out.print("Ingresa la palabra en la posición " + i + ": ");
            arrayLetras[i] = input.next();
        }

        //Imprimo el array
        for (int i = 0; i <arrayLetras.length ; i++) {
            String palabraActual = arrayLetras[i];
            int longitudActual = palabraActual.length();

            if (longitudActual >= longitudMaxima ) {
                palabraMasLarga = palabraActual;
                longitudMaxima = longitudActual;
                posición = i;
            }
        }
        System.out.println("La palabra mas larga del array ingresado es: " + palabraMasLarga +
                " y se encuentra en la posición: " + posición);

        input.close();
    }


}


