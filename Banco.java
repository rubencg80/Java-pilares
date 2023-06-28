/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

public class Banco {

    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta("Ruben",200.32);
        Cuenta cuenta2 = new Cuenta("Diana",153.21);
        Cuenta cuenta3 = new Cuenta("Juan",350.89);
        Cuenta cuenta4 = new Cuenta("Ines",400.45);
        
        cuenta1.mostrar();
        cuenta2.mostrar();
        cuenta3.mostrar();
        cuenta4.mostrar();
        cuenta1.ingresar();
        cuenta1.retirar();
    }
    
}
