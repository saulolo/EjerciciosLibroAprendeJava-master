package Uni5_Bucles;

/* @author: Saulolo */

public class Ejercicio5_4_5 {

    public static void main(String[] args) {
        
        /*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás 
        utilizando un bucle while.*/
        
        System.out.println("MOSTRANDO NÚMEROS DEL 320 - 160 (WHILE)");
        System.out.println("---------------------------------------");
        
        int numero = 320;
        
        while (numero >= 160) {
            System.out.println(numero);
            numero = numero - 20;
        }
    }
}
