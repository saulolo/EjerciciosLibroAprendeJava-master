package Uni6_NumerosAleatorios;

/* todo: @author: Saulolo */

/* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5
oportunidades. Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y si el número
introducido es menor o mayor que el número secreto.
*/

import javax.swing.*;

public class Ejercicio6_3_6 {

    public static void main(String[] args) {

        System.out.println("ADIVINA EL NÚMERO");
        System.out.println("-----------------");

                                /* SOLUCIÓN 1 */

        System.out.println("SOLUCIÓN 1");
        System.out.println("===========================");

        String mensaje = "Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.";
        JOptionPane.showMessageDialog(null, mensaje);

        int numeroMisterioso = (int)(Math.random() * 100);
        int oportunidades = 5;
        boolean acertado = false;

         do {
             String inputAdivina = JOptionPane.showInputDialog("Ingresa el número a adivinar: ");
             Integer numeroIntroducido = Integer.parseInt(inputAdivina);
             oportunidades --;
             if ((numeroIntroducido > numeroMisterioso) && (oportunidades > 0)) {
                 System.out.println("El número que estoy pensando es menor que " + numeroIntroducido);
                 System.out.println("Te quedan " + oportunidades + " oportunidades.");
             }
             if ( (numeroIntroducido < numeroMisterioso) && (oportunidades > 0) ){
                 System.out.println("El número que estoy pensando es mayor que " + numeroIntroducido);
                 System.out.println("Te quedan " + oportunidades + " oportunidades.");
             }
             if (numeroIntroducido == numeroMisterioso) {
                 acertado = true;
                 System.out.println(" (>‿◠)✌, Genial!!! , Acertaste.");
             }
            } while (!acertado && (oportunidades > 0));

         if (!acertado) {
             System.out.println("(҂◡_◡)!!,Lo siento, no has acertado, el número que estaba pensando era el " + numeroMisterioso);
         }



                            /* SOLUCIÓN 2 */

        System.out.println("SOLUCIÓN 2");
        System.out.println("===========================");

        String intro = ("ADIVINA EL NÚMERO");
        JOptionPane.showMessageDialog(null, intro);
        System.out.println("------------------------------------");

        String mensaje2 = "Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.";
        JOptionPane.showMessageDialog(null, mensaje2);

        int numeroMisterioso2 = (int)(Math.random() * 100);
        int oportunidades2 = 5;
        boolean acertado2 = false;

        for (int i = 0; i < 5; i++) {
            String inputAdivina = JOptionPane.showInputDialog("Ingresa el número a adivinar: ");
            Integer numeroIntroducido2 = Integer.parseInt(inputAdivina);

            if (numeroIntroducido2 > numeroMisterioso2) {
                String mensaje3 = ("El número que estoy pensando es menor que " + numeroIntroducido2);
                JOptionPane.showMessageDialog(null, mensaje3);
            } else if (numeroIntroducido2 < numeroMisterioso2) {
                String mensaje4 = ("El número que estoy pensando es mayor que " + numeroIntroducido2);
                JOptionPane.showMessageDialog(null, mensaje4);
            } else {
                acertado2 = true;
                String mensaje5 = ("(>‿◠)✌, ¡Genial!, Acertaste.");
                JOptionPane.showMessageDialog(null, mensaje5);
                break;  // Salir del bucle si se acierta
            }

            String mensaje6 = ("Te quedan " + (oportunidades2 - i - 1) + " oportunidades.");
            JOptionPane.showMessageDialog(null, mensaje6);
        }

        if (!acertado2) {
            String mensaje7 = ("(҂◡_◡)!!, Lo siento, no has acertado. El número que estaba pensando era el " + numeroMisterioso2);
            JOptionPane.showMessageDialog(null, mensaje7);
        }

    }


}


























