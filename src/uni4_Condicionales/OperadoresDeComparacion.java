package uni4_Condicionales;

import java.util.Scanner;

public class OperadoresDeComparacion {
    
    public static void main(String[] args) {
        
                    /* OPERADORES DE COMPARACIÓN */
/*
        OPERADOR     NOMBRE             EJEMPLO      DESCRIPCIÓN
           ==        igual              a == b       a es igual a b
           !=        distinto           a != b       a es distinto de b
            <        menor que          a < b        a es menor que b
            >        mayor que          a > b        a es mayor que b
           <=     menor o igual que     a < = b      a es menor o igual que b
           >=     mayor o igual que     a > = b      a es mayor o igual que b
*/ 
        
        /*Ejemplo 1: El usuario introduce una nota; si esta nota es mayor o 
        igual a 3 se le mostrará un mensaje diciendo que ha aprobado y en caso 
        de que no se cumpla la condición se mostrará un mensaje diciendo que 
        está suspenso.*/
        
        Scanner entrada = new Scanner(System.in);
        
        double nota;
        
        System.out.println("Introduce tu nota: ");
        nota = entrada.nextDouble();
        
        if (nota >= 3){
            System.out.println("Felicitaciones, ¡has aprobado! ");
        }
        else {
            System.out.println("Lo siento, has suspendido."); 
        }  
    }
}
