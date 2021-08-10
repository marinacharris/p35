

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
//import javax.swing.*;

public class Formulario extends JFrame implements ActionListener, ChangeListener {
    
    private JLabel etiqueta1, etiqueta2, etiqueta3;
    private JTextField texto1, texto2;
    private JButton boton1, boton2;
    private JComboBox<String> combo1;
    private JTextArea textoA;
    private JScrollPane scroll1;
    private JCheckBox check1, check2, check3;
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup grupoRB;



    //constructor
    public Formulario(){
        setLayout(null);
        etiqueta1 = new JLabel("Nombre");
        etiqueta1.setBounds(30, 30, 150, 30);
        add(etiqueta1);

        texto1 = new JTextField();
        texto1.setBounds(100, 30, 100, 20);
        add(texto1);

        etiqueta2 = new JLabel("Apellido");
        etiqueta2.setBounds(30, 80, 150, 30);
        add(etiqueta2);

        texto2 = new JTextField();
        texto2.setBounds(100, 80, 100, 20);
        add(texto2);

        boton1 = new JButton("Unir");
        boton1.setBounds(30, 130, 80, 30);
        add(boton1);
        boton1.addActionListener(this);

        etiqueta3 = new JLabel("");
        etiqueta3.setBounds(150, 130, 150, 30);
        add(etiqueta3);

        boton2 = new JButton("Limpiar");
        boton2.setBounds(30,180, 80, 30);
        add(boton2);
        boton2.addActionListener(this);

        combo1 = new JComboBox<String>();
        combo1.setBounds(240, 30, 100, 20);
        add(combo1);
        combo1.addItem("Colombia");
        combo1.addItem("Venezuela");
        combo1.addItem("Perú");
        combo1.addItem("Ecuador");
        combo1.addItem("Panamá");
        combo1.addItem("Brasil");
        combo1.addActionListener(this);

        textoA = new JTextArea();
        scroll1 = new JScrollPane(textoA);
        scroll1.setBounds(30, 230, 200, 100);
        add(scroll1);

        check1 = new JCheckBox("Español");
        check1.setBounds(240, 80, 80,20);
        check1.addChangeListener(this);
        add(check1);
        check2 = new JCheckBox("Inglés");
        check2.setBounds(240, 100, 80 ,20);
        check2.addChangeListener(this);
        add(check2);
        check3 = new JCheckBox("Alemán");
        check3.setBounds(240,120,80,20);
        check3.addChangeListener(this);
        add(check3);

        grupoRB = new ButtonGroup();

        radio1 = new JRadioButton("Amarillo");
        radio1.setBounds(240, 160, 80,20);
        radio1.addChangeListener(this);
        add(radio1);
        grupoRB.add(radio1);

        radio2 = new JRadioButton("Azul");
        radio2.setBounds(240, 180, 80,20);
        radio2.addChangeListener(this);
        add(radio2);
        grupoRB.add(radio2);
        
        radio3 = new JRadioButton("Rojo");
        radio3.setBounds(240, 200, 80,20);
        radio3.addChangeListener(this);
        add(radio3);
        grupoRB.add(radio3);
    }
    public static void main(String[] args) throws Exception {
        /*
        JFrame ventana = new JFrame();
        ventana.setBounds(20,20, 200,200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        Formulario ventana = new Formulario();
        ventana.setBounds(100,20, 400,400); //columna, fila, ancho, alto
        ventana.setTitle("Datos Básicos");
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1){
            etiqueta3.setText(texto1.getText()+" "+texto2.getText()+" "+combo1.getSelectedItem());
        }
        if (e.getSource()==boton2){
            texto1.setText("");
            texto2.setText("");
        }
        if (e.getSource()==combo1){
            etiqueta3.setText(texto1.getText()+" "+texto2.getText()+" "+combo1.getSelectedItem());
        }


        
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        String cadena ="";
        if (check1.isSelected()){
            cadena = cadena + "Español-";
        }
        if (check2.isSelected()){
            cadena = cadena + "Inglés-";
        }
        if (check3.isSelected()){
            cadena = cadena + "Alemán-";
        }
        setTitle(cadena);
        if (radio1.isSelected()){
            this.getContentPane().setBackground(Color.YELLOW);            
        }
        if (radio2.isSelected()){
            this.getContentPane().setBackground(Color.BLUE);            
        }
        if (radio3.isSelected()){
            this.getContentPane().setBackground(Color.RED);            
        }
    }
}
