package Unit5_Bucles;

import javax.swing.*;

/* todo: @author: Saulolo */

/* El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que encuentre).
Realiza un programa que muestre un número antes y después de haber sido comido por el gusano. Si el animalito no
se ha comido ningún dígito, el programa debe indicarlo.

Ejemplo 1:
Introduzca un número entero (mayor que cero): 51803458
Después de haber sido comido por el gusano numérico se queda en 51345

Ejemplo 2:
Introduzca un número entero (mayor que cero): 29614
El gusano numérico no se ha comido ningún dígito.

*/

public class Ejercicio5_4_51 {

    public static void main(String[] args) {

        System.out.println("EL GUSANITO COMELÓN");
        System.out.println("--------------------");

        String inputNumero = JOptionPane.showInputDialog("Introduzca un número entero (mayor que cero): ");
        int numeroIntroducido = Integer.parseInt(inputNumero);

        int numero = numeroIntroducido;
        int volteado = 0;
        boolean numeroComido = false;

        while (numero > 0) {
            if ((numero % 10 != 0) && (numero % 10 != 8)) {
                volteado = (volteado * 10) + (numero % 10);
            } else {
                numeroComido = true;
            }
            numero /= 10;
        }

        numero = volteado;
        volteado = 0;

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }

        if (numeroComido) {
            System.out.print("Después de haber sido comido por el gusano numérico");
            System.out.println(" se queda en " + volteado + ".");
        } else {
            System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }
    }
}
















