public class AutoDeportivo extends Auto {
    private double velocidadMaxima;

    public AutoDeportivo(String modelo, int año, int puertas, double velMax) {
        super(modelo, año, puertas);
        this.velocidadMaxima = velMax;
    }

    public void turbo() {
        this.velocidad += 50.0;
        System.out.println("¡Turbo activado! Nueva velocidad: " + velocidad + " km/h");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Auto Deportivo - Modelo: " + modelo + " | Año: " + año + " | Puertas: " + obtenerPuertas() + " | Vel. Máx: " + velocidadMaxima + " km/h | Velocidad Actual: " + velocidad + " km/h");
    }
}