//Programa para declarar y pedir todos los tipos de variables en java
import java.util.Scanner; 
public class Operadoresr{  
    public static void main (String[]args){ 
        //Inicia la declaración de variables y la asignación de su valor 

        int entero = 10000; 
        byte bytes = 120;
        short shorts = 20000;
        long longs =  3000000;
        float flotante = 8;
        double doubles= 9.56;
        char caracter = 'a';
        String cadena = "Hola Mundo";
        boolean booleanos = true;

        //Inicia la impresión de las variables 
        System.out.println("tipo de dato entero: " + entero); 
        System.out.println("tipo de dato byte: " + bytes); 
        System.out.println("tipo de dato short: " + shorts); 
        System.out.println("tipo de dato long: " + longs); 
        System.out.println("tipo de dato flotante: " + flotante); 
        System.out.println("tipo de dato double: " + doubles); 
        System.out.println("tipo de dato caracter: " + caracter); 
        System.out.println("tipo de dato string: " + cadena); 
        System.out.println("tipo de dato booleano: " + booleanos); 

        //Clase escáner para ingresar datos por consola 
        Scanner sc = new Scanner (System.in); 

        //Se escribe el código para solicitar todos los tipos de variables, es diferente para cada una
        System.out.println("Ingresa un nuevo valor para el valor entero: "); 
        entero = sc.nextInt(); 
        System.out.println("El nuevo valor de la variable entero es: " + entero); 
        System.out.println("Ingresa un nuevo valor para el valor bytes: "); 
        bytes = sc.nextByte(); 
        System.out.println("El nuevo valor de la variable bytes es: " + bytes); 
        System.out.println("Ingresa un nuevo valor para el valor shorts: "); 
        shorts = sc.nextShort(); 
        System.out.println("El nuevo valor de la variable shorts es: " + shorts); 
        System.out.println("Ingresa un nuevo valor para el valor longs: "); 
        longs = sc.nextLong(); 
        System.out.println("El nuevo valor de la variable longs es: " + longs); 
        System.out.println("Ingresa un nuevo valor para el valor flotante: "); 
        flotante = sc.nextFloat(); 
        System.out.println("El nuevo valor de la variable flotante es: " + flotante); 
        System.out.println("Ingresa un nuevo valor para el valor doubles: "); 
        doubles = sc.nextDouble(); 
        System.out.println("El nuevo valor de la variable doubles es: " + doubles); 
        System.out.println("Ingresa un nuevo valor para el valor caracter: "); 
        caracter = sc.next().charAt(0); 
        System.out.println("El nuevo valor de la variable caracter es: " + caracter); 
        System.out.println("Ingresa un nuevo valor para la cadena: "); 
        cadena = sc.nextLine(); 
        System.out.println("El nuevo valor de la caneda es: " + cadena); 
        System.out.println("Ingresa un nuevo valor para el valor booleanos: "); 
        booleanos = sc.nextBoolean();
        System.out.println("El nuevo valor de la variable booleanos es: " + booleanos);
    }
}
// Rubén C.G.