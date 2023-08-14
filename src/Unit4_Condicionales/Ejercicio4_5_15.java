package Unit4_Condicionales;

import java.util.Scanner;

public class Ejercicio4_5_15 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        /*Escribe un programa que pinte una pirámide rellena con un carácter 
        introducido por teclado que podrá ser una letra, un número o un símbolo 
        como *, +, -, $, &, etc. El programa debe permitir al usuario mediante
        un menú elegir si el vértice de la pirámide está apuntando hacia arriba,
        hacia abajo, hacia la izquierda o hacia la derecha.*/
        
        System.out.println("VÉRTICE DE LA PIRÁMIDE");
        System.out.println("----------------------");

        
        String asterisco;
        int tipo;
        
        System.out.println("Ingrese un símbolo: ");
        asterisco = entrada.nextLine();
        
        System.out.println("Elija un tipo de piramide: ");
        System.out.println("1: Vértice hacia arriba");
        System.out.println("2: Vértice hacia abajo");
        System.out.println("3: Vértice hacia la izquierda");
        System.out.println("4: Vértice hacia la derecha");
        tipo = entrada.nextInt();
        
        
        switch (tipo) {
            case 1:
                System.out.println("    " + asterisco);
                System.out.println("   " + asterisco + " " + asterisco);
                System.out.println("  " + asterisco + "   " + asterisco);
                System.out.println(" " + asterisco + " " + asterisco + " " + asterisco + " " + asterisco);
                break;
                
            case 2:
                System.out.println(" " + asterisco + " " + asterisco + " " + asterisco + " " + asterisco);
                System.out.println("  " + asterisco + "   " + asterisco);
                System.out.println("   " + asterisco + " " + asterisco);
                System.out.println("    " + asterisco);
                break;
            
            case 3:
                System.out.println("         " + asterisco);
                System.out.println("      " + asterisco + "  " + asterisco );
                System.out.println("   " + asterisco + "     " + asterisco);
                System.out.println("" + asterisco + "        " + asterisco);
                System.out.println("   " + asterisco + "     " + asterisco);
                System.out.println("      " + asterisco + "  " + asterisco);
                System.out.println("         " + asterisco);
                break;
                
            case 4:
                System.out.println("  " + asterisco);
                System.out.println("  " + asterisco + "  " + asterisco);
                System.out.println("  " + asterisco + "     " + asterisco);
                System.out.println("  " + asterisco + "        " + asterisco);
                System.out.println("  " + asterisco + "     " + asterisco);
                System.out.println("  " + asterisco + "  " + asterisco);
                System.out.println("  " + asterisco);
                break;
                
            default:
              
        }
    }
}
