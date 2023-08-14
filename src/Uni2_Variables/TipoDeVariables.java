package Uni2_Variables;

public class TipoDeVariables {
    
    public static void main(String[] args) {
        
        /*
        TIPO    DESCRIPCIÓN          TAMAÑO     EJEMPLO
        boolean verdadero o falso    1 bit      boolean abierto = true
        byte    número entero        8 bits     byte repeticiones = 22
        char    carácter 1           6 bits     char letra = ‘a’
        short   número entero        16 bits    short pantalones = 22
        int     número entero        32 bits    int asistentes = 22
        long    número entero        64 bits    long poblacion = 22L
        float   número con decimales 32 bits    float nota = 9.5f
        double  número con decimales 64 bits    double precio = 22.55d
        */
        
        //CASTING
        int x = 12;
        int z = 7;
        float division;
        
        division = (float)x / (float)z;
        
        System.out.println("La division entre " + x + " y " + z + " es: " + division);

        
        


        
    }
    
}
