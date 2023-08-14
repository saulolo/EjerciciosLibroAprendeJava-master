package Uni2_Variables;

public class Ejercicio2_6_8 {
    
    public static void main(String[] args) {
        
        /*
        Escribe un programa que declare 5 variables de tipo char. A continuación,
        crea otra variable como cadena de caracteres y asígnale como valor la 
        concatenación de las anteriores 5 variables. Por último, muestra la 
        cadena de caracteres por pantalla ¿Qué problemas te encuentras? ¿cómo 
        lo has solucionado?
        */
        
        char var1 = 'J';
        char var2 = 'o';
        char var3 = 'r';
        char var4 = 'g';
        char var5 = 'e';
        
        //String texto = (String) var1;
        
        String texto = "" + var1 + var2 + var3 + var4 + var5;
        
        System.out.println(texto);
        
        
       
    }
    
}
