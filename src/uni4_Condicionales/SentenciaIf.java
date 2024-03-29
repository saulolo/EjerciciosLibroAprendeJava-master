package uni4_Condicionales;

import java.util.Scanner;

public class SentenciaIf {
    
    public static void main(String[] args) {
        
        
                                   /* SENTENCIA IF */
       
        /*La sentencia if permite la ejecución de una serie de instrucciones en 
        función del resultado de una expresión lógica. El resultado de evaluar 
        una expresión lógica es siempre verdadero (true) o falso (false). 
        Es muy simple, en lenguaje natural sería algo como ”si esta condición 
        es verdadera entonces haz esto, sino haz esto otro”.*/
        
        /*Ejemplo1: ¿Podrías adivinar cuál es el resultado del programa? 
        Efectivamente, se muestra la palabra “iguales” ya que la comparación 
        "naranja".equals(miFruta) devuelve true y, por , se ejecuta el primer 
        bloque te código, o sea, System.out.println("iguales");.*/
        
        String miFruta = "Naranja";
        
        if ("Naranja".equals(miFruta)){
            System.out.println("Iguales");   
        }
        else {
            System.out.println("distintas");
        }
        System.out.println("=================================================");
        
        /*Ejemplo 2: Se trata de una especie de juego al estilo de “La ruleta 
        de la fortuna” en el que el usuario debe responder a la pregunta que le 
        hace el ordenador.*/
        
        Scanner entrada = new Scanner(System.in);
        
        String capital = "Bogota";
        
        System.out.println("¿Cual es la capital de Colombia?");
        capital = entrada.nextLine();
        
        if (capital.equals("Medellin")){
            System.out.println("Eso es Correcto!!!");
        }
        else {
            System.out.println("Te equivocaste");
        }
        
        
        /*En el programa se le pregunta al usuario cuál es la capital de 
        Colombia. La respuesta introducida por el usuario se almacena en la 
        variable capital. A continuación viene la sentencia condicional if.
        
        if (respuesta.equals("Medellin")) 
        
        Llegado a este punto, el programa evalúa la expresión 
        respuesta.equals("Medellin"). Observa que para comparar dos cadenas de 
        caracteres se utiliza equals(). Imaginemos que el ha introducido por 
        teclado Madrid; entonces la expresión "Madrid".equals("Bogota") daría 
        como resultado false (falso). Si la expresión hubiera dado como 
        resultado true (verdadero), se ejecutaria la línea: 
        
        System.out.println("¡La respuesta es correcta!"); 
        
        pero no es el caso, el resultado de la expresión ha sido false (falso), 
        todo el mundo sabe que la capital de Colombia no es Madrid, por tanto 
        se ejecutaría la línea:
        
        System.out.println("Lo siento, la respuesta es incorrecta.");
        */
        
        System.out.println("=================================================");
        
        
        /*Ejemplo 3:El usuario introducirá un número por teclado y el programa 
        dirá si se trata de un número positivo o negativo.*/
        
        int numero;
        
        System.out.println("Por favor introduce un número");
        numero = entrada.nextInt();
        
        if (numero > 0){
            System.out.println("El número " + numero + " es positivo");
        }
        else 
            System.out.println("El numero " + numero + " es negativo");
        
        
        /*El siguiente bloque de código:
        
        if (numero > 0){
            System.out.println("El número " + numero + " es positivo");
        }
        else 
            System.out.println("El numero " + numero + " es negativo");
        
        compilaría y funcionaría sin problemas - fíjate que hemos quitado las 
        llaves (tambien llamadas llaves egipcias) - ya que antes y después 
        del else hay una sola sentencia y en  estos casos no es obligatorio 
        poner llaves. Sin embargo, nosotros  siempre usaremos llaves, es una 
        exigencia del estándar de Google al que  nos ceñimos en este manual.*/
        
    }   
}
