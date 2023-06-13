//Programa de ejemplo de uso del case y de comparación de cadenas String
import java.util.Scanner;
public class Case{
    public static void main(String[] args){
        int a\u00f1o = 2023;
        int mes;
        String palabra_secreta = "PILARES";
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingresa la palabra secreta par acceder: ");
        String palabra_usuario = sc.nextLine();
        if(palabra_usuario.equalsIgnoreCase(palabra_secreta)){
            int numeroaleatorio = (int)(Math.random()*3+1);
            System.out.println("Estamos en el año: " + año);
            System.out.println("Bienvenido a la elección de case");
            System.out.println("Tu número aleatorio es: " + numeroaleatorio);
numeroaleatorio = 1;
            switch(numeroaleatorio){
            case 1:
                System.out.println("Programa que dice el número de días de un mes determinado");
                System.out.println("Ingresa el número del mes del 1 al 12");
                mes = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa el año");
                año = sc.nextInt();
                sc.nextLine();

                switch(mes){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                    System.out.println("Tiene 31 días");
                break;

                case 4: case 6: case 9: case 11:
                    System.out.println("Tiene 30 días");
                break;

                case 2: 
                if(a\u00f1o%4==0 && a\u00f1o%100!=0){
                    System.out.println("El mes tiene 29 días");
                }
                else{
                    System.out.println("El mes tiene 28 días");
                }
                break;

                default:
                    System.out.println("Número de mes incorrecto");
                break;
                }
            break;


            case 2:
                System.out.println("Programa que diga si un mes es bisciesto o no");
                break;

            case 3:
                System.out.println("Programa que dice el número de mes ingresado");
                break;
            }
        }
        else{
        System.out.println("La palabra no coincide");
        }
    }
}
// Rubén C.G.

//NOTA:
//== Evalua tipo, origen y valor
//equals Evalua el valor de la cadena, pero no de donde viene