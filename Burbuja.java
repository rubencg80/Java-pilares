public class burbuja{
    public static void main(String[] args){
        int[] arreglo = {11,23,9,20};
        int auxiliar;
        for(int i=0;i<arreglo.length;i++){
            for(int j=0;j<(arreglo.length-1);j++){
                if(arreglo[j]>arreglo[j+1]){
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
        System.out.println("El arreglo ordenado es: ");
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
} 
// Rubén C.G.