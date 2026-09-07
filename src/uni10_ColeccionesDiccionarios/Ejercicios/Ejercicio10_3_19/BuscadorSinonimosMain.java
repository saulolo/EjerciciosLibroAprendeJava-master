package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_19;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se proporciona a continuación.
 * El programa preguntará una palabra y dará una lista de sinónimos (palabras que tienen el mismo significado).
 * Por ejemplo, si se introduce la palabra “caliente”, el programa dará como resultado: ardiente, candente, abrasador.
 * ¿Cómo sabe el programa cuáles son los sinónimos de “caliente”? Muy fácil, en el diccionario debe existir la entrada
 * (“caliente”, “hot”), por tanto solo tendrá que buscar las palabras en español que también signifiquen “hot”; esta
 * información estará en las entradas (“ardiente”, “hot”) y (“abrasador”, “hot”).
 * Cuando una palabra existe en el diccionario pero no tiene sinónimos, debe mostrar el mensaje “No conozco sinónimos
 * de esa palabra”.
 * Si una palabra no está en el diccionario se mostrará el mensaje “No conozco esa palabra”.
 * El usuario sale del programa escribiendo la palabra “salir”.
 * @author Saulolo
 */
public class BuscadorSinonimosMain {

    public static void main(String[] args) {

        System.out.println("=== BUSCADOR DE SINÓNIMOS ===");
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
                    System.out.println("No conozco sinónimos de esa palabra");
                }

            } else {
                System.out.println("No conozco esa palabra");
            }
        }

        System.out.println("¡Hasta pronto!");
        scanner.close();
    }
}
