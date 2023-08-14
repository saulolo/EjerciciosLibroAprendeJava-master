package Uni2_Variables;

public class Ejercicio2_6_1 {
    
    public static void main(String[] args) {
        /*
        Escribe un programa en el que se declaren las variables enteras x e y. 
        Asígnales los valores 144 y 999 respectivamente. A continuación, muestra
        por pantalla el valor de cada variable, la suma, la resta, la división 
        y la multiplicación.
        */
        
        int x = 144;
        int y = 999;
        int suma = x + y;
        int resta = x - y;
        int division = x / y;
        int multiplicacion = x * y;
        
        float divconvert = (float) x / (float) y;
        
        System.out.println("La suma de: " + x + " + " + y + " = " + suma);
        System.out.println("La resta de: " + x + " - " + y + " = " + resta);
        System.out.println("La división de: " + x + " / " + y + " = " + divconvert);
        System.out.println("La multiplicación de: " + x + " x " + y + " = " + multiplicacion);
        
        
    }
    
}
