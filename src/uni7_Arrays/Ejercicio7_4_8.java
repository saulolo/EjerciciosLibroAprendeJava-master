package uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año
 * y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras del
 * diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 * @author Saulolo
 */
public class Ejercicio7_4_8 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        String into = ("CALCULANDO LA TEMPERATURA MEDIA DE CADA MES");
        JOptionPane.showMessageDialog(null, into);

        String[] mes = {
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        int[] temperatura = new int[12];
        int i;
        int j;

        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";

        for (i = 0; i < 12; i++) {
            System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
            temperatura[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println();

        for (i = 0; i < 12; i++) {
            System.out.printf(azul + "%12s " + verde + "│", mes[i]);
            for (j = 0; j < temperatura[i]; j++) {
                System.out.print(morado + "▄");
            }
            System.out.println(naranja + " " + temperatura[i] + "ºC" + blanco);
        }
    }
}
