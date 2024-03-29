package uni2_Variables;

public class Ejercicio2_6_5 {
    
    public static void main(String[] args) {
        /*
        Realiza un conversor de pesetas a euros. La cantidad en pesetas que se 
        quiere convertir deberá estar almacenada en una variable.
        */
        
        double euro = 166.368;
        int peseta = 1;
        
        double conversor = (double) euro * peseta;
        
        System.out.println(peseta + " pesetas, equivalen a " + conversor + " euros. ");
        
    }
    
}
