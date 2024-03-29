package uni5_Bucles;

/* @author: Saulolo */

public class Ejercicio5_4_6 {

    public static void main(String[] args) {
        
        /*Muestra los números del 320 al 160, contando de 20 en 20 utilizando 
        un bucle do-while.*/
        
        System.out.println("MOSTRANDO NÚMEROS DEL 320 - 160 (DO WHILE)");
        System.out.println("------------------------------------------");
        
        int numero = 320;
        
        do {
            System.out.println(numero);
            numero = numero - 20;
        } while (numero >= 160);
    }
}
