package uni5_Bucles;

import java.util.Scanner;

/* todo: @author: Saulolo */

/* Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres de ancho por 3 de alto y, a
continuación, un menú que permita agrandarlo, achicarlo o cambiar su orientación. Cada vez que el rectángulo se
agranda, se incrementa en 1 tanto su anchura como su altura. Cuando se achica, se decrementa en 1 su anchura y
altura. Por último, cuando se cambia la orientación, los valores de anchura y altura se intercambian. El valor
mínimo de la altura o la anchura es 2.

Ejemplo:

******
* *
******
1. Agrandarlo
2. Achicarlo
3. Cambiar la orientación
4. Salir
Indique qué quiere hacer con el rectángulo: 2

****
****
1. Agrandarlo
2. Achicarlo
3. Cambiar la orientación
4. Salir
Indique qué quiere hacer con el rectángulo: 2

****
****
1. Agrandarlo
2. Achicarlo
3. Cambiar la orientación
4. Salir
Indique qué quiere hacer con el rectángulo: 1

*****
* *
*****
1. Agrandarlo
2. Achicarlo
3. Cambiar la orientación
4. Salir
Indique qué quiere hacer con el rectángulo: 3

***
* *
* *
* *
***
1. Agrandarlo
2. Achicarlo
3. Cambiar la orientación
4. Salir
Indique qué quiere hacer con el rectángulo: 4
*/

public class Ejercicio5_4_64 {

    public static void main(String[] args) {

        System.out.println("PINTANDO UN RECTÁNGULO HUECO");
        System.out.println("----------------------------");

        int ancho = 6;
        int alto = 3;

        Scanner s = new Scanner(System.in);

        int opcion = 0;

        do {
            // Pinta el rectángulo
            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
            System.out.println();

            for (int i = 0; i < alto - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < ancho - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
            }
            System.out.println();

            // Menú
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            System.out.print("Indique qué quiere hacer con el rectángulo: ");
            opcion = Integer.parseInt(s.nextLine());

            switch(opcion) {
                case 1:
                    ancho++;
                    alto++;
                    break;
                case 2:
                    if ((ancho > 2) && (alto > 2)) {
                        ancho--;
                        alto--;
                    } else {
                        System.out.println("El rectángulo no se puede achicar más.");
                    }
                    break;
                case 3:
                    int aux = ancho;
                    ancho = alto;
                    alto = aux;
                    break;
                default:
            }
            System.out.println();
        } while (opcion != 4);
    }
}

