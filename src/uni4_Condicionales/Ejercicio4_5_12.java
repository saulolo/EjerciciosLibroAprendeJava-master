package uni4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /*Realiza un minicuestionario con 10 preguntas tipo test sobre las 
        asignaturas que se imparten en el curso. Cada pregunta acertada sumará 
        un punto. El programa mostrará al final la calificación obtenida. Pásale 
        el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué
        tal andan de conocimientos en las diferentes asignaturas del curso.*/
       
        System.out.println("CUESTIONARIO ASIGNATURAS");
        System.out.println("------------------------");
        
        
        int respuesta;
        int acomulador = 0;
        
        
        System.out.println("ASIGNATURA PROGRAMACIÓN");

        System.out.println("1. ¿Los objetos en programación se usan para moderar"
                + "  entidades del mundo real? [1:verdadero/0:falso]"
                + "(verdadero)");
        respuesta = entrada.nextInt();
        if (respuesta == 1) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste"); 
            
        }
        
        System.out.println("2. ¿La estructura switch es una sentencia " 
                + " condicional? [1:verdadero/0:falso]");
        respuesta = entrada.nextInt();
        if (respuesta == 1) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste");
        }
        
        System.out.println("3. ¿El lenguaje de programación de Java, fue"
                + " adquirido por oracle? [1:verdadero/0:falso])");
        respuesta = entrada.nextInt();
        if (respuesta == 1) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste");
        }
        
        System.out.println("4. ¿Java es un lenguaje de programación cuyo "
                + "paradigma esta orientado a objetos? [1:verdadero/0:falso]");
        respuesta = entrada.nextInt();
        if (respuesta == 1) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste");
        }
        
        System.out.println("5. ¿Visual Studio Code, IntelliJ y NetBeans, "
                + "son lenguajes de programación? [1:verdadero/0:falso]");
        respuesta = entrada.nextInt();
        if (respuesta == 0) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste");
        }
        
        System.out.println("6. ¿Java es un lenguaje de programación interpretado?"
                + " [1:verdadero/0:falso]");
        respuesta = entrada.nextInt();
        if (respuesta == 0) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste");
        }
        
        System.out.println("7. ¿NetBeans es un IDE pensado principalmente "
                + "solo para Java [1:verdadero/0:falso]");
        respuesta = entrada.nextInt();
        if (respuesta == 1) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste");
        }
        
        System.out.println("8. ¿Estos son algunos operadores lógicos: =, <>,"
                + ">= ? [1:verdadero/0:falso]");
        respuesta = entrada.nextInt();
        if (respuesta == 0) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste");
        }
        
        System.out.println("9. ¿La POO se popularizó a principios de la decada"
                + "de 1990? [1:verdadero/0:falso]");
        respuesta = entrada.nextInt();
        if (respuesta == 1) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste");
        }
       
        System.out.println("10. ¿James Gosling no fue el desarrollador de Java? "
                + "[1:verdadero/0:falso]");
        respuesta = entrada.nextInt();
        if (respuesta == 0) {
            acomulador++;
            System.out.println("Correcto");
        } else {
            System.out.println("Fallaste");
        }
        
      
        System.out.println("Has obtenido ==> " + acomulador + " de 10 puntos"
                + " máximos posibles");
        
        if (acomulador == 10) {
            System.out.println("¡WAO, PUNTUACIÓN PERFECTA!");
        }
        else if (acomulador >= 6 && acomulador <=9) {
            System.out.println("¡GANASTE, estas hecho para esto!");
        }
        else{
            System.out.println("Perdiste, vuelve a intentarlo");
        }
        
        
        
        System.out.println("================================================");
        System.out.println(" ");
        
        
        System.out.println("CUESTIONARIO ASIGNATURAS # 2");
        System.out.println("----------------------------");
        
        int puntos = 0;
        String answer;

        System.out.println("CUESTIONARIO DE 1º DAM");

        System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
        System.out.println("a) int\nb) double\nc) float");
        System.out.print("=> ");
        answer = entrada.nextLine();
        if (answer.equals("b")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
        System.out.println("a) XML\nb) SELECT\nc) SQL");
        System.out.print("=> ");
        answer = entrada.nextLine();
        if (answer.equals("c")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
        System.out.println("a) href\nb) a\nc) link");
        System.out.print("=> ");
        answer = entrada.nextLine();
        if (answer.equals("b")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
        System.out.println("a) /etc\nb) /config\nc) /cfg");
        System.out.print("=> ");
        answer = entrada.nextLine();
        if (answer.equals("a")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
        System.out.println("a) RAM\nb) EPROM\nc) ROM");
        System.out.print("=> ");
        answer = entrada.nextLine();
        if (answer.equals("a")) {
            puntos++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("\nHa obtenido " + puntos + " puntos.");

    }
}
