package uni5_Bucles;

import javax.swing.*;

/* @author: Saulolo */
public class Ejercicio5_4_26 {

    public static void main(String[] args) {

        /*Realiza un programa que pida primero un número y a continuación un dígito.
        El programa nos debe de dar la posición (o posiciones) cotantando de izquierda a
        derecha que ocupa ese digito en el número introducido */

        System.out.println("POSICIÓN DE UN DÍGITO");
        System.out.println("---------------------");

        String input = JOptionPane.showInputDialog("Introduce un número: ");
        int numeroIntroducido = Integer.parseInt(input);

        String input2 = JOptionPane.showInputDialog("Introduce un digito: ");
        int digitoIntroducido = Integer.parseInt(input2);

        int posicion = 1;

        while (numeroIntroducido > 0) {
            int digitoActual = numeroIntroducido % 10;  //Obtengo el dígito actual
            if (digitoActual == digitoIntroducido) {
                System.out.println("El digito " + digitoIntroducido + " se encuentra en la posición: " + posicion);
            }
            numeroIntroducido /= 10; //Elimina el ultimo dígito
            posicion++;  //Incrementa la posición

        }

    }

}
