public class Supervisor extends Empleado {
    private double compensacion;

    public Supervisor(String nombre, String cedula, double sueldoBase, double compensacion) {
        super(nombre, cedula, sueldoBase);
        this.compensacion = compensacion;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + compensacion;
    }
}