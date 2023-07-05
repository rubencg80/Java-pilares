public class Ordins{
    public static void main(String[] args) {
        int[] arreglo = {50,20,40,80,30};
        int posicion;
        int auxiliar;
        for(int i = 0;i<arreglo.length;i++){
            posicion = i;
            auxiliar = arreglo[i];
            while(posicion>0&&arreglo[posicion-1]>auxiliar){
                arreglo[posicion] = arreglo[posicion-1];
                posicion--;
            }
            arreglo[posicion] = auxiliar;
        }
        //Impresión de manera ascendente
        System.out.println("Impresión forma ascendente");
        for(int i = 0;i<arreglo.length;i++){
        System.out.println("el arreglo es: " + arreglo[i]);
        }
        //Impresión de manera descendente:
        System.out.println("Impresión forma descendente");
        for(int i = 4;i>=0;i--){
        System.out.println("el arreglo es: " + arreglo[i]);
        }
    }
}
// Rubén C.G.
