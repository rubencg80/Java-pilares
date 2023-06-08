//Programa para determinar si un número es par o impar utilizando un ciclo
import java.util.Scanner;
public class Pareseimpares{
    public static void main (String [] args){
        // Se declaran las variables, el scanner y se pregunta el número
        int numero;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa un número entre el 1 y el 10 que no sea decimal: ");
        numero = sc.nextInt();
        // Inicio del ciclo for
        System.out.println("Inicio del ciclo");
        for(int i = 1;i<=10;i++){
            if(i == numero){
                System.out.println("El número " + numero + " es tu número y no será evaluado");
                continue;
            }
            if(i >= 7){
                System.out.println("Has llegado al límite");
                break;
            }
            if(i%2==0){
                System.out.println(i + " Es número par");
            }
            else
            {
                System.out.println(i + " Es número impar");
            }
        }
    }
}
// Rubén C.G.