package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_16 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Realiza un programa que nos diga si hay probabilidad de que nuestra 
        pareja nos está siendo infiel. El programa irá haciendo preguntas que el 
        usuario contestará con verdadero o falso. Cada pregunta contestada como 
        verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman 
        puntos. A continuación se listan las preguntas del test.
        1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo 
        aparente.
        2. Ha aumentado sus gastos de vestuario 
        3. Ha perdido el interés que mostraba anteriormente por ti
        4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora 
        se arregla el pelo y se asea con más frecuencia (si es mujer)
        5. No te deja que mires la agenda de su teléfono móvil
        6. A veces tiene llamadas que dice no querer contestar cuando estás tú
        delante
        7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
        8. Muchos días viene tarde después de trabajar porque dice tener mucho
        más trabajo
        9. Has notado que últimamente se perfuma más
        10. Se confunde y te dice que ha estado en sitios donde no ha ido 
        contigo
        A continuación se muestran los mensajes que deberá dar el programa según
        la puntuación obtenida.
        • Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
        fiel.
        • Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en 
        su vida o en su mente, aunque seguramente será algo sin importancia. No
        bajes la guardia.
        • Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para 
        estar viviendo un romance con otra persona. Te aconsejamos que indagues 
        un poco más y averigües que es lo que está pasando por su cabeza. */
        
        
        System.out.println("DETECCIÓN DE INFIDELIDAD");
        System.out.println("------------------------");
        
        String respuesta;
        int acomulador = 0;
        
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal "
                + "sin ningún motivo aparente. [v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3 ;
        }
        
        System.out.println("2. Ha aumentado sus gastos de vestuario. "
                + "[v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3;
        }
        
        System.out.println("3. Ha perdido el interés que mostraba anteriormente "
                + "por ti. [v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3 ;
        }
        
        System.out.println("4. Ahora se afeita y se asea con más frecuencia "
                + "(si es hombre) o ahora se arregla el pelo y se asea con más "
                + "frecuencia (si es mujer). [v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3 ;
        }
        
        System.out.println("5. No te deja que mires la agenda de su teléfono "
                + "móvil. [v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3 ;
        }
        
        System.out.println("6. A veces tiene llamadas que dice no querer "
                + "contestar cuando estás tú delante. [v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3 ;
        }
        
        System.out.println("7. Últimamente se preocupa más en cuidar la línea "
                + "y/o estar bronceado/a. [v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3 ;
        }
        
        System.out.println("8. Muchos días viene tarde después de trabajar "
                + "porque dice tener mucho más trabajo. [v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3 ;
        }
        
        System.out.println("9. Has notado que últimamente se perfuma más"
                + "[v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3 ;
        }
        
        System.out.println("10. Se confunde y te dice que ha estado en sitios "
                + "donde no ha ido contigo. [v:verdadero|f:falso]");
        respuesta = entrada.nextLine();
        if (respuesta.equals("v")) {
            acomulador = acomulador + 3 ;
        }
        
        
        
        if (acomulador <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser "
                    + "totalmente fiel."); 
        }
        
        if (acomulador > 10 && acomulador <= 22) {
            System.out.println(" Quizás exista el peligro de otra persona "
                    + "su vida o en su mente, aunque seguramente será algo sin "
                    + "importancia. No bajes la guardia."); 
        }
        
        if (acomulador > 22 && acomulador <= 30) {
            System.out.println(" Tu pareja tiene todos los ingredientes para "
                    + "estar viviendo un romance con otra persona. Te "
                    + "aconsejamos que indagues un poco más y averigües que es "
                    + "lo que está pasando por su cabeza."); 
        }
        
    }
    
}
