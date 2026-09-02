public class Vehiculo {
    protected String modelo;
    protected int año;
    protected double velocidad;

    public Vehiculo(String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
        this.velocidad = 0.0;
    }

    public void acelerar() {
        this.velocidad += 10.0;
    }

    public void frenar() {
        if (this.velocidad >= 10.0) {
            this.velocidad -= 10.0;
        } else {
            this.velocidad = 0.0;
        }
    }

    public String obtenerModelo() {
        return modelo;
    }

    public void mostrarDetalles() {
        System.out.println("Modelo: " + modelo + " | Año: " + año + " | Velocidad: " + velocidad + " km/h");
    }
}