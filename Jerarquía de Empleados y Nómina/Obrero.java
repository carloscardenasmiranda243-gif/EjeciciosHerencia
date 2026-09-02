public class Obrero extends Empleado {
    private double pagoHorasExtra;

    public Obrero(String nombre, String cedula, double sueldoBase, double pagoHorasExtra) {
        super(nombre, cedula, sueldoBase);
        this.pagoHorasExtra = pagoHorasExtra;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + pagoHorasExtra;
    }
}