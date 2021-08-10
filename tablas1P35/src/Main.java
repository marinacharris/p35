import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Main extends JFrame{

    public Main(){
        String[] nombreColumnas = {"Nombre", "Edad", "Extranjero"};
        Object[][] datos = {
            {"Ana", 25, false},
            {"Jean", 35, true},
            {"Carlos", 20, false}
        };
        DefaultTableModel modelo = new DefaultTableModel(datos, nombreColumnas);
        JTable tabla = new JTable(modelo);

        String[] columnaNueva= {"Contadora", "Ingeniero", "Estudiante"};
        modelo.addColumn("Profesion", columnaNueva);

        Object[] nuevaFila = {"María", 28, false, "Enfermera"};
        modelo.addRow(nuevaFila);
        modelo.addRow(nuevaFila);
        modelo.addRow(nuevaFila);
        modelo.addRow(nuevaFila);
        modelo.addRow(nuevaFila);
        modelo.addRow(nuevaFila);

        modelo.setValueAt("Ana María", 0, 0);

        tabla.setPreferredScrollableViewportSize(new Dimension(250,100));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);


    }
    public static void main(String[] args) throws Exception {
       Main ventana = new Main();
       ventana.pack();
       ventana.setVisible(true);
       ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
