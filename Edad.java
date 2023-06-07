// Programa que calcula la edad de una persona pidiendo su año de nacimiento
import java.util.Scanner;
public class Edad {
    public static void main(String[] args) {
        int yractual = java.time.Year.now().getValue();
        int yrnac;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu año de nacimiento");
        yrnac = sc.nextInt();
        if(yrnac >= 1923 && yrnac <= 2013) {
            edad = yractual - yrnac;
            System.out.println("Tu edad es de: " + edad);
            if(edad >= 10 && edad <= 14) {
                System.out.println("Eres un niño");
            }
            if(edad >= 15 && edad <= 18) {
                System.out.println("Eres un adolescente");
            }
            if(edad >= 18 && edad <= 25) {
                System.out.println("Eres un joven");
            }
            if(edad >= 26 && edad <= 35) {
                System.out.println("Eres un adulto joven");
            }
            if(edad >= 36 && edad <= 60) {
                System.out.println("Eres un adulto");
            }
            if(edad > 60) {
                System.out.println("Eres una persona de la tercera edad");
            }
        }
        else{
            System.out.println("Ingresa un año entre 1923 y 2013, si tienes más de 100 años contáctanos con el siguiente número:");
        }
    }
}