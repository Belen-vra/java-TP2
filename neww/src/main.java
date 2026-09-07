import javax.swing.*; 
import java.awt.*; 

public class main extends JFrame {
    private JTextField txtNombre, txtCarrera, txtCurso;
    private JButton btnRegistrar;
    private JTextArea txtResultado;


    public main() {
        setTitle("Registro de alumnos LSI:"); 
        setSize(400, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblCarrera = new JLabel("Carrera");
        JLabel lblCurso = new JLabel("Curso");

        txtNombre = new JTextField();
        txtCarrera = new JTextField();
        txtCurso = new JTextField();
        btnRegistrar = new JButton("Registrar"); 
        txtResultado = new JTextArea(); 
        txtResultado.setEditable(false); 

        setLayout(new GridLayout(5, 2, 10, 10));
        add(lblNombre); 
        add(txtNombre); 
        add(lblCarrera); 
        add(txtCarrera); 
        add(lblCurso); 
        add(txtCurso); 
        add(new JLabel("")); 
        add(btnRegistrar); 
        add(new JLabel("Resultado:")); 
        add(new JScrollPane(txtResultado)); 

        btnRegistrar.addActionListener(e -> registrarAlumno());
        setVisible(true); 
    }

    private void registrarAlumno() {
        String nombre = txtNombre.getText(); 
        String carrera = txtCarrera.getText(); 
        String curso = txtCurso.getText(); 

        producto producto = new producto(nombre, carrera, curso); 
        txtResultado.setText(producto.mostrarInformacion()); 
    }
    public static void main(String[] args) {
        new main(); 
    }
}