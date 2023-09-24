
package Uni4_Condicionales;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio4_5_26 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Realiza un programa que calcule el precio de unas entradas de cine en 
        función del número de personas y del día de la semana. El precio base de 
        una entrada son 8 euros. El miércoles (día del espectador), el precio base 
        es de 5 euros. Los jueves son el día de la pareja, por lo que la entrada 
        para dos cuesta 11 euros.
        Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
        grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
        que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja 
        más 1 individual que son 41 euros (33 + 8).

        Ejemplo 1:
        Venta de entradas CineCampa
        Número de entradas: 4
        Día de la semana: martes
        ¿Tiene tarjeta CineCampa? (s/n): n
        Aquí tiene sus entradas. Gracias por su compra.
        Entradas individuales 4
        Precio por entrada individual 8.00 €
        Total 32.00 €
        Descuento 0.00 €
        A pagar 32.00 €

        Ejemplo 2:
        Venta de entradas CineCampa
        Número de entradas: 4
        Día de la semana: viernes
        ¿Tiene tarjeta CineCampa? (s/n): s
        Aquí tiene sus entradas. Gracias por su compra.
        Entradas individuales 4
        Precio por entrada individual 8.00 €
        Total 32.00 €
        Descuento 3.20 €
        A pagar 28.80 €

        Ejemplo 3:
        Venta de entradas CineCampa
        Número de entradas: 4
        Día de la semana: jueves
        ¿Tiene tarjeta CineCampa? (s/n): n
        Aquí tiene sus entradas. Gracias por su compra.
        Entradas de parejas 2
        Precio por entrada de pareja 11.00 €
        Total 22.00 €
        Descuento 0.00 €
        A pagar 22.00 €

        Ejemplo 4:
        Venta de entradas CineCampa
        Número de entradas: 5
        Día de la semana: jueves
        ¿Tiene tarjeta CineCampa? (s/n): s
        Aquí tiene sus entradas. Gracias por su compra.
        Entradas parejas
        Precio por entrada de pareja 11.00 €
        Entradas individuales 1
        Precio por entrada individual 8.00 €
        Total 30.00 €
        Descuento 3.00 €
        A pagar 27.00 €

        Ejemplo 5:
        Venta de entradas CineCampa
        Número de entradas: 5
        Día de la semana: miercoles
        ¿Tiene tarjeta CineCampa? (s/n): s
        Aquí tiene sus entradas. Gracias por su compra.
        Entradas individuales 5
        Precio por entrada individual 5.00 €
        Total 25.00 €
        Descuento 2.50 €
        A pagar 22.50 €
        */
        
        int boletas;
        String dia = null;
        String targeta;
        String entrada;
        int precio;
        double descuento = 0.10;
        int numParejas;
        double totalPrecio = 0;
        double totalPagar = 0;
        
    
        System.out.println("ENTRADA A CINE");
        System.out.println("--------------");
        
        
        
        System.out.println("Ingrese el número de entradas: ");
        boletas = input.nextInt();
        
        System.out.println("Entradas por pareja o individual [pareja | individual]: ");
        entrada = input.next();
        
        System.out.println("Ingrese el día de la semana: ");
        dia = input.next();
        
        
        switch (entrada) {
            case "pareja":
                System.out.println("Ingrese el numero de parejas: ");
                numParejas = input.nextInt();
                if (dia.equals("jueves")) {
                    totalPrecio = numParejas * 11;
                } else {
                    totalPrecio = 16;
                }
                break;
            case "individual":
                if (dia.equals("miercoles")) {
                    totalPrecio = 5;
                } else {
                    totalPrecio = 8;
                }
            default:
                System.out.println("Opción no válida.");
        }
        
        
        System.out.println("Venta de entradas CineCampa");
        
        System.out.println("Número de entradas: " + boletas);
        
        System.out.println("Día de la semana " + dia);
        
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        targeta = input.next();
        System.out.println(targeta);
        
        switch (targeta) {
            case "s":
                totalPagar = totalPrecio - (descuento * totalPrecio);
                break;
            case "n":
                totalPagar = totalPrecio;
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        System.out.println("Entradas indivisuales: ");
        System.out.println(entrada);
        System.out.println(boletas);
        System.out.println("Precio por entrada individual: " + totalPrecio);
        System.out.println("Total: " + totalPrecio);
        System.out.println("Descuento: " + descuento);
        System.out.println("A pagar: " + totalPagar);
        
        
        System.out.println(" ");
        System.out.println("================================================ ");
        System.out.println("El del libro ");
        System.out.println(" ");
        
        System.out.println("Venta de entradas CineCampa");

        System.out.print("Número de entradas: ");
        int entradas = input.nextInt();

        System.out.print("Día de la semana: ");
        String dia2 = input.next();

        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        boolean tieneTarjeta = (input.nextLine()).equals("s");

        int entradasIndividuales = entradas;
        double precioEntradaIndividual = 8;
        int entradasDePareja = 0;
        double total = 0;
        double descuento2 = 0;
        double aPagar = 0;

        switch (dia) {
            case "miércoles":
            case "miercoles":
                precioEntradaIndividual = 5;
            case "jueves":
                entradasDePareja = entradas / 2;
                entradasIndividuales = entradas % 2;
            default:
        }

        total = precioEntradaIndividual * entradasIndividuales;
        total += 11 * entradasDePareja;

        if (tieneTarjeta) {
            descuento2 = total * 0.1;
        }

        aPagar = total - descuento;

        System.out.println("\nAquí tiene sus entradas. Gracias por su compra.");

        if (entradasDePareja > 0) {
            System.out.printf("Entradas de pareja            %2d\n", entradasDePareja);
            System.out.printf("Precio por entrada de pareja  %5.2f €\n", 11.0);
        }

        if (entradasIndividuales > 0) {
            System.out.printf("Entradas individuales         %2d\n", entradasIndividuales);
            System.out.printf("Precio por entrada individual %5.2f €\n", precioEntradaIndividual);
        }

        System.out.printf("Total                         %5.2f €\n", total);
        System.out.printf("Descuento                     %5.2f €\n", descuento);
        System.out.printf("A pagar                       %5.2f €\n", aPagar);
        
    }

}


