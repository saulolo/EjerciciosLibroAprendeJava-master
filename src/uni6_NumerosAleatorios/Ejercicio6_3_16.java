package uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante,
herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.

Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda

Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido

Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas

*/

public class Ejercicio6_3_16 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("MÁQUINA TRAGAPERRAS");
        JOptionPane.showMessageDialog(null, into);
        System.out.println("----------------");

        int figura;
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;


        for (int i = 0; i < 3; i++) {
            figura = (int) (5 * Math.random());

        switch (figura) {
            case 0:
                System.out.println("Corazón");
                break;
            case 1:
                System.out.println("Diamante");
                break;
            case 2:
                System.out.println("Herradura");
                break;
            case 3:
                System.out.println("Campana");
                break;
            case 4:
                System.out.println("Limón");
                break;
            default:
            }

            switch (i) {
                case 0:
                figura1 = figura;
                    break;
                case 1:
                    figura1 = figura;
                    break;
                case 2:
                    figura1 = figura;
                    break;
                default:
            }
        }
        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
            System.out.println("(҂◡_◡)!!  Lo siento, ha perdido.");
        } else if ((figura1 == figura2) && (figura2 == figura3)) {
            System.out.println(" (>‿◠)✌!!! Enhorabuena, ha ganado 10 monedas.");
        } else {
            System.out.println(" (>‿◠)✌!!!  Bien, ha recuperado su moneda.");
        }

    }
}

