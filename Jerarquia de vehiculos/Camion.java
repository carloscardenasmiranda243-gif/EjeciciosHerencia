public class Camion extends Vehiculo {
    private double cargaMaxima;

    public Camion(String modelo, int año, double carga) {
        super(modelo, año);
        this.cargaMaxima = carga;
    }

    public void cargar(double peso) {
        if (peso <= cargaMaxima) {
            System.out.println("Carga de " + peso + " kg realizada con éxito.");
        } else {
            System.out.println("Exceso de carga. Capacidad máxima: " + cargaMaxima + " kg.");
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Camión - Modelo: " + modelo + " | Año: " + año + " | Carga Máx: " + cargaMaxima + " kg | Velocidad: " + velocidad + " km/h");
    }
}