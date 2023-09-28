package Uni6_NumerosAleatorios;

import javax.swing.*;
import java.util.Scanner;


/* todo: @author: Saulolo */

/* Realiza un programa que muestre la previsión del tiempo para mañana en Málaga. Las temperaturas máxima y
mínima se deben generar de forma aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado o nublado en cada estación se
proporciona a continuación. Obviamente, la temperatura mínima deberá ser menor o igual que la temperatura máxima.

Ejemplo:
1. Primavera
2. Verano
3. Otoño
4. Invierno
Seleccione la estación del año (1-4): 4
Previsión del tiempo para mañana
--------------------------------
Temperatura mínima: 10ºC
Temperatura máxima: 16ºC
Nublado

*/


public class Ejercicio6_3_29 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("PREVISIÓN DEL TIEMPO");
        JOptionPane.showMessageDialog(null, into);

        Scanner s = new Scanner(System.in);

        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");
        int estacion = Integer.parseInt(s.nextLine());

        int temperaturaMinima = 0;
        int temperaturaMaxima = 0;
        String cielo = "";

        switch(estacion) {
            case 1: // Primavera
                temperaturaMinima = (int)(Math.random() * 16 + 15);
                temperaturaMaxima = (int)(Math.random() * 16 + 15);
                cielo = Math.random() <= 0.6 ? "Soleado" : "Nublado";
                break;
            case 2: // Verano
                temperaturaMinima = (int)(Math.random() * 21 + 25);
                temperaturaMaxima = (int)(Math.random() * 21 + 25);
                cielo = Math.random() <= 0.8 ? "Soleado" : "Nublado";
                break;
            case 3: // Otoño
                temperaturaMinima = (int)(Math.random() * 11 + 20);
                temperaturaMaxima = (int)(Math.random() * 11 + 20);
                cielo = Math.random() <= 0.4 ? "Soleado" : "Nublado";
                break;
            case 4: // Invierno
                temperaturaMinima = (int)(Math.random() * 26);
                temperaturaMaxima = (int)(Math.random() * 26);
                cielo = Math.random() <= 0.2 ? "Soleado" : "Nublado";
                break;
            default:
                System.out.println("La estación seleccionada no es correcta.");
        }

        // Si la mínima es mayor, se intercambian las temperaturas
        if (temperaturaMinima > temperaturaMaxima) {
            int aux = temperaturaMinima;
            temperaturaMinima = temperaturaMaxima;
            temperaturaMaxima = aux;
        }

        System.out.println("\nPrevisión del tiempo para mañana");
        System.out.println("--------------------------------");
        System.out.println("Temperatura mínima: " + temperaturaMinima);
        System.out.println("Temperatura máxima: " + temperaturaMaxima);
        System.out.println(cielo);


    }
    
}

