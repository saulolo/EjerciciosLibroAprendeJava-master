package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_21 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        /*Calcula la nota de un trimestre de la asignatura Programación. El 
        programa pedirá las dos notas que ha sacado el alumno en los dos 
        primeros controles. Si la media de los dos controles da un número mayor 
        o igual a 5, el alumno está aprobado y se mostrará la media. En caso de 
        que la media sea un número menor que 5, el alumno habrá tenido que hacer
        el examen de recuperación que se califica como apto o no apto, por 
        tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la 
        recuperación? (apto/no apto). Si el resultado de la recuperación es 
        apto, la nota será un 5; en caso contrario, se mantiene la nota media 
        anterior.
        
        Ejemplo 1:
        Nota del primer control: 7
        Nota del segundo control: 10
        Tu nota de Programación es 8.5
        
        Ejemplo 2:
        Nota del primer control: 6
        Nota del segundo control: 3
        ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
        Tu nota de Programación es 5
        
        Ejemplo 3:
        Nota del primer control: 6
        Nota del segundo control: 3
        ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
        Tu nota de Programación es 4.5*/
        
        System.out.println("PROMEDIO NOTA CON RECUPERACIÓN");
        System.out.println("------------------------------");
        
        double nota1;
        double nota2;
        double promedio;
        String recuperacion;
        
        System.out.println("Ingresa la primera nota obtenida: ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Ingresa la segunda nota obtenida: ");
        nota2 = entrada.nextDouble();
        
        promedio = (nota1 + nota2) / 2;
        
        
        if (promedio >= 5) {
            System.out.println("Aprobado");
            System.out.println("Tu nota de programación es: " + promedio);
        }
        else {
            System.out.println("Debe de hacer examen de recuperadción");
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            recuperacion = entrada2.nextLine();
            if (recuperacion.equals("apto")) {
                System.out.println("Tu nota de Programación es 5");
            } 
            else if (recuperacion.equals("no apto")){
                System.out.println("Tu nota de Programación es " + promedio);
            }

        }

    }

}
