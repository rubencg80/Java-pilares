// Programa para determinar el número de vacaciones de trabajadores
import java.util.Scanner;
public class Vacaciones{
    public static void main (String [] args){
        // Se declaran las variables y el Scanner
        String nombre;
        int clave;
        int antiguedad;
        Scanner sc = new Scanner (System.in);
        // Entrada de datos
        System.out.println("Bienvenido al sistema");
        System.out.println("¿Cuál es el nombre del trabajador?");
        nombre = sc.nextLine();
        System.out.println("¿Cuántos años de servicio tiene el trabajador?");
        antiguedad = sc.nextInt();
        System.out.println("¿Cuál es la clave del departamento?");
        clave = sc.nextInt();
        // Condicionales
        // Departamento 1
        if(clave==1){
            if(antiguedad==1){
                System.out.println(nombre + " derecho a 6 días");
            }
            else if(antiguedad>=2 && antiguedad<=6){
                System.out.println(nombre + " derecho a 14 días");
            }
            else if(antiguedad>=7){
                System.out.println(nombre + " derecho a 20 días");
            }
            else{
                System.out.println("Aún no tienes derecho a vacaciones");
            }
        }
        // Departamento 2
        else if(clave==2){
            if(antiguedad==1){
                System.out.println(nombre + " derecho a 7 días");
            }
            else if(antiguedad>=2 && antiguedad<=6){
                System.out.println(nombre + " derecho a 15 días");
            }
            else if(antiguedad>=7){
                System.out.println(nombre + " derecho a 22 días");
            }
            else{
                System.out.println("Aún no tienes derecho a vacaciones");
            }
        }
        // Departamento 3
        else if(clave==3){
            if(antiguedad==1){
                System.out.println(nombre + " derecho a 10 días");
            }
            else if(antiguedad>=2 && antiguedad<=6){
                System.out.println(nombre + " derecho a 20 días");
            }
            else if(antiguedad>=7){
                System.out.println(nombre + " derecho a 30 días");
            }
            else{
                System.out.println("Aún no tienes derecho a vacaciones");
            }
        }
        // Si el departamento es inválido
        else{
            System.out.println("Código de departamento incorrecto");
        }
    }
}
// Rubén C.G.