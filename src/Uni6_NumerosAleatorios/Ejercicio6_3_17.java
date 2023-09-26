package Uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Realiza un programa que pinte por pantalla una pecera con un pececito dentro. Se debe pedir al usuario el
ancho y el alto de la pecera, que como mínimo serán de 4 unidades. No hay que comprobar que los datos se
introducen correctamente; podemos suponer que el usuario los introduce bien. Dentro de la pecera hay que colocar
de forma aleatoria un pececito, que puede estar situado en cualquiera de las posiciones que quedan en el hueco que
forma el rectángulo.

Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
*           *
*        &  *
* * * * * * *

*/

public class Ejercicio6_3_17 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("PINTANDO LA PECERA CON UN PEZ");
        JOptionPane.showMessageDialog(null, into);
        System.out.println("--------------------------");

        String inputAltura = JOptionPane.showInputDialog("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        Integer altura = Integer.parseInt(inputAltura);

        String inputAncho = JOptionPane.showInputDialog("Ahora introduzca la anchura (como mínimo 4): ");
        Integer ancho = Integer.parseInt(inputAncho);

        int posicion = 0;

        int posicionPez = (int)(Math.random()*(altura - 2)*(ancho - 2));

        // Pinta la parte superior /////////////////////////////////////////////////
        for(int i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Pinta la parte central //////////////////////////////////////////////////
        for(int i = 2; i < altura; i++) {
            System.out.print("*"); // parte izquierda de la pecera
            for(int j = 2; j < ancho; j++) {
                if (posicion == posicionPez) {
                    System.out.print("\uD83D\uDC1F");
                } else {
                    System.out.print(" ");
                }
                posicion++;
            } // for j
            System.out.println("*"); // parte derecha de la pecera
        } // for i

        // Pinta la parte inferior /////////////////////////////////////////////////
        for(int i = 0; i < ancho; i++) {
            System.out.print("*");
        }

    }
}

