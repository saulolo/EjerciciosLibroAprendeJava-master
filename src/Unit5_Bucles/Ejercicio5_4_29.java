package Unit5_Bucles;

import javax.swing.*;

/* @author: Saulolo */
public class Ejercicio5_4_29 {

    public static void main(String[] args) {

        /* Escribe un programa que muestre por pantalla todos los números enteros positivos menores
        a uno leido por teclado que no sean divisibles entre otro tambien leido de igual forma.*/

        System.out.println("NÚMEROS POSITIVOS MENORES A OTRO NÚMERO");
        System.out.println("---------------------------------------");

        String input = JOptionPane.showInputDialog("Ingrese el primer número: ");
        int primerNumero = Integer.parseInt(input);

        String input2 = JOptionPane.showInputDialog("Ingresa el segundo número: ");
        int segundoNumero = Integer.parseInt(input2);


        if (primerNumero > 0 && segundoNumero > 0){

            if (primerNumero > segundoNumero) {
                for (int i = 1; i < primerNumero; i++) {
                    if (i % segundoNumero != 0) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("EL primer número debe de ser mayor que el segundo.");
            }
        } else {
            System.out.println("Los números ingresados deben de ser enteros positivos.");
        }

    }

}
