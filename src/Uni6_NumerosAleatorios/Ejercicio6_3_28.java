package Uni6_NumerosAleatorios;

import javax.swing.*;


/* todo: @author: Saulolo */

/* Realiza un programa que sea capaz de recolocar los números de un array de fuera hacia adentro. En primer
lugar, el programa pedirá al usuario el tamaño del array. A continuación generará un array con ese tamaño con
números enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa irá colocando desde fuera
hacia adentro los números de tal forma que el primero se coloca en la primera posición, el segundo en la última,
el tercero en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la antepenúltima, etc.
Se debe mostrar por pantalla tanto el array original como el array resultado.

Ejemplo 1:
Introduzca el tamaño del array: 12
Array original:
Índice 0 1 2 3 4 5 6 7 8 9 10 11
Valor 120 148 40 108 188 94 60 65 152 27 121 79
Array resultado:
Índice 0 1 2 3 4 5 6 7 8 9 10 11
Valor 120 40 188 60 152 121 79 27 65 94 108 148

Ejemplo 2:
Introduzca el tamaño del array: 7
Array original:
Índice 0 1 2 3 4 5 6
Valor 130 36 93 188 20 126 36
Array resultado:
Índice 0 1 2 3 4 5 6
Valor 130 93 20 36 126 188 36

*/


public class Ejercicio6_3_28 {

    public static void main(String[] args) throws InterruptedException {

        String into = ("RECOLECTANDO NÚMEROS DE UN ARRAY");
        JOptionPane.showMessageDialog(null, into);




    }
    
}

