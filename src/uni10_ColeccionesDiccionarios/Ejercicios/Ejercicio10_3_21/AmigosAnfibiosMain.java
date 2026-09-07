package uni10_ColeccionesDiccionarios.Ejercicios.Ejercicio10_3_21;

import java.util.HashMap;
import java.util.Scanner;

/**
 * La asociación “Amigos de los anfibios” nos ha encargado una aplicación educativa sobre estos animalitos.
 * Crea un programa que pida al usuario el tipo de anfibio y que, a continuación, nos muestre su hábitat y su alimentación.
 * Si el tipo de anfibio introducido no existe, se debe mostrar el mensaje “Ese tipo de anfibio no existe”.
 * @author Saulolo
 */
public class AmigosAnfibiosMain {

    public static void main(String[] args) {

        System.out.println("=== AMIGOS DE LOS ANFIBIOS ===");

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> habitats = new HashMap<>();
        habitats.put("rana", "En los trópicos y  cerca de las zonas húmedas y acuáticas");
        habitats.put("salamandra", "Ecosistemas húmedos");
        habitats.put("sapo", "En cualquier Sitio salvo el desierto y la Antártida");
        habitats.put("tritón", "América y África");

        HashMap<String, String> alimentacion = new HashMap<>();
        alimentacion.put("rana", "Larvas e insectos");
        alimentacion.put("salamandra", "Pequenos crustáceos e insectos");
        alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores");
        alimentacion.put("tritón", "Insectos");

        System.out.print("Introduzca el tipo de Anfibio: ");
        String anfibio = scanner.nextLine().trim().toLowerCase();

        if (habitats.containsKey(anfibio)) {
            System.out.println("Habitat: " + habitats.get(anfibio));
            System.out.println("Alimentación: " + alimentacion.get(anfibio));
        } else {
            System.out.println("Ese tipo de anfibio no existe.");
        }
        scanner.close();
    }
}
