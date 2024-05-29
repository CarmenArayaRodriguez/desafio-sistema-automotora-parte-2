// Clase Bus
public class Bus extends Vehiculo{
    Asientos asientos;

    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.asientos = new Asientos(cantidadDeAsientos);
    }
    // Método para obtener asientos disponibles
    public int asientosDisponibles() {
        return 0;
    }
}