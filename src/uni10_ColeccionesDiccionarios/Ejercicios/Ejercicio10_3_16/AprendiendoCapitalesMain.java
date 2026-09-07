package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Realiza un programa que sepa decir la <b>capital</b> de un país (en caso de conocer la respuesta) y que, además, sea
 * capaz de aprender nuevas capitales. En principio, el programa solo conoce las capitales de <b>España, Portugal y Francia</b>.
 * Estos datos deberán estar almacenados en un diccionario. Los datos sobre capitales que vaya aprendiendo el programa
 * se deben almacenar en el mismo diccionario. El usuario sale del programa escribiendo la palabra “salir”.
 * @author Saulolo
 */
public class AprendiendoCapitalesMain {


    public static void main(String[] args) {


        System.out.println("=== APRENDIENDO CAPITALES ===");

        Scanner scanner = new Scanner(System.in);
        String pais;
        String capital;


        HashMap<String, String> capitales = new HashMap<>(Map.of(
                "España", "Madrid",
                "Portugal", "Lisboa",
                "Francia", "Paris"
        ));

        while (true) {
            System.out.print("\nEscribe el nombre de un país y te diré su capital: ");
            pais = scanner.nextLine();
            ;

            if (pais.equalsIgnoreCase("salir")) {
                break;
            }

            if (capitales.containsKey(pais)) {
                System.out.print("La capital de " + pais + " es: " + capitales.get(pais));
            } else {
                System.out.println("{{{(>_<)}}} No conozco la respuesta, cual es la capiptal de " + pais + "?");
                capital = scanner.nextLine();
                capitales.put(pais, capital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }

        System.out.println("Hasta pronto!!!");
        scanner.close();

    }
}
