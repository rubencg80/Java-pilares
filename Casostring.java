// Programa para comparar un dato tipo string y eliminar el espacio que genera una entrada de dato tipo int  
import java.util.Scanner;
    public class Casostring{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ingresa un nomnre");
            String nombre = sc.nextLine();
            System.out.println("Ingrese edad");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("ingresa apellido");
            String apellido=sc.nextLine();

         while (nombre.equals("juan")){
                System.out.println(nombre);
                System.out.println(edad);
                System.out.println(apellido);
                System.out.println("ingresa otro nombre");
                nombre=sc.nextLine();
        }
    }
}
// Rubén C.G.
