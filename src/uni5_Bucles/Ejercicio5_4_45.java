package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo. Las posiciones
se cuentan de izquierda a derecha empezando por el 1. Se recomienda usar long en lugar de int ya que el primero
admite números más largos. Suponemos que el usuario introduce correctamente los datos.

Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número: 3
Introduzca el nuevo dígito: 1
El número resultante es 401783

*/

public class Ejercicio5_4_45 {

    public static void main(String[] args) {

        System.out.println("CAMBIANDO DÍGITO");
        System.out.println("----------------");

        String inputNumero = JOptionPane.showInputDialog("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(inputNumero);

        String inputPosicion = JOptionPane.showInputDialog("Introduzca la posición dentro del número: ");
        int posicion = Integer.parseInt(inputPosicion);

        String inputDigito = JOptionPane.showInputDialog("Introduzca el nuevo dígito: ");
        int digito = Integer.parseInt(inputDigito);

        char[] digitos = String.valueOf(numero).toCharArray();

        if (posicion >= 1 && posicion <= digitos.length) {
            digitos[posicion - 1] = Character.forDigit(digito, 10);
        } else {
            System.out.println("Posición fuera de rango.");
            return;
        }

        String numeroModificado = new String(digitos);
        long resultado = Long.parseLong(numeroModificado);

        System.out.println("El número resultante es " + resultado);
    }

}














