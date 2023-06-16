//Programa de ejemplo de uso del case y de comparación de cadenas String
import java.util.Scanner;
public class Case{
    public static void main(String[] args){
        //Inicia la delcaración de variables y se llama a la función de Scanner
        int a\u00f1o = 2023;
        int mes;
        String nombremes;
        String palabra_secreta = "PILARES";
        Scanner sc = new Scanner (System.in);
        //Se pregunta la palabra secreta 
        System.out.print("Ingresa la palabra secreta par acceder: "); 
        String palabra_usuario = sc.nextLine();
        //Se compara la palabra, si es correcta, se genera un número aleatorio
        if(palabra_usuario.equalsIgnoreCase(palabra_secreta)){
            int numeroaleatorio = (int)(Math.random()*3+1);
            System.out.println("Estamos en el año: " + año);
            System.out.println("Bienvenido a la elección de case");
            numeroaleatorio = 3;
            System.out.println("Tu número aleatorio es: " + numeroaleatorio);
                //Inicio del switch principal
                switch(numeroaleatorio){
                //Caso 1 del primer switch
                case 1:
                    System.out.println("Programa que dice el número de días de un mes determinado");
                    System.out.println("Ingresa el año");
                    año = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingresa el número del mes del 1 al 12");
                    mes = sc.nextInt();
                    sc.nextLine();
                        //Inicio del switch secundario del caso 1
                        switch(mes){
                        //Casos 1, 3, 5, 7, 8, 10 y 12 del switch secundario del caso 1
                        case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                            System.out.println("Tiene 31 días");
                            break;
                        //Casos 4, 6, 9 y 11 del switch secundario del caso 1
                        case 4: case 6: case 9: case 11:
                            System.out.println("Tiene 30 días");
                            break;
                        //Caso 2 del switch secundario del caso 1
                        case 2: 
                            if(a\u00f1o%4==0 && a\u00f1o%100!=0){
                                System.out.println("El mes tiene 29 días");
                            }
                            else{
                                System.out.println("El mes tiene 28 días");
                            }
                            break;
                        //default del switch secundario del caso 1
                        default:
                            System.out.println("Ingresa un número de mes válido entre el 1 y el 12");
                            break;
                        }
                    break;

                //Caso 2 del primer switch
                case 2:
                    System.out.println("Programa que dice si un año es bisciesto o no");
                    System.out.println("Ingresa el año");
                    año = sc.nextInt();
                    sc.nextLine();
                        if(a\u00f1o%4==0 && a\u00f1o%100!=0){
                            System.out.println("El año es bisciesto");
                        }
                        else{
                            System.out.println("El año no es bisciesto");
                        }
                    break;

                //Caso 3 del primer switch
                case 3:
                    System.out.println("Programa que dice el número de mes ingresado");
                    System.out.println("Ingresa el nombre del mes: ");
                    nombremes = sc.nextLine();
                        switch(nombremes){
                        case "enero":
                            System.out.println("Enero es el mes número 1");
                            break;
                        case "febrero":
                            System.out.println("Enero es el mes número 2");
                            break;
                        case "marzo":
                            System.out.println("Enero es el mes número 3");
                            break;
                        case "abril":
                            System.out.println("Enero es el mes número 4");
                            break;
                        case "mayo":
                            System.out.println("Enero es el mes número 5");
                            break;
                        case "junio":
                            System.out.println("Enero es el mes número 6");
                            break;
                        case "julio":
                            System.out.println("Enero es el mes número 7");
                            break;
                        case "agosto":
                            System.out.println("Enero es el mes número 8");
                            break;
                        case "septiembre":
                            System.out.println("Enero es el mes número 9");
                            break;
                        case "octubre":
                            System.out.println("Enero es el mes número 10");
                            break;
                        case "noviembre":
                            System.out.println("Enero es el mes número 11");
                            break;
                        case "diciembre":
                            System.out.println("Enero es el mes número 12");
                            break;
                        default:
                            System.out.println("El nombre del mes es incorrecto");
                            break;  
                        }
                    break;
                }
        }
        else{
        System.out.println("La palabra clave no coincide");
        }
    }
}
// Rubén C.G.

//NOTA:
//== Evalua tipo, origen y valor
//equals Evalua el valor de la cadena, pero no de donde viene