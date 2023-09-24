package Uni6_NumerosAleatorios;

/* todo: @author: Saulolo */

public class NumerosAleatorios {

    public static void main(String[] args) {

        /*- 6.1 GENERACIÓN DE NÚMEROS ALEATORIOS CON Y SIN DECIMALES - */
        //Con la función Math.random(), genero los números aleatorios mostrándolos en decimales.
        //Los nÚmeros se generan entre un rango de [0,1]

        System.out.println("Díez números aleatorios");
        System.out.println("-----------------------");

        for (int i = 1; i < 11; i++) {
            System.out.println(Math.random());
        }


        System.out.println(" ");
        System.out.println("==================================");
        System.out.println("20 números aleatorios entre 0 y 10");
        System.out.println("Sin llegar a 10 (con decimales): ");
        System.out.println("----------------------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.println(Math.random() * 10 + " "); //Al multiplicar por 10, corremos la coma en una posición.
        }


        System.out.println(" ");
        System.out.println("==================================");
        System.out.println("20 números aleatorios entre 0 y 9 (sin decimales)");
        System.out.println("-------------------------------------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Número " + i + " => ");
            System.out.println((int) (Math.random() * 10) + " "); //Asi casteo a int para generar números enteros.
        }


        System.out.println(" ");
        System.out.println("==================================");
        System.out.println("20 números aleatorios entre 50 y 60 (sin decimales)");
        System.out.println("-------------------------------------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Número " + i + " => ");
            System.out.println(((int) (Math.random() * 11) + 50) + " ");
            //Desplazamos el intervalo sumando 50 por lo que obtenemos números decimales
            //entre 50 y 60.9999… Por último, quitamos los decimales haciendo casting
        }



        /*- 6.2 GENERACIÓN DE PALABRAS DE FORMA ALEATORIA DE UN CONJUNTO DADO - */

        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("Genere al azar piedra, papel o tijera");
        System.out.println("-------------------------------------");

        int mano = (int) (Math.random() * 3); //Asi establezco que va a generar números de 0 a 2

        switch (mano) {
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijera");
                break;
            default:
        }


        System.out.println(" ");
        System.out.println("=====================================");
        System.out.println("Genere al azar un dia a la semana");
        System.out.println("-------------------------------------");

        int dia = ((int)(Math.random() * 7) + 1); //Genera un día aleatorio entre el 1 y el 7

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
        }
    }
}



