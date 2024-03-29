package uni4_Condicionales;

import java.util.Scanner;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
                    
                           /* OPERADORES LÓGICOS */
                           
/*Los operadores de comparación se pueden combinar con los operadores lógicos. 
Por ejemplo, si queremos saber si la variable a es mayor que b y además es menor
que c, escribiríamos if ((a > b) && (a < c)).
                           
OPERADOR     NOMBRE       EJEMPLO            DEVUELVE VERDADERO CUANDO…
   &&          y     (7 > 2) && (2 < 4)  las dos condiciones son verdaderas
   ||          o     (7 > 2) || (2 < 4)  al menos una de las condiciones es verdadera
    !          no         !(7 > 2)                 la condición es falsa    
                           
                           
                              //Tabla de Verdad
            A        B       A && B          A || B      !A         !B
            V        V          V               V         F          F
            V        F          F               V         F          V
            F        V          F               V         V          F
            F        F          F               F         V          V                       
                           

*/
    /*Ejemplo 1: Detectar los números que no están en el rango de 1 a 100;
    literalmente sería “si n es menor que 1 o n es mayor que 100”.
    Adivina el número que estoy pensando*/
    
        int numero;
    
        System.out.println("ADIVINA EL NÚMERO QUE PIENSO");
        System.out.println("Introduce un número del 1 al 100");
        numero = entrada.nextInt();
        
        if (numero < 1 || numero > 100) {
            System.out.println("El número introducido debe de estar entre 1 y 100");
            System.out.println("Tienes otro intento, Vuelve a introducir un número");
            numero = entrada.nextInt();
        }
        if (numero == 13) {
            System.out.println("¡Felicitaciones!, has adivinado");
        }
        else {
            System.out.println("Lo siento, ese no es el número");  
        }
        
        System.out.println("=================================================");
        
        /*Ejemplo 2: Adivina el resultado de los operadores de comparación*/
        
        boolean a = true;
        boolean b = false;
        
        System.out.println("a = " + a); //v
        System.out.println("b = " + b); //f
        System.out.println("a && b = " + (a && b)); //f
        System.out.println("a || b = " + (a || b)); //v
        System.out.println("!a = " + !a); //f
        System.out.println("a || (6 > 10) = " + (a || (6 > 10))); //v
        System.out.println("((4 <= 4) || (false) && (!a) = " + ((4 <= 4) || (false) && (!a))); //v 
    }
}
