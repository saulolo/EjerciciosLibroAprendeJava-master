package Uni5_Bucles;

/* @author: Saulolo */

public class Ejercicio5_4_3 {

    public static void main(String[] args) {
        
        /*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle 
        do-while.*/
        
        System.out.println("MULTIPLOS DE 5 CON DO WHILE");
        System.out.println("---------------------------");
        
        int numero = 5;
        int contador = 0;
        
        do {
            System.out.println(numero);
            numero = numero + 5;
        } while (numero <= 100);
        
    }
}
