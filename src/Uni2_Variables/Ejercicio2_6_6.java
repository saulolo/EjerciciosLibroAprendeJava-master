package Uni2_Variables;

public class Ejercicio2_6_6 {
    
    public static void main(String[] args) {
        
        /*
        Escribe un programa que calcule el total de una factura a partir de la 
        base imponible (precio sin IVA). La base imponible estará almacenada en
        una variable.
        */
        
        float producto1 = 2500;
        float producto2 = 10500;
        float producto3 = 850;
        float producto4 = 10000;
        float total = (producto1 + producto2 + producto3 + producto4);
        float iva = 0.19f;
        
        System.out.println("El total de la factura es: " + (total * iva) + " pesos");
        
        
        
        
        
        
    }
    
}
