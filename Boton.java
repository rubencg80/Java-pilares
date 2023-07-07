import javax.swing.*;
import java.awt.event.*;  //botones es diseño y evento
public class Boton extends JFrame implements ActionListener {//debe escuchar
    private JButton boton1;//no lo estamos inicializando solo declarando
    public Boton(){
        setLayout(null);
        boton1 = new JButton("cerrar");
        boton1.setBounds(170,120,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    //ariba es el diseño abajo la funcionalidad
    public void actionPerformed(ActionEvent evento){// e es donde se guarda el evento
        if(evento.getSource() == boton1){//valida si donde se origino el clic fue en el boton
            System.exit(0); //cerrar la ventana
        }
    }

    //diseño de la interfaz gráfica
    public static void main(String args[]){
        Boton boton1 =new Boton();
        boton1.setBounds(50,50,450,350);
        boton1.setVisible(true);
    }
}

