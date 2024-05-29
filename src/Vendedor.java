// Clase Vendedor
public class Vendedor extends Persona{
    String direccion;

    public Vendedor(String nombre, String rut, String direccion) {
        super(nombre, rut);
        this.direccion = direccion;
    }
}
