package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_20;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Amplía el programa anterior de tal forma que sea capaz de aprender palabras y sinónimos.
 * Cuando una palabra no tiene sinónimos, es decir, cuando aparece la palabra en español con su traducción y esa
 * traducción no la tiene ninguna otra palabra española, se le preguntará al usuario si quiere añadir uno (un sinónimo) y,
 * en caso afirmativo, se pedirá la palabra y se añadirá al diccionario. Se puede dar la circunstancia de que el usuario
 * introduzca una palabra en español que no está en el diccionario; en tal caso, se mostrará el consiguiente mensaje y se
 * dará la posibilidad al usuario de añadir la entrada correspondiente en el diccionario pidiendo, claro está, la palabra en inglés.
 * @author Saulolo
 */
public class BuscadorSinonimosMejoradoMain {

    public static void main(String[] args) {

        System.out.println("=== BUSCADOR DE SINÓNIMOS MEJORADO ==’=");

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        while (true) {
            System.out.print("\nIntroduzca una palabra y le daré los sinónimos: ");
            String palabra = scanner.nextLine().trim().toLowerCase();

            if (palabra.equalsIgnoreCase("salir")) {
                break;
            }

            if (diccionario.containsKey(palabra)) {
                String inglesBuscado = diccionario.get(palabra);

                String sinonimosEncontrados = "";
                int contadorSinonimos = 0;

                for (String palabraEspañol : diccionario.keySet()) {
                    if (diccionario.get(palabraEspañol).equals(inglesBuscado) && !palabraEspañol.equalsIgnoreCase(palabra)) {

                        if (contadorSinonimos > 0) {
                            sinonimosEncontrados += ", ";
                        }

                        sinonimosEncontrados += palabraEspañol;
                        contadorSinonimos++;
                    }
                }

                if (contadorSinonimos > 0) {
                    System.out.println("Sinónimos de " + palabra + ": " + sinonimosEncontrados);
                } else {
                    System.out.println("No conozco sinónimos de esa palabra. Quieres añadir alguno? (s/n): ");
                    String respuesta = scanner.nextLine().trim().toLowerCase();
                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.println("Introduzca un sinonimo de la palabra: ");
                        String nuevaPalabraEspañol = scanner.nextLine().trim().toLowerCase();
                        diccionario.put(nuevaPalabraEspañol, inglesBuscado);
                        System.out.println("Gracias por enseñarme nuevos sinónimos.");
                    }
                }

            } else {
                System.out.println("No conozco esa palabra, quieres añádirla al diccionario? (s/n): ");
                String respuesta = scanner.nextLine().trim().toLowerCase();
                if (respuesta.equalsIgnoreCase("s")) {
                    System.out.println("Introduzca la traduccíón de: " + palabra + " en ingles: ");
                    String traduccionIngles  = scanner.nextLine().trim().toLowerCase();
                    diccionario.put(palabra, traduccionIngles );
                    System.out.println("Gracias por enseñarme una nueva palabra.");
                }

            }
        }

        System.out.println("¡Hasta pronto!");
        scanner.close();

    }
}
