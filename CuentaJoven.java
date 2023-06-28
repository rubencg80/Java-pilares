/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author PILARES
 */
public class CuentaJoven extends Cuenta{
    String tutor;
    int edadtutor;
    boolean mayor;
    double bonificacion = 1.1; // Bonificación del 10%

    public CuentaJoven(String tutor, String titular, double cantidad) {
        super(titular, cantidad);
        this.tutor = tutor;
    }

    public CuentaJoven(String tutor) {
        this.tutor = tutor;
    }

    public String getTutor() {
        return tutor;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getCant() {
        return cant;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setCant(double cant) {
        this.cant = cant;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    public void titularValido() {
        System.out.println("Introduce la edad del tutor");
        edadtutor = sc.nextInt();
        sc.nextLine();
        if(edadtutor>=25){
            mayor=true;
            System.out.println("El tutor es válido: "+mayor);
        }
        else{
            mayor=false;
            System.out.println("El tutor no es válido: "+mayor);
        }
    }
    
    public void mostrar(){
        System.out.println("Cuenta joven");
        System.out.println("Bonificación de la cuenta: 1.1");
    }
}
