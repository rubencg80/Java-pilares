import javax.swing.*; 
import java.awt.event.*; // Detecta todas las acciones dentro de la computaora

public class CajaTexto extends JFrame implements ActionListener{

    private JTextField cajatexto1;
    private JTextField cajatexto2;
    private JTextField cajatexto3;
    private JLabel texto1;
    private JLabel texto2;
    private JButton boton1;
    private JButton boton2;

    public CajaTexto(){ // Método constructor, vacío para agregar contenido posteriormente
        setLayout(null); // Se indica que el tamaño no sea estandar, sino que se dará manualmente
        cajatexto1 = new JTextField(); // Se crea una caja de texto
        cajatexto1.setBounds(10,10,350,20); // Tamaño de la caja de texto
        add(cajatexto1);

        cajatexto2 = new JTextField(); // Se crea una segunda caja de texto
        cajatexto2.setBounds(10,70,350,20);
        add(cajatexto2);

        // Se agrega un cuadro de texto
        texto1 = new JLabel("Ingresa tu nombre");
        texto1.setBounds(10,7,200,100);
        add(texto1);

        cajatexto3=new JTextField(); // Se crea una tercera caja de texto
        cajatexto3.setBounds(10,120,350,20);
        add(cajatexto3);

        // Se agrega un segundo cuadro de texto
        texto2 = new JLabel("Ingresa tu apellido");
        texto2.setBounds(10,50,200,100);
        add(texto2);

        // Se agrega el botón 1
        boton1 = new JButton("Enviar");
        boton1.setBounds(10,150,100,30);
        add(boton1);
        boton1.addActionListener(this); // Esta línea hace que se detecte el momento en el que se presiona el botón, lo que pasa al accionarlo se coloca en el public static void main actionPerformed

        // Se agrega el botón 2
        boton2 = new JButton("Borrar");
        boton2.setBounds(150,150,100,30);
        add(boton2);
        boton2.addActionListener(this);
    }

    // Funcionalidad de los botones y de la biblioteca de listener
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==boton1){
            String nombre = cajatexto2.getText();
            String apellido = cajatexto3.getText();
            cajatexto1.setText(nombre + " " + apellido);
        }
        if(evento.getSource()==boton2){
            cajatexto1.setText("");
            cajatexto2.setText("");
            cajatexto3.setText("");
        }
    }

    public static void main(String[] args){
        CajaTexto ventana1 = new CajaTexto(); // Se crea el elemento ventana1 de la clase CajaTexto
        ventana1.setBounds(50,50,400,300); // Configuración del tamaño de la ventana, ultimos dos datos: anchura y altura
        ventana1.setVisible(true); // Hace visible la ventana
        ventana1.setResizable(false); // Impide mover el tamaño de la ventana
    }
}