package Uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_10 {

    public static void main(String[] args) {

        /*Escribe un programa que nos diga el horóscopo a partir del día y el
        mes de nacimiento.*/
        Scanner entrada = new Scanner(System.in);

        int dia;
        int mes;
        String horoscopo = "Opción no válida";

        System.out.println("HOROSCOPO SEGUN FECHA DE NACIMIENTO");
        System.out.println("-----------------------");

        System.out.println("Ingrese el dia (dd)  nacimiento: ");
        dia = entrada.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento (m): "
                + "\n 1: Enero"
                + "\n 2: Febrero"
                + "\n 3: Marzo"
                + "\n 4: Abril"
                + "\n 5: Mayo"
                + "\n 6: Junio"
                + "\n 7: Julio"
                + "\n 8: Agosto"
                + "\n 9: Septiembre"
                + "\n 10: Enero"
                + "\n 11: Enero"
                + "\n 12: Enero");
        
        mes = entrada.nextInt();

        if (dia >= 21 && mes == 3 || dia <= 20 && mes == 4) {
            System.out.println("Eres Aries");
        } 
        else if (dia >= 21 && mes == 4 || dia <= 20 && mes == 5) {
            System.out.println("Eres Tauro");
        } 
        else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
            System.out.println("Eres Géminis");
        } 
        else if (dia >= 21 && mes == 6 || dia <= 20 && mes == 7) {
            System.out.println("Eres Cancer");
        } 
        else if (dia >= 21 && mes == 7 || dia <= 20 && mes == 8) {
            System.out.println("Eres Leo");
        } 
        else if (dia >= 21 && mes == 8 || dia <= 20 && mes == 9) {
            System.out.println("Eres Virgo");
        } 
        else if (dia >= 21 &&  mes == 9 || dia <= 20 && mes == 10) {
            System.out.println("Eres Libra");
        } 
        else if (dia >= 21 &&  mes == 10 || dia <= 20 && mes == 11) {
            System.out.println("Eres Escorpión");
        }
        else if (dia >= 21 &&  mes == 11 || dia <= 20 && mes == 12) {
            System.out.println("Eres Sagitario");
        }
        else if (dia >= 21 &&  mes == 12 || dia <= 20 && mes == 01) {
            System.out.println("Eres Capricornio");
        }
        else if (dia >= 21 &&  mes == 01 || dia <= 20 && mes == 02) {
            System.out.println("Eres Acuario");
        }
        else if (dia >= 21 &&  mes == 02 || dia <= 20 && mes == 03) {
            System.out.println("Eres Piscis");
        }
        
    }

}
