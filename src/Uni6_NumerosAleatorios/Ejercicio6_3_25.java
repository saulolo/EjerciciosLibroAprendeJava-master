package Uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Escribe un programa que muestre por pantalla 100 números enteros separados por un espacio. Los números deben
estar generados de forma aleatoria en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).

Ejemplo 1:
Introduzca la anchura de la tableta: 6
Introduzca la altura de la tableta: 4
******
*****
******
******

Ejemplo 2:
Introduzca la anchura de la tableta: 7
Introduzca la altura de la tableta: 3
*******
*******
 ******

Ejemplo 3:
Introduzca la anchura de la tableta: 5
Introduzca la altura de la tableta: 5
** **
*****
*****
*****
*****
*/


public class Ejercicio6_3_25 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("PINTANDO UNA TABLETA DE TURRÓN");
        JOptionPane.showMessageDialog(null, into);

        String inputAnchura = JOptionPane.showInputDialog("Introduzca la anchura de la tableta: ");
        Integer anchura = Integer.parseInt(inputAnchura);

        String inputAltura = JOptionPane.showInputDialog("Introduzca la altura de la tableta: ");
        Integer altura = Integer.parseInt(inputAltura);

        int posicionMordisco = (int) (Math.random() * (anchura * 2 + (altura - 2) * 2));

        int posicion = 0;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                boolean estaEnBorde = (i == 0) || (i == altura - 1) || (j == 0) || (j == anchura - 1);

                if ((posicion == posicionMordisco) && estaEnBorde) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

                if (estaEnBorde) {
                    posicion++;
                }
            }
            System.out.println();
        }


    }
    
}

