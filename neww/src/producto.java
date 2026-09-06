public class producto {
    private String nombre;
    private double precio;
    private int stock;

    public producto(String nombre, double precio, int stock) {
        this.nombre = nombre; 
        this.precio = precio; 
        this.stock = stock; 
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String mostrarInformacion() {
        return "Producto: " + nombre +
               "\nPrecio: $" + precio +
               "\nStock: " + stock;
    }
}
