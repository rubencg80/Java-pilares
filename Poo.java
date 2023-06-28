/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;
/**
 *
 * @author PILARES
 */
public class Poo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario1 = new Usuario("Juan", "Perez", "Azcapotzalco", "5512364987", 33);
        System.out.println("Nombre: " + usuario1.getNombre());
        System.out.println("Apellido: " + usuario1.getApellido());
        System.out.println("Dirección: " + usuario1.getDireccion());
        System.out.println("Número de teléfono: " + usuario1.getNumerotel());
        System.out.println("Edad: " + usuario1.getEdad());
        usuario1.setNombre("Rub\u00e9n");
        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Rubén");
        usuario2.setApellido("Campos");
        usuario2.setDireccion("Estado de méxico");
        usuario2.setNumerotel("5523987416");
        usuario2.setEdad(22);
        System.out.println("Nombre: " + usuario2.getNombre());
        System.out.println("Apellido: " + usuario2.getApellido());
        System.out.println("Dirección: " + usuario2.getDireccion());
        System.out.println("Número de teléfono: " + usuario2.getNumerotel());
        System.out.println("Edad: " + usuario2.getEdad());
        Menor menor1 = new Menor("tutor1", "diana", "gonzalez", "cdmx", "55486278193", 14);
        System.out.println("Tutor: " + menor1.getTutor());
        System.out.println("Nombre: " + menor1.getNombre());
        System.out.println("Apellido: " + menor1.getApellido());
        System.out.println("Dirección: " + menor1.getDireccion());
        System.out.println("Número de teléfono: " + menor1.getNumerotel());
        System.out.println("Edad: " + menor1.getEdad());
    }
}