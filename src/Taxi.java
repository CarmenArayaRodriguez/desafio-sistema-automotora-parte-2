// Clase Taxi
public class Taxi extends Vehiculo {
    int valorPasaje;

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    // Método para pagar pasaje
    public void pagarPasaje(int pasaje) {
    }
}