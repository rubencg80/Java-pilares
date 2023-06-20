// Programa para sumar dos matrices de misma dimensión
public class Sumamatrices{
    public static void main(String[] args){
    int [][] matrizA = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    int [][] matrizB = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
    int filas = matrizA.length;
    int columnas = matrizB.length;
    int [][] matrizC = new int [filas][columnas];
    
    System.out.println("");
    System.out.println("Valores de la matriz A");
    for(int j=0;j<filas;j++){
        for(int i=0;i<columnas;i++){
            System.out.print("[" + matrizA[j][i] + "]");
        }
        System.out.println("");
    }
    System.out.println("");

    System.out.println("Valores de la matriz B");
    for(int j=0;j<filas;j++){
        for(int i=0;i<columnas;i++){
            System.out.print("[" + matrizB[j][i] + "]");
        }
        System.out.println("");
    }
    System.out.println("");

    System.out.println("Valores de la matriz C");
    for(int j=0;j<filas;j++){
        for(int i=0;i<columnas;i++){
            matrizC [j][i] = matrizA[j][i] + matrizB[j][i];
            System.out.print("[" + matrizC[j][i] + "]");
        }
        System.out.println("");
    }
    System.out.println("");
    }
}
// Rubén C.G.