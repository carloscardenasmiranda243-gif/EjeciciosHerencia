public class Maain {
    public static void main(String[] args) {
        
        Vehiculo[] flota = new Vehiculo[4];

        flota[0] = new Auto("Toyota Corolla", 2022, 4);
        flota[1] = new AutoDeportivo("Mustang GT", 2024, 2, 280.0);
        flota[2] = new Moto("Yamaha MT-07", 2021);
        flota[3] = new Camion("Volvo FH", 2020, 18000.0);

        System.out.println("--- DETALLES DE LA FLOTA DE VEHÍCULOS ---");
        for (Vehiculo v : flota) {
            v.mostrarDetalles();
        }
    }
}