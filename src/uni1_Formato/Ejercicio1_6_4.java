package uni1_Formato;

public class Ejercicio1_6_4 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa que muestre tu horario de clase.*/
     
        System.out.printf("%-8s %-12s %-12s %-12s    %-12s %-12s %-12s \n", "HORA", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO");            
        System.out.println("=====================================================================================");
        System.out.printf("%1s     %77s\n", "8-9", "HABILIDADES ");
        System.out.printf("%1s     %10s\n", "12-2", " ");
        System.out.printf("%1s     %10s\n", "2-4", " ");
        System.out.printf("%1s     %10s\n", "4-6", " ");
        System.out.printf("%1s %27s %14s %13s %13s\n", "6-8", "Programación", "Programación", "Programación", "Programación");
        System.out.printf("%1s %20s %28s\n", "8-10","Ingles", "Ingles");
        
        System.out.println("************************************************************************************");
        
        // Otra respuesta
        System.out.println("\n HORA\tLUNES\tMARTES\tMIERC.\tJUEVES\tVIERNES\tSABADO");
        System.out.println(" ======\t======\t======\t=======\t=======\t=======\t=======");
        System.out.println(" 8-9\t \t \t \t \t \tHabil.");
        System.out.println(" 18-20\t \tProg. \tProg. \tProg. \tProg. \t");
        System.out.println(" 20-22\t \tIng. \t \tIng. \t \t");
        System.out.println(" 22-24\t \t \t \t \t \t");
        /*
        \n significa que termina una línea y comienza otra más abajo a partir de ahí.
        \t significa que hay un espacio (equivale a presionar 'tab” en el teclado).
        */

        }
    
}
