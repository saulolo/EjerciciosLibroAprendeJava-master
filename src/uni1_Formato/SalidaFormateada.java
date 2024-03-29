package uni1_Formato;

public class SalidaFormateada {
    
    public static void main(String[] args) {
        
        //Para imprimir con formato
        System.out.printf("El número %d no tiene decimales. \n",21);
        System.out.printf("El número %f sale con decimales.\n", 21.0);
        System.out.printf("El %.3f sale exactamente con tres decimlaes. \n ",21.0);
        System.out.println("**************************************************");
        
        //Mezcla de salida de formatos
        System.out.println("Articulo         Precio/Caja        No cajas");
        System.out.println("---------------------------------------------");
        System.out.printf("%-10s       %8.2f       %6d\n", "manzanas", 4.5, 10);
        //la s quiere decir que se rellena con una cadena de caracteres
        System.out.printf("%-10s       %8.2f       %6d\n", "perad", 2.75, 120);
        System.out.printf("%-10s       %8.2f       %6d\n", "aguacates", 10.0, 6);
    }
    
}
