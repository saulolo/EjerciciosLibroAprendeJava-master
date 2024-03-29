package uni6_NumerosAleatorios;

/* todo: @author: Saulolo */

/* Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar
números hasta que no saque el 24. El programa deberá decir al final cuántos números se han generado.
*/

import javax.swing.*;

public class Ejercicio6_3_9 {

    public static void main(String[] args) {

        String into = ("GENERANDO NÚMEROS ALEATORIOS PARES");
        JOptionPane.showMessageDialog(null, into);
        System.out.println("----------------------------------");

        int n = 0;
        int contador = 0;

        while (n != 24) {
             n = (int)(Math.random() * 51) * 2;
            JOptionPane.showMessageDialog(null,"Número generado: " + n + " ");
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Se han generado " + contador + " números.");

    }
}



























