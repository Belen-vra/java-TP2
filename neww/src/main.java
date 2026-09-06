import javax.swing.*; 
import java.awt.*; 

public class Main extends JFrame {
    private JTextField txtNombre, txtPrecio, txtStock;
    private JButton btnRegistrar;
    private JTextArea txtResultado;


    public Main() {
        setTitle("Sistema de Productos"); 
        setSize(400, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblPrecio = new JLabel("Precio:");
        JLabel lblStock = new JLabel("Stock:");

        txtNombre = new JTextField();
        txtPrecio = new JTextField();
        txtStock = new JTextField();
        btnRegistrar = new JButton("Registrar"); 
        txtResultado = new JTextArea(); 
        txtResultado.setEditable(false); 

        setLayout(new GridLayout(5, 2, 10, 10));
        add(lblNombre); 
        add(txtNombre); 
        add(lblPrecio); 
        add(txtPrecio); 
        add(lblStock); 
        add(txtStock); 
        add(new JLabel("")); 
        add(btnRegistrar); 
        add(new JLabel("Resultado:")); 
        add(new JScrollPane(txtResultado)); 

        btnRegistrar.addActionListener(e -> registrarProducto());
        setVisible(true); 
    }

    private void registrarProducto() {
        String nombre = txtNombre.getText(); 
        double precio = Double.parseDouble(txtPrecio.getText()); 
        int stock = Integer.parseInt(txtStock.getText()); 

        Producto producto = new Producto(nombre, precio, stock); 
        txtResultado.setText(producto.mostrarInformacion()); 
    }
    public static void main(String[] args) {
        new Main(); 
    }
}