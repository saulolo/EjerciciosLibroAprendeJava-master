package uni5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se
le suma 1 si es par y se le resta 1 si es impar. Usa long en lugar de int donde sea necesario para admitir números
largos.

Ejemplo 1:
Por favor, introduzca un número: 9402
Dislocando el 9402 sale el 8513.

Ejemplo 2:
Por favor, introduzca un número: 870958422
Dislocando el 870958422 sale el 961849533.

Ejemplo 3:
Por favor, introduzca un número: 137
Dislocando el 137 sale el 26

*/

public class Ejercicio5_4_68 {

    public static void main(String[] args) {

        System.out.println("DISLOCANDO UN NÚMERO");
        System.out.println("--------------------");

        String inputNumero = JOptionPane.showInputDialog("Por favor, introduzca un número: ");
        Long numero = Long.parseLong(inputNumero);

        long copia = numero;

        long resultado = 0;
        int cuentaDigitos = 0;

        while (numero > 0) {
            int digito = (int) (numero % 10);
            int nuevoDigito = digito % 2 == 1 ? --digito : ++digito;
            resultado = (long) (nuevoDigito * Math.pow(10, cuentaDigitos) + resultado);
            numero /= 10;
            cuentaDigitos++;
        }

        System.out.println("Dislocando el " + copia + " sale el " + resultado);
    }

}
























