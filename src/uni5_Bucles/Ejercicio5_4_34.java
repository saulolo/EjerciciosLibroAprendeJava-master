package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los
dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera: primer dígito del primer
número, primer dígito del segundo número, segundo dígito del primer número, segundo dígito del segundo número,
tercer dígito del primer número… Para facilitar el ejercicio, podemos suponer que el usuario introducirá dos
números de la misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de int
donde sea necesario para admitir números largos.

Ejemplo 1:
Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97

Ejemplo 2:
Por favor, introduzca un número: 137
Introduzca otro número: 909
El número formado por los dígitos pares es 0
El número formado por los dígitos impares es 19379
*/

public class Ejercicio5_4_34 {

    public static void main(String[] args) {

        System.out.println("MOSTRANDO DIGITOS PARES E IMPARES DE DOS NÚMEROS INTERCALANDOLOS");
        System.out.println("----------------------------------------------------------------");

        String inputNum1 = JOptionPane.showInputDialog("Por favor, introduzca un número: ");
        long primerNumero = Long.parseLong(inputNum1);

        String inputNum2 = JOptionPane.showInputDialog("Introduzca otro número: ");
        long segundoNumero = Long.parseLong(inputNum2);

        long numeroPares = 0;
        long numeroImpares = 0;

        while ((primerNumero > 0) || (segundoNumero > 0)) {
            int digito1 = (int) (primerNumero % 10);
            if (digito1 % 2 == 0) {
                numeroPares = numeroPares * 10 + digito1;
            } else {
                numeroImpares = numeroImpares * 10 + digito1;
            }
            primerNumero = primerNumero / 10;

            int digito2 = (int) (segundoNumero % 10);
            if (digito2 % 2 == 0) {
                numeroPares = numeroPares * 10 + digito2;
            } else {
                numeroImpares = numeroImpares * 10 + digito2;
            }
            segundoNumero = segundoNumero / 10;
        }

        System.out.println("El número formado por los dígitos pares es " + numeroPares);
        System.out.println("El número formado por los dígitos impares es " + numeroImpares);
    }

}




