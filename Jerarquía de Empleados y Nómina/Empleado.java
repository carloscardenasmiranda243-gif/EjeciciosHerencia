public abstract class Empleado {
    protected String nombre;
    protected String cedula;
    protected double sueldoBase;
    protected int id;

    // Variables estáticas para el control global
    protected static int totalEmpleados = 0;
    protected static int proximoId = 1001;

    public Empleado(String nombre, String cedula, double sueldoBase) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldoBase = sueldoBase;
        this.id = proximoId++;
        totalEmpleados++;
    }

    public abstract double calcularSalario();

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
}