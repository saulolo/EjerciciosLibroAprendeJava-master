package Uni7_Arrays;

import java.util.Scanner;

/**
 * Introducción de arrays
 *
 * @author Saul Echeverri
 */
public class ArraysBidimensionales {

    public static void main(String[] args) throws InterruptedException { // Se añade esta línea para poder usar sleep

                                           /*- DEFINICIÓN - */
        /* Un array bidimensional utiliza dos índices para localizar cada elemento. Podemos ver este tipo de
        dato como un array que, a su vez, contiene otros arrays. También se puede ver como una cuadrícula en la
        que los datos quedan distribuidos en filas y columnas.
         */

        System.out.println("EJEMPLO 1: USO DE ARRAY DE DOS DIMENSIONES");
        System.out.println("------------------------------------------");

        int[][] n = new int[3][2]; //Array de 3 filas por 2 columnas.
        n[0][0] = 20;
        n[1][0] = 67;
        n[1][1] = 33;
        n[2][1] = 7;

        int fila, columna;

        for (fila = 0; fila < 3; fila++) {
            System.out.println("fila = " + fila);
            for (columna = 0; columna < 2; columna++) {
                System.out.printf("%10d ", n[fila][columna]);
                Thread.sleep(1000);  // Retardo de un segundo
            }
            System.out.println();
        }




                        /*- DEFINICIÓN DE ARRAY BIDIMENSIONAL EN UNA MISMA LÍNEA- */
        /* Los arrays bidimensionales se utilizan con frecuencia para situar objetos en un plano como por ejemplo
        las piezas de ajedrez en un tablero, o un personaje de video-juego en un laberinto.
         */

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("EJEMPLO 2: INICIALIZANDO UN ARRAY BIDIMENSIONAL EN UNA MISMA LÍNEA");
        System.out.println("------------------------------------------------------------------");

        int fila2, columna2;
        int[][] n2 = {{20, 4}, {67, 33}, {0, 7}};

        for (fila2 = 0; fila2 < 3; fila2++) {

            System.out.println("Fila2: " + fila2);

            for (columna2 = 0; columna2 < 2; columna2++) {

                System.out.printf("%10d ", n2[fila2][columna2]);
                Thread.sleep(1000); //Retardo de un segundo.
            }
            System.out.println();
        }


        System.out.println(" ");
        System.out.println("====================================================");
        System.out.println("EJEMPLO 3: MINIJUEGO BUSCA EL TESORO");
        System.out.println("------------------------------------");

        /* En el siguiente programa se colocan una mina y un tesoro de forma aleatoria en un cuadrante de cuatro
        filas por cinco columnas. El usuario intentará averiguar dónde está el tesoro indicando las coordenadas
        (x, y).
         */

        Scanner input = new Scanner(System.in);

        // se definen constantes para representar el contenido de las celdas.
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int x;
        int y;
        int[][] cuadrante = new int[5][4];

        // inicializa el array
        for(x = 0; x < 4; x++) {
            for(y = 0; y < 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }

        // coloca la mina
        int minaX = (int)(Math.random() * 5);
        int minaY = (int)(Math.random() * 4);
        cuadrante[minaX][minaY] = MINA;

        // coloca el tesoro
        int tesoroX;
        int tesoroY;
        do {
            tesoroX = (int)(Math.random() * 5);
            tesoroY = (int)(Math.random() * 4);
        } while ((minaX == tesoroX) && (minaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = TESORO;

        //Juego
        System.out.println("¡BUSCA EL TESORO!");

        boolean salir = false;
        String c = "";

        do {
        // pinta el cuadrante
            for(y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for(x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print("X ");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println(" ----------\n 0 1 2 3 4\n");

            // pide las coordenadas
            System.out.print("Coordenada x: ");
            x = Integer.parseInt(input.nextLine());
            System.out.print("Coordenada y: ");
            y = Integer.parseInt(input.nextLine());

            // mira lo que hay en las coordenadas indicadas por el usuario
            switch(cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                    salir = true;
                    break;
                default:
            }
        } while (!salir);

        // pinta el cuadrante
        for(y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for(x = 0; x < 5; x++) {
                switch(cuadrante[x][y]) {
                    case VACIO:
                        c = " ";
                        break;
                    case MINA:
                        c = "* ";
                        break;
                    case TESORO:
                        c = "€ ";
                        break;
                    case INTENTO:
                        c = "X ";
                        break;
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" ----------\n 0 1 2 3 4\n");


    }
}










