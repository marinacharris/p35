import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout1 extends JFrame implements ActionListener{
    private JButton boton1, boton2, boton3, boton4, boton5;
    private FlowLayout diseno1;
    private FlowLayout diseno2;
    public Layout1(){
        diseno1 = new FlowLayout(FlowLayout.CENTER,3,3);
        setLayout(diseno1);
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");
        
        add(boton1);
        add(boton2);
        add(boton3);
        
        boton1.addActionListener(this);

        diseno2 = new FlowLayout(FlowLayout.RIGHT,3,3);
        setLayout(diseno2);
        boton4 = new JButton("Botón 4");
        boton5 = new JButton("Botón 5");
        add(boton4);
        add(boton5);
    }

    public static void main(String[] args) throws Exception {
        Layout1 ventana = new Layout1();
        ventana.setSize(400,400);
        ventana.setTitle("Ejemplo1");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        diseno1.setHgap(diseno1.getHgap()+5);
        diseno1.setVgap(diseno1.getVgap()+5);
        setLayout(diseno1);
        validate();
        
    }
}
