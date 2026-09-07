import javax.swing.*; 
import java.awt.*; 

public class main extends JDialog {
    private JTextField txtNombre, txtCarrera, txtCurso;
    private JButton btnRegistrar;
    private JTextArea txtResultado;


    public main() {
        setTitle("Registro de alumnos LSI:"); 
        setSize(380, 420); 
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); 
        setLocationRelativeTo(null); 
        getContentPane().setBackground(new Color(230, 240, 255));

        JLabel lblNombre = new JLabel("Ingresa tu Nombre:");
        JLabel lblCarrera = new JLabel("Ingresa tu Carrera:");
        JLabel lblCurso = new JLabel("Cual es tu Curso?:");

        txtNombre = new JTextField();
        txtCarrera = new JTextField();
        txtCurso = new JTextField();
        btnRegistrar = new JButton("REGISTRAR"); 
        btnRegistrar.setBackground(new Color(70, 130, 180));
        btnRegistrar.setForeground(Color.WHITE);
        txtResultado = new JTextArea(); 
        txtResultado.setEditable(false); 

        setLayout(new GridLayout(5, 2, 30, 40));
        add(lblNombre); 
        add(txtNombre); 
        add(lblCarrera); 
        add(txtCarrera); 
        add(lblCurso); 
        add(txtCurso); 
        add(new JLabel("")); 
        add(btnRegistrar); 
        add(new JLabel("Registrado correctamente:")); 
        add(new JScrollPane(txtResultado)); 

        btnRegistrar.addActionListener(e -> registrarAlumno());
        setVisible(true); 
    }

    private void registrarAlumno() {
        String nombre = txtNombre.getText(); 
        String carrera = txtCarrera.getText(); 
        String curso = txtCurso.getText(); 
        if (nombre.isEmpty() || carrera.isEmpty() || curso.isEmpty()) {
        JOptionPane.showMessageDialog(
            this,
            "Por favor, complete todos los campos.",
            "Datos incompletos",
            JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        alumno alumno = new alumno(nombre, carrera, curso); 
        txtResultado.setText(alumno.mostrarInformacion()); 
    }
    public static void main(String[] args) {
        new main(); 
    }
}