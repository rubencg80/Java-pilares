    import java.util.Scanner;
    public class ParesImpares{
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