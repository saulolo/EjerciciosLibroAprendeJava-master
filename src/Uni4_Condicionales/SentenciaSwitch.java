package Uni4_Condicionales;

import java.util.Scanner;

public class SentenciaSwitch {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
                        /* SENTENCIA SWITCH */
                        
    /* A veces es necesario comparar el valor de una variable con una serie de 
    valores concretos. La selección múltiple es muy parecida (aunque no es 
    exactamente igual) a una secuencia de varias sentencias if.
                        
    El formato de switch es el que se muestra a continuación. En lenguaje 
    natural sería algo así como “Si variable vale valor1 entonces entra por case
    valor1:, si variable vale valor2 entonces entra por case valor2:,… si 
    variable no vale ninguno de los valores que hay en los distintos case 
    entonces entra por default:. 
                        
    Observa que es necesario introducir un break después de la asignación de la 
    variable. En caso de no encontrarse el break, el programa continúa la 
    ejecución en la línea siguiente.
                        
    El bloque que corresponde al default se ejecuta cuando la variable no 
    coincide con ninguno de los valores de los case. Escribiremos siempre el 
    default al final de la sentencia switch aunque no sea necesario.
    
    La sentencia switch se utiliza con frecuencia para crear menús.*/

    /*Ejemplo 1: Se pide al usuario un número de mes y el programa da el nombre 
    del mes que corresponde a ese número.*/
    
        int mes;
    
        System.out.println("Ingresa el número de mes (1 - 12) a buscar: ");
        mes = entrada.nextInt();
        
        switch (mes) {
            case 1:
                System.out.println("El mes " + 1 + " corresponde a Enero");
                break;
            case 2:
                System.out.println("El mes " + 2 + " corresponde a Febrero");
                break;
            case 3:
                System.out.println("El mes " + 3 + " corresponde a Marzo");
                break;
            case 4:
                System.out.println("El mes " + 4 + " corresponde a Abril");
                break;
            case 5:
                System.out.println("El mes " + 5 + " corresponde a Mayo");
                break;
            case 6:
                System.out.println("El mes " + 6 + " corresponde a Junio");
                break;
            case 7:
                System.out.println("El mes " + 7 + " corresponde a Julio");
                break;
            case 8:
                System.out.println("El mes " + 8 + " corresponde a Agosto");
                break;
            case 9:
                System.out.println("El mes " + 9 + " corresponde a Septiembre");
                break;
            case 10:
                System.out.println("El mes " + 10 + " corresponde a Octubre");
                break;
            case 11:
                System.out.println("El mes " + 11 + " corresponde a Noiviembre");
                break;
            case 12:
                System.out.println("El mes " + 12 + " corresponde a Diciembre");
                break;
            default:
                System.out.println("No existe");
        }
        
        
        System.out.println("=================================================");
        
        /*Ejemplo 2: el mismo que el anterior pero de otra forma.*/
        
        int month;
        String nombreDelMes;
        
        System.out.println("Ingresa el número de mes (1 - 12) a buscar: ");
        month = entrada.nextInt();
        
        switch(month) {
            case 1:
                nombreDelMes = "Enero";
                break;
            case 2:
                nombreDelMes = "Febrero";
                break;
            case 3:
                nombreDelMes = "Marzo";
                break;
            case 4:
                nombreDelMes = "Abril";
                break;
            case 5:
                nombreDelMes = "Mayo";
                break;
            case 6:
                nombreDelMes = "Junio";
                break;
            case 7:
                nombreDelMes = "Julio";
                break;
            case 8:
                nombreDelMes = "Agosto";
                break;
            case 9:
                nombreDelMes = "Septiembre";
                break;
            case 10:
                nombreDelMes = "Octubre";
                break;
            case 11:
                nombreDelMes = "Noviembre";
                break;
            case 12:
                nombreDelMes = "Diciembre";
                break;
            default:
                nombreDelMes = "No existe";        
        }
        System.out.println("El Mes " + month + " Equivale a: "+ nombreDelMes);
        
        
        
        System.out.println("=================================================");
        
        
        /*Ejemplo 3: Crear un menú con Switch.*/
        
        System.out.println("CÁLCULO DE AREAS");
        System.out.println("----------------");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("Elija una opción (1 - 3)");
        
        int opcion;
        double lado;
        double base;
        double altura;
        double areaCuadrado;
        double areaRectangulo;
        double areaTriangulo;
        
        opcion = entrada.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("Ingrese el lado del Cuadrado");
                lado = entrada.nextDouble();
                areaCuadrado = lado * lado;
                System.out.println("El área de Cuadrado = " + areaCuadrado + " cm2");
                break;
            case 2:
                System.out.println("Ingrese la base del Rectángulo");
                base = entrada.nextDouble();
                System.out.println("Ingrese la altura del Rectángulo");
                altura = entrada.nextDouble();
                areaRectangulo = base * altura;
                System.out.println("El área de Rectángulo = " + areaRectangulo + " cm2");
                break;
            case 3:
                System.out.println("Ingrese la base del Triángulo");
                base = entrada.nextDouble();
                System.out.println("Ingrese la altura del Triángulo");
                altura = entrada.nextDouble();
                areaTriangulo = (base * altura) / 2;
                System.out.println("El área de Triángulo = " + areaTriangulo + " cm2");
                break;
            default:
                System.out.println("Opción no válida");    
        }
    }
}
