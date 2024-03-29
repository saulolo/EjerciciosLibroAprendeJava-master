package uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren sustituir el color blanco por
colores más alegres. Realiza un programa que genere de forma aleatoria una secuencia de tres colores aleatorios
(uno para cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que debe elegir el
programa son los siguientes: rojo, azul, verde, amarillo, fucsia y naranja.

*/

public class Ejercicio6_3_18 {

    public static void main(String[] args) throws InterruptedException {


                        //SOLUCIÓN 1
        String sol1 = ("SOLUCIÓN 1");
        JOptionPane.showMessageDialog(null, sol1);
        System.out.println("=========");

        String into = ("PINTANDO LA CASA");
        JOptionPane.showMessageDialog(null, into);
        System.out.println("------------");

        // Todavía no se han visto arrays y por eso el ejercicio está implementado
        // exclusivamente con variables. Con arrays es mucho más corto.

        int c1;
        int c2;
        int c3;

        do {
            c1 = (int)(Math.random() * 6);
            c2 = (int)(Math.random() * 6);
            c3 = (int)(Math.random() * 6);
        } while ((c1 == c2) || (c1 == c3) || (c2 == c3));


        String color1 = "";

        switch(c1) {
            case 0:
                color1 = "\033[31m rojo";
                break;
            case 1:
                color1 = "\033[34m azul";
                break;
            case 2:
                color1 = "\033[32m verde";
                break;
            case 3:
                color1 = "\033[33m amarillo";
                break;
            case 4:
                color1 = "\033[35m fucsia";
                break;
            case 5:
                color1 = "\033[38;2;255;140;0m Naranja";
                break;
            default:
        }

        String color2 = "";

        switch(c2) {
            case 0:
                color2 = "\033[31m rojo";
                break;
            case 1:
                color2 = "\033[34m azul";
                break;
            case 2:
                color2 = "\033[32m verde";
                break;
            case 3:
                color2 = "\033[33m amarillo";
                break;
            case 4:
                color2 = "\033[35m fucsia";
                break;
            case 5:
                color2 = "\033[38;2;255;140;0m Naranja";
                break;
            default:
        }

        String color3 = "";

        switch(c3) {
            case 0:
                color3 = "\033[31m rojo";
                break;
            case 1:
                color3 = "\033[34m azul";
                break;
            case 2:
                color3 = "\033[32m verde";
                break;
            case 3:
                color3 = "\033[33m amarillo";
                break;
            case 4:
                color3 = "\033[35m fucsia";
                break;
            case 5:
                color3 = "\033[38;2;255;140;0m Naranja";
                break;
            default:
        }

        System.out.print(color1 + ", " + color2 + ", " + color3);



                        //SOLUCIÓN 1
        String sol2 = ("SOLUCIÓN 2");
        JOptionPane.showMessageDialog(null, sol2);
        System.out.println("=========");

        // Todavía no se han visto arrays y por eso el ejercicio está implementado
        // exclusivamente con variables. Con arrays es mucho más corto.

        int co1;
        int co2;
        int co3;

        String colorC1 = "";
        String colorC2 = "";
        String colorC3 = "";

        do {
            co1 = (int)(Math.random() * 6);
            co2 = (int)(Math.random() * 6);
            co3 = (int)(Math.random() * 6);
        } while ((co1 == co2) || (co1 == co3) || (co1 == co3));

        for (int i = 0; i < 3; i++) {
            String colorr = "";
            int c = 0;

            switch(i) {
                case 0:
                    c = co1;
                    break;
                case 1:
                    c = co2;
                    break;
                case 2:
                    c = co3;
                    break;
                default:
            }

            switch(c) {
                case 0:
                    colorr = "rojo";
                    break;
                case 1:
                    colorr = "azul";
                    break;
                case 2:
                    colorr = "verde";
                    break;
                case 3:
                    colorr = "amarillo";
                    break;
                case 4:
                    colorr = "violeta";
                    break;
                case 5:
                    colorr = "naranja";
                    break;
                default:
            }

            switch(i) {
                case 0:
                    colorC1 = colorr;
                    break;
                case 1:
                    colorC2 = colorr;
                    break;
                case 2:
                    colorC3 = colorr;
                    break;
                default:
            }
        }

        System.out.print(colorC1 + ", " + colorC2 + ", " + colorC3);






    }
}

