package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Escribe un programa que pida por teclado un día de la semana y que 
        diga qué asignatura toca a primera hora ese día.*/
        
        System.out.println("DIA DE LA SEMANA");
        System.out.println("-----------------------");
        
        String dia;
        String asignatura;
        
        System.out.println("Ingresa un día de la semana para decirle que ");
        System.out.print("asignatura corresponde a primera hora ese dia: ");
        dia = entrada.nextLine();
        dia = dia.toLowerCase();//Asi convierto todo a miniscula
        
        switch(dia){
            case "lunes":
                
            case "martes":
                
            case "miercoles":
                asignatura = "Corresponde a Programación a la primera hora del día";
                System.out.println(asignatura);
                break; 
                
            case "jueves":
                asignatura = "Corresponde a Ingles a la primera hora del día";
                System.out.println(asignatura);
                break;  
                
            case "viernes":
                asignatura = "Corresponde a Sistemas a la primera hora del día";
                System.out.println(asignatura);
                break;
                
            case "sabado":
                
            case "domingo":
                asignatura = "Ese dia no hay clase";
                System.out.println(asignatura);
                break;
                
            default:
                System.out.println("Opción no válida");
        }

    }

}
