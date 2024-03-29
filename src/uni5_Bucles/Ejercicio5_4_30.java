package uni5_Bucles;

import javax.swing.*;

/* @author: Saulolo */
public class Ejercicio5_4_30 {

    /* Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
    No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir como un
    número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
    introduce los datos correctamente y que el segundo día es posterior al primero.*/

    public static void main(String[] args) {
        System.out.println("CALCULADORA DE HORAS TRANSCURRIDAS");
        System.out.println("----------------------------------");

        String primerDiaInput = JOptionPane.showInputDialog("Ingrese el primer día de la semana (1-7 o nombre): ");
        int primerDia = obtenerNumeroDia(primerDiaInput);

        int hora1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora del primer día: "));

        String segundoDiaInput = JOptionPane.showInputDialog("Ingrese el segundo día de la semana (1-7 o nombre): ");
        int segundoDia = obtenerNumeroDia(segundoDiaInput);

        int hora2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora del segundo día: "));

        if (primerDia < 1 || primerDia > 7 || segundoDia < 1 || segundoDia > 7 || segundoDia <= primerDia) {
            System.out.println("Entrada inválida. Asegúrate de que los días estén en el rango correcto y el segundo día sea posterior al primero.");
        } else {
            int horasTranscurridas = (segundoDia - primerDia) * 24 + (hora2 - hora1);
            System.out.println("Horas transcurridas entre el día " + primerDiaInput + " y el día " + segundoDiaInput + ": " + horasTranscurridas + " horas.");
        }
    }

    public static int obtenerNumeroDia(String input) {
        input = input.toLowerCase();
        switch (input) {
            case "lunes":
                return 1;
            case "martes":
                return 2;
            case "miércoles":
                return 3;
            case "jueves":
                return 4;
            case "viernes":
                return 5;
            case "sábado":
                return 6;
            case "domingo":
                return 7;
            default:
                return Integer.parseInt(input);
        }
    }
}
