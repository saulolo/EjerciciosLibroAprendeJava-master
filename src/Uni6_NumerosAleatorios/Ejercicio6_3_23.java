package Uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.

Ejemplo 1:
Q J 7 J As

Ejemplo 2:
K 8 J As 7
*/


public class Ejercicio6_3_23 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("TIARADA DE 5 DADOS");
        JOptionPane.showMessageDialog(null, into);

        int tirada;

        for (int i = 0; i < 6; i++) {
            tirada = (int) (Math.random() * 5);

            switch (tirada) {
                case 0:
                    System.out.print("As ");
                    break;
                case 1:
                    System.out.print("K ");
                    break;
                case 2:
                    System.out.print("Q ");
                    break;
                case 3:
                    System.out.print("J ");
                    break;
                case 4:
                System.out.print("7 ");
                    break;
                case 5:
                    System.out.print("8");
                    break;
                default:
            }
        }
    }
}
