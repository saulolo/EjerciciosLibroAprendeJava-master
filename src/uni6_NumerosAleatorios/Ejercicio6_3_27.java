package uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su jugada y luego el ordenador
genera al azar una de las opciones. Si el usuario introduce una opción incorrecta, el programa deberá mostrar
un mensaje de error.

Ejemplo 1:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: papel
Empate

Ejemplo 2:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: tijera
Gana el ordenador

Ejemplo 3:
Turno del jugador (introduzca piedra, papel o tijera): piedra
Turno del ordenador: tijera
Gana el jugador
*/


public class Ejercicio6_3_27 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("PIEDRA, PAPEL O TIJERA");
        JOptionPane.showMessageDialog(null, into);

        String jugador = JOptionPane.showInputDialog("Turno del jugador (introduzca piedra, papel o tijera): ");

        int mano = (int) (Math.random() * 3);
        String ordenador = "";

        switch (mano) {
            case 0:
                ordenador = "piedra";
                break;
            case 1:
                ordenador = "papel";
                break;
            case 2:
                ordenador = "tijera";
                break;
            default:
        }

        JOptionPane.showMessageDialog(null, "Turno del ordenador: " + ordenador);

        if (jugador.equals(ordenador)) {
            JOptionPane.showMessageDialog(null, "Empate");

        } else {
            int ganador = 2;
            switch (jugador) {
                case "piedra":
                    if (ordenador.equals("tijera")) {
                        ganador = 1;
                    }
                    break;
                case "papel":
                    if (ordenador.equals("piedra")) {
                        ganador = 1;
                    }
                    break;
                case "tijera":
                    if (ordenador.equals("papel")) {
                        ganador = 1;
                    }
                    break;
                default:

            }

            if (ganador == 1) {
                JOptionPane.showMessageDialog(null, "Gana el jugador");

            } else {
                JOptionPane.showMessageDialog(null, "Gana el ordenador");
            }

        }


    }
    
}

