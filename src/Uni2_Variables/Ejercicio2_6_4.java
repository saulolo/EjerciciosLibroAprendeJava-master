package Uni2_Variables;

public class Ejercicio2_6_4 {
    
    public static void main(String[] args) {
        
        /*
        Realiza un conversor de euros a pesetas. La cantidad en euros que se 
        quiere convertir deberá estar almacenada en una variable.
        */
        
        double euro = 1;
        int pesetas = 166;
        
        int conversor = (int) euro * pesetas;
        
        System.out.println(euro + " euros, equivalen a " + conversor + " pesetas. ");
        
        
    }
    
}
