
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mensajes extends JFrame implements ActionListener{
    private JButton boton1;
    private FlowLayout diseno1;

    public Mensajes(){
        diseno1 = new FlowLayout(FlowLayout.CENTER,5,5);
        setLayout(diseno1);
        boton1 = new JButton("Botón 1");
        add(boton1);
        boton1.addActionListener(this);
      
    }
    public static void main(String[] args) throws Exception {
        //JOptionPane.showMessageDialog(null, "Hola mundo");
        //JOptionPane.showMessageDialog(null, "Esto es un aprueba", "Ventana de prueba", JOptionPane.ERROR_MESSAGE);
        Mensajes ventana = new Mensajes();
        ventana.setSize(800,800);
        ventana.setTitle("Mensajes");
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1){
            JOptionPane.showMessageDialog(this, "hola mundo");        
            
        }
    }
}
