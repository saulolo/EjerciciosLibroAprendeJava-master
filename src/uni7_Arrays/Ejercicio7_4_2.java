package uni7_Arrays;

import javax.swing.*;

/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos según la tabla que se
 * muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores
 * de los elementos que no han sido inicializados?
 * @author Saulolo
 */
public class Ejercicio7_4_2 {

    public static void main(String[] args)  {

        String into = ("MOSTRANDO UN ARRAY DE CARACTERES");
        JOptionPane.showMessageDialog(null, into);

        String[] simbolo = new String[10];
        simbolo[0] = "a";
        simbolo[1] = "X";
        simbolo[4] = "@";
        simbolo[6] = "''";
        simbolo[7] = "+";
        simbolo[8] = "Q";

        for (String caracter : simbolo) {
            System.out.println(caracter);
        }

        /**
         * Por defecto, los elementos que no se inicializaron, se inicializan en null.
         */


    }
}

