package Uni6_NumerosAleatorios;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma: suspenso,
suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número de suficientes,
el número de bienes, etc.
*/

public class Ejercicio6_3_11 {

    public static void main(String[] args) {

        String into = ("GENERANDO 20 NOTAS AL AZAR");
        JOptionPane.showMessageDialog(null, into);
        System.out.println("----------------------");

        int notas;
        String calificacion = "";
        int suspeso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;


        for (int i = 1; i <= 20; i++) {
            notas = (int)(Math.random() * 5) + 1;
            switch (notas) {
                case 1:
                    System.out.println("Suspenso");
                    suspeso = suspeso + 1;
                    break;
                case 2:
                    System.out.println("Suficiente");
                    suficiente++;
                    break;
                case 3:
                    System.out.println("Bien");
                    bien++;
                    break;
                case 4:
                    System.out.println("Notable");;
                    notable++;
                    break;
                case 5:
                    System.out.println("Sobresaliente");
                    sobresaliente++;
                    break;
                default:

            }
        }

        System.out.println("Número de notas en Suspenso: " + suspeso);
        System.out.println("Número de notas en Suficiente: " + suficiente);
        System.out.println("Número de notas en Bien: " + bien);
        System.out.println("Número de notas en Notable: " + notable);
        System.out.println("Número de notas en Sobresaliente: " + sobresaliente);
    }
}




























