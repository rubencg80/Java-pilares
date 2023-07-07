import javax.swing.*;
import java.awt.event.*;  
public class Boton2 extends JFrame implements ActionListener {
    private JButton boton1,boton2,boton3;
    private JLabel etiqueta1;

    public Boton2(){
        setLayout(null);
        boton1=new JButton("boton 1");
        boton1.setBounds(20,100,90,30);//a la derecha, abajo
        add(boton1);
        boton1.addActionListener(this);

        boton2=new JButton("boton 2");
        boton2.setBounds(120,100,90,30);//a la derecha, abajo
        add(boton2);
        boton2.addActionListener(this);

        boton3=new JButton("boton 3");
        boton3.setBounds(220,100,90,30);//a la derecha, abajo
        add(boton3);
        boton3.addActionListener(this);

        etiqueta1=new JLabel("Elige una opción");
        etiqueta1.setBounds(10,10,300,300);
        add(etiqueta1);
    }

    //Eventos
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==boton1){
            etiqueta1.setText("Elegiste el 1");
        }
        if(evento.getSource()==boton2){
            etiqueta1.setText("Elegiste el 2");
        }
        if(evento.getSource()==boton3){
            etiqueta1.setText("Elegiste el 3");
        }
    }

    public static void main(String args[]){
        Boton2 boton1 = new Boton2();
        boton1.setBounds(50,50,350,350);
        boton1.setVisible(true);
        boton1.setResizable(false);
    }
}