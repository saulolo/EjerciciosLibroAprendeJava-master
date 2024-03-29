package uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad será indicada
por el usuario. La cuba se llenará con una cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima
que pueda admitir. El ancho de la cuba no varía.

Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
* *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.

*/

public class Ejercicio6_3_20 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("LLENANDO UNA CUBA DE AGUA");
        JOptionPane.showMessageDialog(null, into);
        System.out.println("----------------------");

        String inputCapacidad = JOptionPane.showInputDialog("Por favor, indique la capacidad de la cuba en litros: ");
        Integer capacidad = Integer.parseInt(inputCapacidad);

        System.out.println();

        // Rellena la cuba con unos litros aleatorios
        // teniendo en cuenta no pasarse de la capacidad.
        int litros = (int)(Math.random() * (capacidad + 1));

        for (int i = 0; i < capacidad; i++) {
            if (i < (capacidad - litros)) {
                System.out.println("#    #");
            } else {
                System.out.println("#====#");
            }
        }

        System.out.println("######"); // fondo de la cuba
        System.out.print("La cuba tiene una capacidad de " + capacidad);
        System.out.print(" litros y contiene " + litros + " litros de agua.");

    }
}
