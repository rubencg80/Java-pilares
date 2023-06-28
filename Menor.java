/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author PILARES
 */
public class Menor extends Usuario{
    String tutor;

    public Menor(String tutor, String nombre, String apellido, String direccion, String numerotel, int edad) {
        super(nombre, apellido, direccion, numerotel, edad);
        this.tutor = tutor;
    }

    public Menor(String tutor) {
        this.tutor = tutor;
    }

    public String getTutor() {
        return tutor;
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

    public void setTutor(String tutor) {
        this.tutor = tutor;
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
    
}
