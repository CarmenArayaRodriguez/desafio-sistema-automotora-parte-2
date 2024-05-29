// Clase MiniBus
public class MiniBus extends  Vehiculo{
    String tipoViaje;
    Asientos asientos;

    public MiniBus(String color, String patente, String tipoviaje, int cantidadDeAsientos) {
        super(color, patente);
        this.tipoViaje = tipoviaje;
        this.asientos = new Asientos(cantidadDeAsientos);
    }

    // Método para imprimir detalles del bus
    public void imprimeBus() {
    }
}