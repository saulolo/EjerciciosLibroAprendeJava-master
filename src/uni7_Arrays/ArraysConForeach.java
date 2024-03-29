package uni7_Arrays;

import java.util.Scanner;

/**
 * Recorre un array con un for al estilo foreach.
 *
 * @author Saul Echeverri
 */
public class ArraysConForeach {

    public static void main(String[] args) throws InterruptedException { // Se añade esta línea para poder usar sleep

                                           /*- DEFINICIÓN - */
        /* Para recorrer un array de un modo más práctico y sencillo, sin que tengamos que preocuparnos de los
        límites, podemos utilizar el bucle for con el formato foreach. De esta forma indicamos simplemente el
        nombre del array que queremos recorrer y en qué variable se va a ir colocando cada elemento con cada
        iteración del bucle. No hay que especificar con qué índice comienza y termina el bucle, de eso se encarga
        Java.

         */

        System.out.println("EJEMPLO 1: USO DE ARRAY CON FOREACH");
        System.out.println("-----------------------------------");

        Scanner input = new Scanner(System.in);

        double[] nota = new double[4];

        System.out.println("Para calcular la nota media, necesito saber la nota de cada uno de tus exámenes.");

        for (int i = 0; i < 4; i++) {
            System.out.println("Nota del exámen No " + (i + 1) + ": ");
            nota[i] = Double.parseDouble(input.nextLine());
        }
        System.out.println("Las notas son: ");

        double suma = 0;

        for (double n : nota) {  // for al estilo foreach
            System.out.println(n + " ");
            suma += n;
        }
        System.out.println("\nLa media es " + suma / 4);

        /* Fíjate en el segundo for; en este caso no se utiliza ningún índice; simplemente decimos “ve sacando
        uno a uno los elementos del array nota y deposita cada uno de esos elementos en la variable n que es de
        tipo double”.
        */

    }
}










