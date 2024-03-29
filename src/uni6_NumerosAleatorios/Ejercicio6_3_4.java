package uni6_NumerosAleatorios;

/* todo: @author: Saulolo */

/* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
*/

public class Ejercicio6_3_4 {

    public static void main(String[] args) {

        System.out.println("GENERANDO 20 NÚMEROS ALEATORIOS");
        System.out.println("-------------------------------");

        System.out.print("Números: ");
        for (int i = 0; i < 20; i++) {
            int numeros = (int) (Math.random() * 11); //Asi incluye el 10
            System.out.print( numeros + " ");
        }
    }
}


























