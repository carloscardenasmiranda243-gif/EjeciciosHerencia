public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico de animales
        Animal[] misMascotas = {
            new Perro("Bruno", "Golden Retriever"),
            new Gato("Luna", "Blanco"),
            new Pajaro("Kiko", 0.35)
        };

        System.out.println("=== INTERACCIÓN DINÁMICA CON LA JERARQUÍA ==_\n");

        for (Animal mascota : misMascotas) {
            System.out.println("----------------------------------------");
            
            // Polimorfismo en acción
            mascota.comer();
            mascota.hacerSonido();
            mascota.moverse();

            // Identificación de tipo específico mediante instanceof
            if (mascota instanceof Perro) {
                Perro perro = (Perro) mascota;
                perro.traerObjeto();
                System.out.println("-> Linaje/Raza: " + perro.getLinaje());
            } 
            else if (mascota instanceof Gato) {
                Gato gato = (Gato) mascota;
                gato.rasgunar();
                System.out.println("-> Tono de pelaje: " + gato.getTonoPelaje());
            } 
            else if (mascota instanceof Pajaro) {
                Pajaro pajaro = (Pajaro) mascota;
                pajaro.volar();
                System.out.println("-> Dimensión alar: " + pajaro.getDimensionAlar() + " m");
            }
        }
        System.out.println("----------------------------------------");
    }
}