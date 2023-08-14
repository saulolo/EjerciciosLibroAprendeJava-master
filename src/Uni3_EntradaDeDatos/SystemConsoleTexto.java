package Uni3_EntradaDeDatos;

public class SystemConsoleTexto {
    
    public static void main(String[] args) {
        
                    /* MÉTODO 1: CONSOLE.READLINE */
                          /*LECTURA DE TEXTO*/
        String nombre;
        System.out.print("Por favor, dime como te llamas: ");
        nombre = System.console().readLine();//metodo para ingresar datos desde
        // el usuario
        System.out.println("Hola " + nombre + " ,Encantado de conocerte!");
        
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
