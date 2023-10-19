package Uni7_Arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Implementa un programa que calcule la denominación ordinal de los reyes de una secuencia
 * histórica. El programa solicitará la cantidad de reyes que se van a introducir, y a continuación
 * recibirá los nombres de los reyes. Presentará por pantalla dichos nombres, pero colocándoles el
 * ordinal correspondiente. Así, por ejemplo, si hay dos Felipes en los nombres de los reyes, el
 * primero debería aparecer como Felipe 1º y el segundo como Felipe 2º.
 *
 * Ejemplo 1
 * Introduzca el número total de nombres de reyes: 7
 * Vaya introduciendo los nombres de los reyes y pulsando INTRO.
 * Felipe
 * Carlos
 * Carlos
 * Fernando
 * Carlos
 * Carlos
 * Felipe
 *
 * Los reyes introducidos son:
 * Felipe 1º
 * Carlos 1º
 * Carlos 2º
 * Fernando 1º
 * Carlos 3º
 * Carlos 4º
 * Felipe 2º
 *
 * Ejemplo 2:
 * Introduzca el número total de nombres de reyes: 9
 * Vaya introduciendo los nombres de los reyes y pulsando INTRO.
 * Luis
 * Fernando
 * Fernando
 * Carlos
 * Amadeo
 * Alfonso
 * Carlos
 * Alfonso
 * Alfonso
 *
 * Los reyes introducidos son:
 * Luis 1º
 * Fernando 1º
 * Fernando 2º
 * Carlos 1º
 * Amadeo 1º
 * Alfonso 1º
 * Carlos 2º
 * Alfonso 2º
 * Alfonso 3º
 * @author Saulolo
 */
public class Ejercicio7_4_20 {

    public static void main(String[] args)  {

        String into = ("DENOMINACIÓN ORDINAL DE LOS REYES");
        JOptionPane.showMessageDialog(null, into);

        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int n = Integer.parseInt(s.nextLine());

        String[] reyes = new String[n];

        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");

        for (int i = 0; i < n; i++) {
            reyes[i] = s.nextLine();
        }

        for (int i = 0; i < n; i++) {
            int orden = 1;

            for (int j = 0; j < i; j++) {
                if (reyes[i].equals(reyes[j])) {
                    orden++;
                }
            }
            System.out.println(reyes[i] + " " + orden + "º");
        }
    }


    
}

