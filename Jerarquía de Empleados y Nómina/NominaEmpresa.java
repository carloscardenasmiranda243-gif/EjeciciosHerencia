
public class NominaEmpresa {
    public static void main(String[] args) {
        // Creación de un arreglo o lista de empleados (ejemplo con los datos de la terminal)
        Empleado[] empleados = {
            new Gerente("Laura", "12345", 4000.00, 1000.00),
            new Gerente("Roberto", "12346", 4500.00, 1125.00),
            new Supervisor("Ana", "12347", 2500.00, 375.00),
            new Supervisor("Pedro", "12348", 2700.00, 405.00),
            new Obrero("Carlos", "12349", 1200.00, 300.00),
            new Obrero("Maria", "12350", 1250.00, 350.00),
            new Obrero("Juan", "12351", 1200.00, 350.00),
            new Obrero("Sofia", "12352", 1220.00, 360.00)
        };

        double totalNomina = 0;

        // Iterar y mostrar la información tal como sale en la consola
        for (Empleado emp : empleados) {
            double salarioFinal = emp.calcularSalario();
            totalNomina += salarioFinal;
            
            // Determinar el cargo según la instancia
            String cargo = "";
            if (emp instanceof Gerente) {
                cargo = "Gerente";
            } else if (emp instanceof Supervisor) {
                cargo = "Supervisor";
            } else if (emp instanceof Obrero) {
                cargo = "Obrero";
            }

            System.out.printf("[%d] %s - %s - $%.2f%n", emp.getId(), emp.getNombre(), cargo, salarioFinal);
        }

        System.out.println("\nTotal: $" + String.format("%.2f", totalNomina));
        System.out.println("Total empleados: " + Empleado.getTotalEmpleados());
    }
}