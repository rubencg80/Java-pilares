/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Scanner;
public class Cuenta {
    String titular;
    double cantidad;
    double cant;
    
    Scanner sc = new Scanner(System.in);

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Cuenta(){
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }
    

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void mostrar() {
        System.out.println("Titular: " + titular);
        System.out.println("Cantidad: " + cantidad);
    }
    
    public void ingresar() {
        System.out.println("Introduce la cantidad a ingresar:");
        cant = sc.nextDouble();
        sc.nextLine();
        cantidad = cantidad + cant;
        System.out.println("Su nuevo saldo es:" + cantidad);
    }
        
    public void retirar() {
        System.out.println("Introduce la cantidad a retirar:");
        cant = sc.nextDouble();
        sc.nextLine();
        cantidad = cantidad - cant;
        System.out.println("Su nuevo saldo es:" + cantidad);
    }
}
