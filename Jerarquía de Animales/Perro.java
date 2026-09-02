public class Perro extends Animal {
    private String linaje;

    public Perro(String alias, String linaje) {
        super(alias);
        this.linaje = linaje;
    }

    @Override
    public void hacerSonido() {
        System.out.println(alias + " ladra: ¡Guau, guau!");
    }

    public void traerObjeto() {
        System.out.println(alias + " está trayendo el objeto.");
    }

    public String getLinaje() {
        return linaje;
    }

    public void setLinaje(String linaje) {
        this.linaje = linaje;
    }
}