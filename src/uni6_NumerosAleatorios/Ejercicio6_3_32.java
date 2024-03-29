package uni6_NumerosAleatorios;

import javax.swing.*;
import java.util.Scanner;


/* todo: @author: Saulolo */

/* Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el carácter “|”. La anchura del
sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres en medio, en total 6 caracteres
(incluyendo espacios). A cada metro, el sendero puede continuar recto, girar un carácter a la izquierda o girar
un carácter a la derecha, por supuesto de forma aleatoria. Por cada metro de sendero - representado por una línea -
puede que haya un obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo es aleatoria
dentro de la línea. En caso de existir un obstáculo en un metro de sendero (en una línea), puede ser una planta
(carácter *) o una piedra (carácter O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.

Ejemplo 1:
Introduzca la longitud del sendero en metros: 7
| * |
 | O|
 | |
| * |
 |* |
  | O |
   | |

*/

public class Ejercicio6_3_32 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("PINTANDO UN SENDERO ALEATORIO");
        JOptionPane.showMessageDialog(null, into);

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la longitud del sendero en metros: ");
        int longitudSendero = Integer.parseInt(s.nextLine());

        int espaciosPorDelante = 6;

        for (int i = 0; i < longitudSendero; i++) {
            // Espacios por delante
            for (int j = 0; j < espaciosPorDelante; j++) {
                System.out.print(' ');
            }

            // Borde izquierdo del sendero
            System.out.print('|');

            // Parte interior del sendero
            int posicionObstaculo = -1;
            char obstaculo = '*'; // planta por defecto

            if ((int) (Math.random() * 2) == 0) { // hay obstáculo
                posicionObstaculo = (int) (Math.random() * 4);
                if ((int) (Math.random() * 2) == 0) { // piedra
                    obstaculo = 'O';
                }
            }

            for (int j = 0; j < 4; j++) {
                System.out.print(j == posicionObstaculo ? obstaculo : ' ');
            }

            // Borde derecho del sendero
            System.out.println('|');

            espaciosPorDelante += (int) (Math.random() * 3) - 1;
        }
    }
}

