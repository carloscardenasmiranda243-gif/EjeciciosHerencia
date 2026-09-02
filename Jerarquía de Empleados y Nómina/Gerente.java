public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, String cedula, double sueldoBase, double bono) {
        super(nombre, cedula, sueldoBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + bono;
    }
}