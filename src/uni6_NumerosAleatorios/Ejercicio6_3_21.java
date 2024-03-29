package uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Realiza un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire. Las monedas
disponibles son de 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros.
Las dos posiciones posibles son cara y cruz.

Ejemplo:
2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara

*/

public class Ejercicio6_3_21 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("LANZANDO LAS MONEDAS");
        JOptionPane.showMessageDialog(null, into);

        String monedas = "";
        String posicion = "";

        for (int i = 0; i < 5; i++) {

            switch ((int) (Math.random() * 8)) {
                case 0:
                    System.out.print("1 céntimo");
                    break;
                case 1:
                    System.out.print("2 céntimos");
                    break;
                case 2:
                    System.out.print("5 céntimos");
                    break;
                case 3:
                    System.out.print("10 céntimos");
                    break;
                case 4:
                    System.out.print("20 céntimos");
                    break;
                case 5:
                    System.out.print("50 céntimos");
                    break;
                case 6:
                    System.out.print("1 euro ");
                    break;
                case 7:
                    System.out.print("2 euros");
                    break;
                default:
            }
            switch((int)(Math.random() * 2)) {
                case 0:
                    posicion = "cara";
                    break;
                case 1:
                    posicion = "cruz";
                    break;
                default:
            }
            System.out.println(monedas + " - " + posicion);
        }
    }
}
