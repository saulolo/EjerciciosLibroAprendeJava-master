package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que sea capaz de desplazar todos los dígitos de un número de derecha a izquierda una
posición. El dígito de más a la izquierda, pasaría a dar la vuelta y se colocaría a la derecha. Si el número tiene
un solo dígito, se queda igual.

Ejemplo 1:
Introduzca un número: 609831
El número resultado es 98316

Ejemplo 2:
Introduzca un número: 78201345
El número resultado es 82013457

Ejemplo 3:
Introduzca un número: 24
El número resultado es 42

Ejemplo 4:
Introduzca un número: 8
El número resultado es 8

*/

public class Ejercicio5_4_52 {

    public static void main(String[] args) {

        System.out.println("DESPLAZAR DIGITOS");
        System.out.println("-----------------");

        String inputNumero = JOptionPane.showInputDialog("Introduzca un número: ");
        int numero = Integer.parseInt(inputNumero);


        if (numero >= 10) {
            int ultimoDigito = numero % 10;

            numero /= 10;

            int longitud = 1;
            int temp = numero;

            while (temp > 0) {
                longitud *= 10;
                temp /= 10;
            }

            numero = ultimoDigito * longitud + numero;
        }

        System.out.println("El número resultado es " + numero);
    }

}
















