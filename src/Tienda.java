import java.util.ArrayList;

public class Tienda {
    Vendedor vendedor;
    // Lista de clientes
    ArrayList<Cliente> clientes;
    String nombreTienda;
    int stock;


    // Constructor
    public Tienda(String nombreTienda, int stock, Vendedor vendedor) {
        this.nombreTienda = nombreTienda;
        this.stock = stock;
        this.vendedor = vendedor;
        this.clientes = new ArrayList<>();
    }

    // Método para verificar stock
    public String existeStock() {
        return "Cantidad de stock: " + stock;
    }
}
