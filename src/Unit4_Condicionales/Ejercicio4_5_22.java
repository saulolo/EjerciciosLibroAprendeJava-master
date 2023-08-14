package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_22 {
    
    public static void main(String[] args) {
        
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        
        
        /*Realiza un programa que, dado un día de la semana (de lunes a viernes)
        y una hora (horas y minutos), calcule cuántos minutos faltan para el fin
        de semana. Se considerará que el fin de semana comienza el viernes a las
        15:00h. Se da por hecho que el usuario introducirá un día y hora 
        correctos, anterior al viernes a las 15:00h.*/
        
        String dias;
        int hora;
        int minutos;
        int diaNumero = 0;
        int conversor;
        int conversorDia;
        int horaIngresada;
        final int horaFinSemana = 7900;
        int minutosParaFinde;
        
        System.out.println("TIEMPO PARA CULMINAR LA SEMANA");
        System.out.println("------------------------------");
        
        System.out.println("Ingresa el dia de la semana asi: [1:Lunes / 2:Martes"
                + "/ 3:Miercoles / 4:Jueves y 5:Viernes] ");
        dias = entrada1.nextLine();
        
        switch (dias) {
            case "lunes":
                diaNumero = 1;
                break;
            case "martes":
                diaNumero = 2;
                break;
            case "miercoles":
                diaNumero = 3;
                break;
            case "jueves":
                diaNumero = 4;
                break;
            case "viernes":
                diaNumero = 5;
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
        System.out.println("Ingresa la hora del dia [Hora militar]: ");
        hora = entrada2.nextInt();
        
        System.out.println("Ingresa los minutos: ");
        minutos = entrada3.nextInt();
        
        conversor = hora * 60;
        conversorDia = diaNumero * 1440;
        
        horaIngresada = conversor + minutos + conversorDia;
        
        minutosParaFinde = horaFinSemana - horaIngresada;
        
        System.out.println("Los minutos que faltan para el fin de semana son: " + minutosParaFinde + " minutos.");
        
    }
    
}
