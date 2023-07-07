import javax.swing.*;
public class Graficos extends JFrame{
    public Graficos(){
        setLayout(null);
        /*etiqueta1 = new JLabel("Hola mundo");
        etiqueta1.setBounds(10,20,300,400);
        add(etiqueta1);
        No permite crear el molde*/
    }
    public static void main(String[] args){
        Graficos grafica1 = new Graficos(); 
        grafica1.setBounds(0,0,300,300);
        grafica1.setVisible(true);
        grafica1.setLocationRelativeTo(null);
    }
} 

