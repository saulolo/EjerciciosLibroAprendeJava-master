package uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_23 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        
        /*Escribe un programa que calcule el precio final de un producto según 
        su base imponible (precio antes de impuestos), el tipo de IVA aplicado 
        (general, reducido o superreducido) y el código promocional. Los tipos 
        de IVA general, reducido y superreducido son del 21%, 10% y 4% 
        respectivamente. Los códigos promocionales pueden ser nopro, mitad, 
        meno5 o 5porc que significan respectivamente que no se aplica promoción,
        el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 
        5%. El ejercicio se da por bueno si se muestran los valores correctos, 
        aunque los números no estén tabulados.
        
        Ejemplo: 
        Introduzca la base imponible: 25
        Introduzca el tipo de IVA (general, reducido o superreducido): reducido
        Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
        Base imponible 25.00
        IVA (10%) 2.50
        Precio con IVA 27.50
        Cód. promo. (mitad): -13.75
        TOTAL 13.75
        */
        
        System.out.println("PRECIO FINAL DE PRODUCTO");
        System.out.println("------------------------");
        
        double base;
        String tipoIva;
        double iva = 0;
        String codigoPromocional;
        double promocion = 0;
        double totalIva;
        double precioIva;
        double total;
        
        System.out.println("Intrdoduzca la base imponible: ");
        base = entrada.nextInt();
        
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        tipoIva = entrada2.nextLine();
        
        switch (tipoIva) {
            case "general":
                iva = 0.21;
                break;
            case "reducido":
                iva = 0.10;
                break;
            case "superreducido":
                iva = 0.04;
                break;
            default:
                System.out.println("Opción no válida");    
        }
        
        totalIva = (base * iva);
        precioIva = (base * iva) + base;
        

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        codigoPromocional = entrada3.nextLine();
        
        switch (codigoPromocional) {
            case "nopro":
                System.out.println("No se aplica prmoción");
                break;
            case "mitad":
                promocion = base / 2;
                break;
            case "meno5":
                promocion = base - 5;
                break;
            case "5porc":
                promocion = (base * 0.05) + base;
                break;
            default:
                System.out.println("Opción no válida"); 
        }
        
        total = precioIva + promocion;
        
        System.out.println("Base imponible: " + base);
        System.out.println("IVA " + iva * 100 + "% : " + totalIva);
        System.out.println("Precio con IVA: " + precioIva);
        System.out.println("Cód. promo. " + codigoPromocional + " : "  + promocion);
        System.out.println("TOTAL: " + total);
        
    }
    
}
