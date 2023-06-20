// Programa que crea matrices del tamaño que el usuario requiera
import java.util.Scanner;
public class Matrices{
    public static void main(String[] args){
        // Inicia la declaración de variables y el encendido del scanner
        int filas;
        int columnas;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        // Se pregunta el número de filas y columnas
        System.out.println("Ingresa el número de filas: ");
        filas = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el número de columnas: ");
        columnas = sc.nextInt();
        sc.nextLine();
        int numeros [][] = new int[filas][columnas];
        // Inicia el ciclo for para asignar números e imprimir la matriz
        for(int j=0;j<filas;j++){
            for(int i=0;i<columnas;i++){
                numeros[j][i] = contador;
                contador++;
                if(i<columnas){
                    System.out.print("[" + numeros[j][i] + "]");
                }
            }
            System.out.println("");
        }
    }
}
// Rubén C.G.

// Nota: [j][i] [j]: Filas [i]: Columnas. En la sintáxis de java primero se toma en cuenta la j, luego la i [j][i]