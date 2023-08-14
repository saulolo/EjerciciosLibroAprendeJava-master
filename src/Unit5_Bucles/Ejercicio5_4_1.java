package Unit5_Bucles;

/* @author: Saulolo */

public class Ejercicio5_4_1 {

    public static void main(String[] args) {
        
        /*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.*/
        
        System.out.println("MULTIPLOS DE 5 CON FOR");
        System.out.println("----------------------");
        
        System.out.println("Los multiplos de 5 son: ");
        for (int i = 1; i <= 100; i++) {
            if (i %5 == 0) {
                System.out.println(i);
            }
            
        }
        
    }
}
