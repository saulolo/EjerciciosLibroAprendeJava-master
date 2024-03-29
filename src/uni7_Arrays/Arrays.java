package uni7_Arrays;

import java.util.Scanner;

/**
 * Introducción de arrays
 *
 * @author Saul Echeverri
 */
public class Arrays {

    public static void main(String[] args) {

                                /*- FORMACIÓN Y SINTAXIS DE UN ARRAY - */
        //Asi se inicializa un array para ir agregando elemento a elemento.

        System.out.println("EJEMPLO 1: INICIALIZANDO UN ARRAY");
        System.out.println("---------------------------------");

        int [] n = new int[4]; //Se define como un array de enteros y Se reserva espacio para 4 enteros.

        n[0] = 26;
        n[1] = -30;
        n[2] = 0;
        n[3] = 100;

        System.out.println("Los valores de los arrays son los siguientes: ");
        System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);

        int suma = n[0] + n[3];
        System.out.println("El primer elemento del Array mas el último suman: " + suma);



                            /*- DEFINICIÓN DE ARRAY EN UNA MISMA LÍNEA- */

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("EJEMPLO 2: INICIALIZANDO UN ARRAY EN UNA MISMA LÍNEA");
        System.out.println("----------------------------------------------------");

        Scanner input = new Scanner(System.in);
        int [] x = {8, 33, 200, 150, 11}; //Se pone los elementos dentro de llaves.

        System.out.println("El array tiene 5 elementos, cual de ellos quieres ver? ");
        System.out.println("Introduce un número del 0 al 4: ");
        int indice = input.nextInt();
        System.out.println("El elemento que se encuentra en la posicón " + indice + " es el " + x[indice]);


                            /*- RECORRIENDO LOS ELEMENTOS DE UN ARRAY - */
        //Para recorrer todos los elementos de un array se suele utilizar un bucle for junto con un índice que
        //va desde 0 hasta el tamaño del array menos 1.

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("EJEMPLO 3: RECORRIENDO LOS ELEMENTOS DE UN ARRAY");
        System.out.println("------------------------------------------------");

        int[] num = new int[10];

        num[0] = 8;
        num[1] = 33;
        num[2] = 200;
        num[3] = 150;
        num[4] = 11;
        num[5] = 88;
        num[6] = num[2] * 10;
        num[7] = num[2] / 10;
        num[8] = num[0] + num[1] + num[2];
        num[9] = num[8];

        System.out.println("El array num contiene los siguientes elementos: ");
        for (int i = 0; i < 10; i++) {  //Se imprime los elementos del array con un ciclo for
            System.out.println(num[i]);
        }


                                    /*- ARRAY DE CARACTERES - */
        //Nota: En Java, a diferencia de otros lenguajes como Ruby o PHP, todos los elementos de un array deben
        // ser del mismo tipo.

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("EJEMPLO 4: ARRAY DE CARACTERES");
        System.out.println("------------------------------");

        char[] caracter =  new char[6];

        caracter[0] = 'R';
        caracter[1] = '%';
        caracter[2] = '&';
        caracter[3] = '+';
        caracter[4] = 'A';
        caracter[5] = '2';

        System.out.println("EL array caracter contiene los siguientes elementos");
        for (int i = 0; i < 6; i++) {
            System.out.println(caracter[i]);
        }


                                /*- ARRAY DE DOUBLE - */

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("EJEMPLO 5: NOTAS DE UN ALUMNO");
        System.out.println("-----------------------------");

        double[] nota = new double[4];

        System.out.println("Para calcular la nota media necesito saber la nota de cada uno de los exámenes");

        for (int i = 0; i < 4; i++) {
            System.out.println("Nota del examen No " + (i+1) + " : "); //Asi pido nota por nota
            nota[i] = input.nextDouble(); //Pido por consola la nota
        }

        System.out.println("Tus notas son: ");

        double sum = 0;

        for (int i = 0; i < 4; i++) {  //Simepre que quiera imprimir debo hacerlo a travez de un ciclo for.
            System.out.println(nota[i] + " ");
            sum +=  nota[i];
        }

        System.out.println("La media es: " + sum/4);


                                /*- ARRAY DE CADENAS - */
        // Veamos otro ejemplo. Esta vez usamos un array de cadenas de caracteres para almacenar colores.

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("EJEMPLO 6: GENERADOR ALEATORIOS DE BANDERAS");
        System.out.println("-------------------------------------------");

        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};

        System.out.println("Cuantas franjas quiere para la bandera: ");
        int franjas = Integer.parseInt(input.next());

        System.out.println("-------------");
        for (int i = 0; i < franjas; i++) {
            System.out.println(color[(int) (Math.random() * 6)]);
            System.out.println("------------------");
        }

    }

}
