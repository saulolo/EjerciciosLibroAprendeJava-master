package Uni3_EntradaDeDatos;

import java.util.*;

public class Ejercicio3_4_7 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa que calcule el total de una factura a partir de 
        la base imponible.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int producto1;
        int producto2;
        int producto3;
        int producto4;
        int producto5;
        int subtotal;
        double total;
        double iva = 0.19;
        
        
        System.out.println("FACTURA");
        System.out.println("-------------");
        
        System.out.println("Ingrese costo del primer producto: ");
        producto1 = entrada.nextInt();
        
        System.out.println("Ingrese costo del segundo producto: ");
        producto2 = entrada.nextInt();
        
        System.out.println("Ingrese costo del tercer producto: ");
        producto3 = entrada.nextInt();
        
        System.out.println("Ingrese costo del cuarto producto: ");
        producto4 = entrada.nextInt();
        
        System.out.println("Ingrese costo del quinto producto: ");
        producto5 = entrada.nextInt();
        
        subtotal = producto1 + producto2 + producto3 + producto4 + producto5;
        
        System.out.println("RECIBO DE CAJA");
        System.out.println("--------------------------");
        
        System.out.printf("%10s     %8d %1s\n", "Producto 1", producto1, "$");
        System.out.printf("%10s     %8d %1s\n", "Producto 2", producto2, "$");
        System.out.printf("%10s     %8d %1s\n", "Producto 3", producto3, "$");
        System.out.printf("%10s     %8d %1s\n", "Producto 4", producto4, "$");
        System.out.printf("%10s     %8d %1s\n", "Producto 5", producto5, "$");
        
        System.out.printf("%10s     %8d %1s\n", "SubTotal = ", subtotal , "$");
        
        System.out.printf("%10s     %8.0f %1s\n","IVA 19% = ", (subtotal * iva), "$");
        
        total = (subtotal * iva) + subtotal;
        
         System.out.println("--------------------------");
        
        System.out.printf("%10s %8.0f %1s\n", "Total Factura = ", total, "$");
        
    }
    
}
