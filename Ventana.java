import javax.swing.*;
public class Ventana extends JFrame {
    private JLabel ventana1;
    private JLabel ventana2;

    public Ventana(){
        setLayout(null);
        ventana1 = new JLabel("Ventana 1"); // Instanciación de un objeto layout
        ventana1.setBounds(110,110,100,100); // Desplazamiento horizontal, desplazamiento vertical
        add(ventana1);
        
        ventana2 = new JLabel("Bienvenidos al programa de java");
        ventana2.setBounds(50,130,1000,100);
        add(ventana2);
    }

    public static void main(String args[]){
        Ventana ventana1 = new Ventana();
        ventana1.setBounds(0,0,300,400); // x, y, anchura, altura
        ventana1.setVisible(true);
    }
}

