package Uni6_NumerosAleatorios;

/* todo: @author: Saulolo */

/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. Muestra también
el máximo, el mínimo y la media de esos números.
*/

public class Ejercicio6_3_5 {

    public static void main(String[] args) {

        System.out.println("GENERANDO 50 NÚMEROS ALEATORIOS");
        System.out.println("-------------------------------");

        int maximo   = 100;
        int minimo   = 199;
        int suma = 0;
        int numeros;

        System.out.print("Números: ");
        for (int i = 0; i <50 ; i++) {
            numeros = (int)(Math.random() * 100) + 100;
            System.out.print(numeros + " ");
            suma += numeros; //agrega el número a la suma total

            if (numeros < minimo) {
                minimo = numeros;
            }

            if (numeros > maximo) {
                maximo = numeros;
            }

        }

        int promedio = suma / 50;

        System.out.println("\nEl número máximo es = " + maximo);
        System.out.println("El número mínimo es = " + minimo);
        System.out.println("El promedio es = " + promedio);
    }
}


























