package uni1_Formato;

public class Ejercicio1_6_3 {
    
    public static void main(String[] args) {
        
        /*Escribe un programa que muestre por pantalla 10 palabras en inglés 
        junto a su correspondiente traducción al castellano. Las palabras deben 
        estar distribuidas en dos columnas y alineadas a la izquierda.*/
        
        
        /*El primer % indica que en esa posición se va a escribir un valor.
        El valor a escribir se encuetra despues de las comillas.
        .10 indica el número de decimales.
        La s indica que es de tipo string.
        \n indica un salto de linea (con printf tambien se puede usar un %n.S
        */ 
        System.out.println("PALABRA                    TRADUCCIÓN");
        System.out.println("-------------------------------------");
        System.out.printf("%-10s                   %6s\n", "Dog", "Perro");
        System.out.printf("%-10s                   %6s\n", "Cat", "Gato");
        System.out.printf("%-10s                   %6s\n", "Rabbit", "Conejo");
        System.out.printf("%-10s                   %6s\n", "Duck", "Pato");
        System.out.printf("%-10s                   %6s\n", "Donkey", "Burro");
        System.out.printf("%-10s                   %6s\n", "Monkey", "Mico");
        System.out.printf("%-10s                   %6s\n", "Goat", "Cabra");
        System.out.printf("%-10s                   %6s\n", "Sheep", "Oveja");
        System.out.printf("%-10s                   %6s\n", "Snake", "Serpiente");
        System.out.printf("%-10s                   %6s\n", "Bird", "Pajaro");
    }
    
}
