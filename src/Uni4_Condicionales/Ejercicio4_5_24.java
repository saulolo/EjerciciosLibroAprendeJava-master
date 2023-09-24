package Uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_24 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa que genere la nómina (bien desglosada) de un 
        empleado según las siguientes condiciones:
        • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 
        3 - Jefe de proyecto), los días que ha estado de viaje visitando 
        clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
        • El sueldo base según el cargo es de 950, 1200 y 1600 euros según si 
        se trata de un prog. junior, un prog. senior o un jefe de proyecto 
        respectivamente.
        • Por cada día de viaje visitando clientes se pagan 30 euros extra en 
        concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
        un 25% en caso de estar soltero y un 20% en caso de estar casado.
        
        Ejemplo:
        1 - Programador junior
        2 - Prog. senior
        3 - Jefe de proyecto
        Introduzca el cargo del empleado (1 - 3): 2
        ¿Cuántos días ha estado de viaje visitando clientes? 5
        Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
        ----------------------------------
        | Sueldo base 1200,00 |
        | Dietas ( 5 viajes) 150,00 |
        |--------------------------------|
        | Sueldo bruto 1350,00 |
        | Retención IRPF (20%) 270,00 |
        |--------------------------------|
        | Sueldo neto 1080,00 |
        ----------------------------------
        */
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("NÓMINA DE UN EMPLEADO");
        System.out.println("---------------------");
        
        int cargo;
        int visita;
        int eCivil;
        double sueldoBase = 0;
        final double valorDia = 30;
        double dieta;
        double sueldoBruto;
        double IRPF = 0;
        double retencion;
        double sueldoBrutoDcto;
        double sueldoTotal;
        

        System.out.println("Ingrese el cargo a desempeñar [1.Prog. junior | "
                + "2.Prog. senior, | 3.Jefe de proyecto]: " );
        cargo = entrada.nextInt();

        System.out.println("Indique el número de dias en el mes, que estuvo "
                + "visitando el cliente: " );
        visita = entrada.nextInt();
        
        System.out.println("Indique su estado civil [1.Soltero | 2.Casado]: " );
        eCivil = entrada.nextInt();
        
        switch (cargo) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        
        switch (eCivil) {
            case 1:
                IRPF = 0.25;
                break;
            case 2:
                IRPF = 0.20;
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
        System.out.println("----------------------------------");
        System.out.println("| SUELDO BASE " + sueldoBase + " €|");
        
        dieta = visita * valorDia;
        
        System.out.println("| DIETAS " + visita + " VIAJES " + dieta + " €|");
        System.out.println("----------------------------------");
        
        sueldoBruto = sueldoBase + dieta;
        
        System.out.println("| SUELDO BRUTO " + sueldoBruto + " €|");
        System.out.println("----------------------------------");
        
        sueldoBrutoDcto = sueldoBruto * IRPF;
        
        System.out.println("| RETENCIÖN IRPF " + IRPF * 100 + "% " + sueldoBrutoDcto + " €|");
        System.out.println("----------------------------------");
        
        sueldoTotal = sueldoBruto - sueldoBrutoDcto; 
                 
        System.out.println("| SUELDO NETO " + sueldoTotal + " €|");
        
        System.out.println("----------------------------------");
        
    }
    
}
