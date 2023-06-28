/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author PILARES
 */
public class Usuario {
    String nombre;
    String apellido;
    String direccion;
    String numerotel;
    int edad;
    // Método constructor
    public Usuario(String nombre, String apellido, String direccion, String numerotel, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numerotel = numerotel;
        this.edad = edad;
    }

    public Usuario() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumerotel() {
        return numerotel;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumerotel(String numerotel) {
        this.numerotel = numerotel;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void MostrarDatos (){
        System.out.println("Mostrar datos");        
    }
    public void ModificarDatos(){
        System.out.println("Puedo modificar datos");
    }
}