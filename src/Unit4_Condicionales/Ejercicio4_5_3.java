package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_3 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa en que dado un número del 1 a 7 escriba el 
        correspondiente nombre del día de la semana.*/
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("DÍA DE LA SEMANA");
        System.out.println("-----------------------");
        
        int dia;
        String nombreDia;
        
        System.out.println("Ingresa un número del 1 al 7 para establecer el dia"
                + " correspondiete");
        dia = entrada.nextInt();
        
        switch (dia){
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;    
            case 4:
                nombreDia = "Jueves";
                break;  
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Opción no válida";
        }
        System.out.println("El número " + dia + " corresponde al día " + nombreDia);
        
    }
    
}
