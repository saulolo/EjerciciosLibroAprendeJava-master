package Uni1_Formato;

public class Ejercicio1_6_5 {
    
    public static void main(String[] args) {
       
        /*
        Modifica el programa anterior (164) añadiendo colores. Puedes mostrar 
        cada asignatura de un color diferente.
        */
        
        //Para colorear cada salida lo mejor es hacer usos de variables
        //y lamarlas en el codigo
        String amarillo2 = "\033[33m";
        String verde2 = "\033[32m";
        String rojo2 = "\033[31m";
        String fucsia2 = "\033[35m";
        
        System.out.println("\n\033[34m HORA\tLUNES\tMARTES\tMIERC.\tJUEVES\tVIERNES\tSABADO");
        System.out.println(" ======\t=======\t======\t=======\t=======\t=======\t=======");
        System.out.println(amarillo2 + " 8-9\t" + "\t \t \t \t" + rojo2 +  "\tHabil.");
        System.out.println(amarillo2 + " 18-20\t" + verde2 +  "\tProg. \tProg. \tProg. \tProg. \t");
        System.out.println(amarillo2 + " 20-22\t" + fucsia2 + "\tIng. \t \tIng. \t \t");
        System.out.println(amarillo2 + " 22-24\t \t \t \t \t \t");
        System.out.println("------------------------------------------------------------\n");
        
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";

        System.out.println(naranja + "\n Lunes\tMartes\tMiérc.\tJueves\tViernes");
        System.out.println(" ======\t=======\t======\t======\t=======");
        System.out.println(verde + " PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
        System.out.println(verde + " PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
        System.out.println(celeste + " ED" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
        System.out.println(naranja + " FOL" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
        System.out.println(naranja + " FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
        System.out.println(naranja + " FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");

    }
    
}
