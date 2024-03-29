package uni5_Bucles;

import javax.swing.*;

/* @author: Saulolo */
public class Ejercicio5_4_25 {

    public static void main(String[] args) {

        /*Realiza un programa que pida un número por teclado y que luego muestre
        ese número al revés.:
         */
        System.out.println("NÚMERO IMPRESO AL REVÉS");
        System.out.println("-----------------------");

        String input = JOptionPane.showInputDialog("Introduce un número: ");
        int numeroIntroducido = Integer.parseInt(input);


        //Otra forma pedir datos
/*        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numeroIntroducido = input.nextInt();*/

        int numero = numeroIntroducido;
        int volteado = 0;

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        } //While

        System.out.println("Si le damos la vuelta al " + numeroIntroducido);
        System.out.println(" tenemos el  " + volteado + ".");

    }

}
