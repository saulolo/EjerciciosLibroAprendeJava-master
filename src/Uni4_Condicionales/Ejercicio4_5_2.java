package Uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Realiza un programa que pida una hora por teclado y que muestre luego
        buenos días, buenas tardes o buenas noches según la hora. Se utilizarán 
        los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se 
        tienen en cuenta las horas, los minutos no se deben introducir por 
        teclado.*/
        
        System.out.println("SALUDO SEGÚN HORA DEL DÍA");
        System.out.println("-----------------------");
        
        int hora;
        
        System.out.println("Ingresa la hora (0 - 24)");
        hora = entrada.nextInt();
        
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos dias");
        }
        if (hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes");
        }
        if (hora >= 21 && hora <= 24 || hora >= 0 && hora <= 5) {
            System.out.println("Buenas noches");
        }
        if (hora > 24 || hora < 0){
            System.out.println("la hora introducida no es correcta");
        }
    }
}
