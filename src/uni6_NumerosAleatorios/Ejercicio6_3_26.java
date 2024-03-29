package uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Realiza un programa que pinte una tableta de turrón con un bocado realizado de forma aleatoria. El ancho y el
alto de la tableta se pide por teclado. El bocado se da alrededor del turrón, obviamente no se puede dar un
bocado por en medio de la tableta.
*/


public class Ejercicio6_3_26 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("NÚMEROS ALEATORIOS EXCLUYENDO PRIMOS Y MULTIPLOS DE 5");
        JOptionPane.showMessageDialog(null, into);

        for (int i = 0; i < 100; i++) {
            int numero = (int)(Math.random() * 191) + 10;

            // Comprueba si el número es primo
            boolean esPrimo = true;
            for (int j = 2; j < numero; j++) {
                if ((numero % j) == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.print("#" + numero + "#  ");
            } else if ((numero % 5) == 0) {// múltiplo de 5
                System.out.print("[" + numero + "]  ");
            } else {
                System.out.print(numero + "  ");
            }
        } // for



    }
    
}

