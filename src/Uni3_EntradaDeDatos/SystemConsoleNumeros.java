package Uni3_EntradaDeDatos;

public class SystemConsoleNumeros {
    
    public static void main(String[] args) {
        
        
                    /* MÉTODO 1: CONSOLE.READLINE */
                          /*LECTURA DE NÚMEROS*/
         
        String numero;
        
        System.out.println("Por favor, introduce un primer  número: ");
        numero = System.console().readLine();
        int num1;
        num1 = Integer.parseInt(numero);
        
        System.out.println("Por favor, introduce un segundo número: ");
        numero = System.console().readLine();
        int num2;
        num2 = Integer.parseInt(numero);
        //las lineas 19, 20 y 21, se pueden acortar en una sola, asi:
        //int num2 = Integer.parseInt(System.console().readLine());
        
        int total;
        total = (2 * num1) + num2;
        
        System.out.println("El primer número introducido es: " + num1);
        System.out.println("El segundo numero introducido es: " + num2);
        System.out.println("El total de la operación es: " + total);
        
        
        
        /* VERIFICAR, NO ME QUIERE DAR el system.console,readLine y lo tengo 
        bueno, (en el reply si me da), Esto me respondieron ===> Por favor, usa 
        un Scanner en lugar de System.console().readLine(). Así te evitas estos 
        problemas. Normalmente System.console() devuelve null cuando lo ejecutas
        en un IDE. El método System.console().readLine() funciona bien en modo 
        consola (en una ventana de terminal) pero puede provocar problemas 
        cuando se trabaja con IDEs como Eclipse,Netbeans, JavaEdit, etc. Para 
        evitar estos problemas puedes usar la clase Scanner cuando necesites 
        recoger datos desde teclado. La clase Scanner funciona tanto en entornos
        integrados como en una ventana de terminal*/
        
    }
    
}
