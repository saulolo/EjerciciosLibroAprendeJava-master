package uni6_NumerosAleatorios;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el que se pinta
cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una
longitud aleatoria entre 1 y 40 caracteres.
*/

public class Ejercicio6_3_10 {

    public static void main(String[] args) {

        String into = ("PINTANDO LINEAS CON CARACTERES ALEATORIOS");
        JOptionPane.showMessageDialog(null, into);
        System.out.println("-------------------------------------");

        String caracter = "";
        int cantidad;
        int r;

        for (int i = 1; i <= 10; i++) {
            cantidad = (int)(Math.random() * 40) + 1;
            r = (int)(Math.random() * 6);
            switch (r) {
                case 0:
                    caracter = ("*");
                    break;
                case 1:
                    caracter = ("-");
                    break;
                case 2:
                    caracter = ("=");
                    break;
                case 3:
                    caracter = (".");
                    break;
                case 4:
                    caracter = ("|");
                    break;
                case 5:
                    caracter = ("@");
                    break;
                default:
            }

            //Pinta la linea
            for (int j = 1; j <= cantidad; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}



























