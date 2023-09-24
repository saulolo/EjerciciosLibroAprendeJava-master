package Uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

public class Ejercicio5_4_32 {

    /* Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos
    pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int
    donde sea necesario para admitir números largos.*/

    /*
        Ejemplo 1:
        Por favor, introduzca un número entero positivo: 94026782
        Dígitos pares: 4 0 2 6 8 2
        Suma de los dígitos pares: 22
        Ejemplo 2:
        Por favor, introduzca un número entero positivo: 31779
        Dígitos pares:
        Suma de los dígitos pares: 0
        Ejemplo 3:
        Por favor, introduzca un número entero positivo: 2404
        Dígitos pares: 2 4 0 4
        Suma de los dígitos pares: 10
     */

    public static void main(String[] args) {

        System.out.println("MOSTRANDO Y SUMANDO DÍGITOS PARES");
        System.out.println("---------------------------------");

        String inputNum = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        long numeroingresado = Long.parseLong(inputNum);

        long contador = 0;
        long suma = 0;


        if (numeroingresado >= 0) {
            while (numeroingresado > 0){
                long digito = numeroingresado % 10;
                if (digito % 2 == 0) {
                    suma = suma + digito;
                    contador = contador + 1;
                }
                numeroingresado = numeroingresado / 10;
            }
            System.out.println();
        } else {
            System.out.println("El número " + numeroingresado + " que ingresaste es negativo");
        }

        System.out.println("Suma de digitos pares: " + suma);
        System.out.println("Cantidad de digitos pares: " + contador);

    }

}
