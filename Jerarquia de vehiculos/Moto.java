public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String modelo, int año) {
        super(modelo, año);
        this.tieneSidecar = false;
    }

    public void agregarSidecar() {
        this.tieneSidecar = true;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Moto - Modelo: " + modelo + " | Año: " + año + " | Sidecar: " + (tieneSidecar ? "Sí" : "No") + " | Velocidad: " + velocidad + " km/h");
    }
}