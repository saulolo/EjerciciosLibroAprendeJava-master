package Uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_25 {

    public static void main(String[] args) {

        /*La tienda online BanderaDeEspaña.es vende banderas personalizadas de 
        la máxima calidad y nos ha pedido hacer un configurador que calcule el 
        precio según el alto y el ancho. El precio base de una bandera es de un 
        céntimo de euro el centímetro cuadrado. Si la queremos con un escudo 
        bordado, el precio se incrementa en 2.50 € independientemente del tamaño. 
        Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las 
        tarifas.
        
        Ejemplo 1:
        Introduzca la altura de la bandera en cm: 20
        Ahora introduzca la anchura: 35
        ¿Quiere escudo bordado? (s/n): n
        Gracias. Aquí tiene el desglose de su compra.
        Bandera de 700 cm2: 7,00 €
        Sin escudo: 0,00 €
        Gastos de envío: 3,25 €
        Total: 10,25 €
        
        Ejemplo 2:
        Introduzca la altura de la bandera en cm: 10
        Ahora introduzca la anchura: 15
        ¿Quiere escudo bordado? (s/n): s
        Gracias. Aquí tiene el desglose de su compra.
        Bandera de 150 cm2: 1,50 €
        Con escudo: 2,50 €
        Gastos de envío: 3,25 €
        Total: 7,25 €
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("TIENDA ONLINE BANDERA DE ESPAÑA");
        System.out.println("-------------------------------");

        double altura;
        double anchura;
        String escudo;
        double bandera;
        double totalBandera;
        final double bordado = 2.50;
        final double valorCm2 = 0.01;
        final double gastosEnvio = 3.25;
        double totalBordado;

        System.out.println("Introduzca la altura de la bandera en cm: ");
        altura = input.nextDouble();

        System.out.println("Ahora introduzca la anchura en cm: ");
        anchura = input.nextDouble();

        bandera = (altura * anchura);
        totalBandera = bandera * valorCm2;

        System.out.println("¿Quiere escudo bordado? (s/n):");
        escudo = input.next();

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");

        switch (escudo) {
            case "s":
                totalBordado = totalBandera + bordado;
                System.out.println("Bandera de " + bandera + " cm2: " + totalBandera + " €");
                System.out.println("Con escudo: " + bordado + " €");
                System.out.println("Gastos de envío: " + gastosEnvio + " €");
                totalBandera = totalBandera + bordado + gastosEnvio;
                System.out.println("Total: " + totalBandera + " €");
                break;
            case "n":
                totalBordado = 0.00;
                System.out.println("Bandera de " + bandera + " cm2: " + totalBandera + " €");
                System.out.println("Con escudo: " + totalBordado + " €");
                System.out.println("Gastos de envío: " + gastosEnvio + " €");
                totalBandera = totalBandera + totalBordado + gastosEnvio;
                System.out.println("Total: " + totalBandera + " €");
                break;
            default:
                System.out.println("Opción no válida");
        }

        System.out.println(" ");
        System.out.println("================================================");
        System.out.println("SOLUCIÓN LIBRO");

        System.out.print("Introduzca la altura de la bandera en cm: ");
        int altura2 = input.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        int anchura2 = input.nextInt();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String conEscudo = input.next();

        String escudoCadena;
        float precioEscudo;

        if (conEscudo.equals("s")) {
            escudoCadena = "Con escudo";
            precioEscudo = 2.50f;
        } else {
            escudoCadena = "Sin escudo";
            precioEscudo = 0;
        }

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %5d cm2: %5.2f €\n", anchura2 * altura2, (float) anchura2 * altura2 / 100);
        System.out.printf("%s:           %5.2f €\n", escudoCadena, precioEscudo);
        System.out.printf("Gastos de envío:      %5.2f €\n", 3.25);
        System.out.printf("Total:                %5.2f €\n", (float) anchura2 * altura2 / 100 + precioEscudo + 3.25);
    }

}

