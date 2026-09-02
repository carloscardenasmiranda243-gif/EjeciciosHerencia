public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String modelo, int año, int puertas) {
        super(modelo, año);
        this.puertas = puertas;
    }

    public int obtenerPuertas() {
        return puertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Auto - Modelo: " + modelo + " | Año: " + año + " | Puertas: " + puertas + " | Velocidad: " + velocidad + " km/h");
    }
}