package Unit4_Condicionales;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejercicio4_5_28 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*Implementa el juego piedra, papel y tijera. Primero, el usuario 1 
        introduce su jugada y luego el usuario 2. Si alguno de los usuarios 
        introduce una opción incorrecta, el programa deberá mostrar un mensaje 
        de error.
        
        Ejemplo 1:
        Turno del jugador 1 (introduzca piedra, papel o tijera): papel
        Turno del jugador 2 (introduzca piedra, papel o tijera): papel
        Empate
        
        Ejemplo 2:
        Turno del jugador 1 (introduzca piedra, papel o tijera): papel
        Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
        Gana el jugador 2
        
        Ejemplo 3:
        Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
        Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
        Gana el jugador 1*/
        
        System.out.println("JUEGO: PIEDRA, PAPEL Y TIJERAS");
        System.out.println("------------------------------");        
        
        
        String jugador;
        String jugador2;
        
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        jugador = input.nextLine();
        
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        jugador2 = input.nextLine();
        
        switch (jugador) {
            case "papel":
                if (jugador2.equals("papel")) {
                    System.out.println("Empate");
                } 
                else if (jugador2.equals("tijera")){
                    System.out.println("Gana el jugador 2");
                }    
                else if (jugador2.equals("piedra")){
                    System.out.println("Gana el jugador 1");
                }
                break;
            case "tijera":
                if (jugador2.equals("papel")) {
                    System.out.println("Gana el jugador 1");
                } 
                else if (jugador2.equals("piedra")){
                    System.out.println("Gana el jugador 2");
                }    
                else if (jugador2.equals("tijera")){
                    System.out.println("Empate");
                }
                break;
            case "piedra":
                if (jugador2.equals("papel")) {
                    System.out.println("Gana el jugador 2");
                } 
                else if (jugador2.equals("tijera")){
                    System.out.println("Gana el jugador 1");
                }    
                else if (jugador2.equals("piedra")){
                    System.out.println("Empate");
                }
                break;
            default:
                System.out.println("Error");
        }
        
    }
}
