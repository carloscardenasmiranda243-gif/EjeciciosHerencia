public class Gato extends Animal {
    private String tonoPelaje;

    public Gato(String alias, String tonoPelaje) {
        super(alias);
        this.tonoPelaje = tonoPelaje;
    }

    @Override
    public void hacerSonido() {
        System.out.println(alias + " maúlla: ¡Miau!");
    }

    public void rasgunar() {
        System.out.println(alias + " está rascando los muebles.");
    }

    public String getTonoPelaje() {
        return tonoPelaje;
    }

    public void setTonoPelaje(String tonoPelaje) {
        this.tonoPelaje = tonoPelaje;
    }
}